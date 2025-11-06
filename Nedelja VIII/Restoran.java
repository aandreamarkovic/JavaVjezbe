import java.util.ArrayList;

public class Restoran {
	String naziv;
	String adresa;
	String PIB;
	ArrayList<Object> zaposleni;

	public Restoran(String naziv, String adresa, String PIB) {
		this.naziv = naziv;
		this.adresa = adresa;
		this.PIB = PIB;
		this.zaposleni = new ArrayList<>();
	}

	public void dodajZaposlenog(Object z) {
		zaposleni.add(z);
	}

	public void ukloniZaposlenog(int id) {
		zaposleni.removeIf(z -> {
			if (z instanceof Konobar)
				return ((Konobar) z).id == id;
			if (z instanceof Kuvar)
				return ((Kuvar) z).id == id;
			if (z instanceof Menadzer)
				return ((Menadzer) z).id == id;
			return false;
		});
	}

	public void generisiObracun(int mesec, int godina) {
		ArrayList<ObracunPlate> obracuni = new ArrayList<>();
		for (Object z : zaposleni) {
			double plata = 0;
			String tip = "";
			String napomena = "";

			if (z instanceof Konobar) {
				Konobar k = (Konobar) z;
				plata = k.izracunajPlatu();
				tip = k.getTip();
				napomena = k.getNapomena();
			} else if (z instanceof Kuvar) {
				Kuvar ku = (Kuvar) z;
				plata = ku.izracunajPlatu();
				tip = ku.getTip();
				napomena = ku.getNapomena();
			} else if (z instanceof Menadzer) {
				Menadzer m = (Menadzer) z;
				plata = m.izracunajPlatu();
				tip = m.getTip();
				napomena = m.getNapomena();
			}

			String ime = "";
			String prezime = "";
			if (z instanceof Konobar) {
				ime = ((Konobar) z).ime;
				prezime = ((Konobar) z).prezime;
			}
			if (z instanceof Kuvar) {
				ime = ((Kuvar) z).ime;
				prezime = ((Kuvar) z).prezime;
			}
			if (z instanceof Menadzer) {
				ime = ((Menadzer) z).ime;
				prezime = ((Menadzer) z).prezime;
			}

			obracuni.add(new ObracunPlate(mesec, godina, ime, prezime, tip, plata, napomena));
		}

		System.out.printf("%-10s %-10s %-10s %-15s %-15s %-15s%n", "Ime", "Prezime", "Tip", "Plata EUR", "Mesec",
				"Napomena");
		for (ObracunPlate o : obracuni) {
			System.out.printf("%-10s %-10s %-10s %-15.2f %-15d %-15s%n", o.imeZaposlenog, o.prezimeZaposlenog, o.tip,
					o.iznos, o.mesec, o.napomena);
		}
	}

	public double ukupniTrosak() {
		double ukupno = 0;
		for (Object z : zaposleni) {
			if (z instanceof Konobar)
				ukupno += ((Konobar) z).izracunajPlatu();
			if (z instanceof Kuvar)
				ukupno += ((Kuvar) z).izracunajPlatu();
			if (z instanceof Menadzer)
				ukupno += ((Menadzer) z).izracunajPlatu();
		}
		return ukupno;
	}
}
