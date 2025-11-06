import java.util.ArrayList;

public class Smjena {
	String datum;
	String pocetak;
	String kraj;
	String tipSmjene;
	ArrayList<Object> zaposleni;

	public Smjena(String datum, String pocetak, String kraj, String tipSmjene) {
		this.datum = datum;
		this.pocetak = pocetak;
		this.kraj = kraj;
		this.tipSmjene = tipSmjene;
		this.zaposleni = new ArrayList<>();
	}

	public void dodajZaposlenog(Object z) {
		zaposleni.add(z);
	}

	public double brojSati() {

		return 8.0;
	}
}
