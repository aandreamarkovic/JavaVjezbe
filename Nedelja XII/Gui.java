import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.nio.file.Files; // Za čitanje fajla
import java.nio.file.Paths; // Putanja do fajla
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JOptionPane; // Za prikaz poruke o grešci, po želji
// Preuzmi spoljni paket https://repo1.maven.org/maven2/org/json/json/, npr. poslednju
//verziju (jar fajl)
// Ucitavanje JAR fajla u projekat
// 1. Desni klik na projekat
// 2. Build Path -> Add External Archives…
// 3. Izaberi json-20210307.jar
// 4. Klikni Apply and Close
import org.json.JSONObject; // JSON objekat (spoljašnja biblioteka)

public class Gui extends JFrame {
	// Label-e za nazive valuta
	private JLabel label1;
	private JLabel label2;
	private JLabel label3;

	// Tekstualna polja za unos vrijednosti za svaku valutu
	private JTextField textField1;
	private JTextField textField2;
	private JTextField textField3;

	// Kursevi koje učitavamo iz JSON fajla
	// EUR -> USD, EUR -> GBP, USD -> GBP
	private double EUR_USD;
	private double EUR_GBP;
	private double USD_GBP;

	// Konstruktor forme
	public Gui() {
		super("Konvertor Valuta");
		// Učitavanje kurseva iz JSON fajla prije bilo kakve logike
		loadRatesFromJson();
		// Ponašanje na X - zatvori prozor i ugasi program
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Širina i visina prozora
		this.setSize(250, 170);
		// Raspored komponenata: redom, slijeva nadesno
		setLayout(new FlowLayout());

		// EUR labela i polje
		label1 = new JLabel("EUR");
		add(label1);
		textField1 = new JTextField(15);
		add(textField1);

		// USD labela i polje
		label2 = new JLabel("USD");
		add(label2);
		textField2 = new JTextField(15);
		add(textField2);

		// GBP labela i polje
		label3 = new JLabel("GBP");
		add(label3);
		textField3 = new JTextField(15);
		add(textField3);

		// Kreiramo jedan handler za sva tri polja
		EventHandler handler = new EventHandler();
		// Kada korisnik pritisne Enter u bilo kom polju, poziva se actionPerformed
		textField1.addActionListener(handler); // unos u EUR
		textField2.addActionListener(handler); // unos u USD
		textField3.addActionListener(handler); // unos u GBP
	}

	/**
	 * Metod koji učitava kurseve iz JSON fajla "rates.json". Primjer sadržaja fajla
	 * (u istom folderu kao .class/.java):
	 *
	 * { "EUR_USD": 1.17, "EUR_GBP": 0.87, "USD_GBP": 0.74 }
	 */
	private void loadRatesFromJson() {
		try {
			// Čitamo sadržaj fajla rates.json kao String
			String content = new String(Files.readAllBytes(Paths.get("./src/rates.json")), "UTF-8");
			// Kreiramo JSON objekat iz stringa
			JSONObject json = new JSONObject(content);
			// Izvlačimo vrijednosti iz JSON-a
			EUR_USD = json.getDouble("EUR_USD");
			EUR_GBP = json.getDouble("EUR_GBP");
			USD_GBP = json.getDouble("USD_GBP");
		} catch (Exception ex) {
			// Ako dođe do greške (fajl ne postoji, loš format...), koristimo default
			// vrijednosti
			EUR_USD = 1.17;
			EUR_GBP = 0.87;
			USD_GBP = 0.74;
			// Opcionalno: obavještavamo korisnika da koristimo podrazumijevane kurseve
			JOptionPane.showMessageDialog(null, "Nije moguće učitati rates.json.\nKoristim podrazumijevane kurseve.",
					"Upozorenje", JOptionPane.WARNING_MESSAGE);
		}
	}

	// Unutrašnja klasa koja obrađuje događaje (Enter u tekstualnim poljima)
	private class EventHandler implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			try {
				// Ako je izvor događaja polje za EUR
				if (e.getSource() == textField1) {
					// Čitamo vrijednost iz polja i pretvaramo u double
					double eurValue = Double.parseDouble(textField1.getText());

					// Konverzija iz EUR u USD i GBP preko kurseva iz JSON-a
					double usdValue = eurValue * EUR_USD;
					double gbpValue = eurValue * EUR_GBP;

					// Upisujemo rezultat u druga polja (formatirano na 2 decimale)
					textField2.setText(String.format("%.2f", usdValue));
					textField3.setText(String.format("%.2f", gbpValue));

				}
				// Ako je izvor polje za USD
				else if (e.getSource() == textField2) {
					double usdValue = Double.parseDouble(textField2.getText());

					// Konverzije iz USD u EUR i GBP
					double eurValue = usdValue / EUR_USD;
					double gbpValue = usdValue * USD_GBP;

					textField1.setText(String.format("%.2f", eurValue));
					textField3.setText(String.format("%.2f", gbpValue));
				}
				// Ako je izvor polje za GBP
				else if (e.getSource() == textField3) {
					double gbpValue = Double.parseDouble(textField3.getText());

					// Konverzije iz GBP u EUR i USD
					double eurValue = gbpValue / EUR_GBP;
					double usdValue = gbpValue / USD_GBP;

					textField1.setText(String.format("%.2f", eurValue));
					textField2.setText(String.format("%.2f", usdValue));
				}
			} catch (NumberFormatException ex) {
				// Ako korisnik unese nešto što nije broj
				JOptionPane.showMessageDialog(null, "Molimo unesite ispravan broj.", "Greška pri unosu",
						JOptionPane.ERROR_MESSAGE);
			}
		}
	}

	// Glavni metod (da se program može direktno pokrenuti)
	public static void main(String[] args) {
		Gui forma = new Gui();
		forma.setVisible(true); // Prikazujemo formu
	}
}