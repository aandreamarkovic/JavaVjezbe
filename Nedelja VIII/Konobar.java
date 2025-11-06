
public class Konobar {

	int id;
	String ime;
	String prezime;
	double plataPoSatu;
	double ukupanBrojSati;
	double prekovremeniSati;

	public Konobar(int id, String ime, String prezime, double plataPoSatu, double ukupanBrojSati,
			double prekovremeniSati) {
		this.id = id;
		this.ime = ime;
		this.prezime = prezime;
		this.plataPoSatu = plataPoSatu;
		this.ukupanBrojSati = ukupanBrojSati;
		this.prekovremeniSati = prekovremeniSati;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public double getPlataPoSatu() {
		return plataPoSatu;
	}

	public void setPlataPoSatu(double plataPoSatu) {
		this.plataPoSatu = plataPoSatu;
	}

	public double getUkupanBrojSati() {
		return ukupanBrojSati;
	}

	public void setUkupanBrojSati(double ukupanBrojSati) {
		this.ukupanBrojSati = ukupanBrojSati;
	}

	public double getPrekovremeniSati() {
		return prekovremeniSati;
	}

	public void setPrekovremeniSati(double prekovremeniSati) {
		this.prekovremeniSati = prekovremeniSati;
	}

	public double izracunajPlatu() {
		double redovna = ukupanBrojSati * plataPoSatu;
		double prekovremena = prekovremeniSati * plataPoSatu * 1.2;
		return 4 * (redovna + prekovremena);
	}

	public String getTip() {
		return "Konobar";
	}

	public String getNapomena() {
		if (prekovremeniSati > 0) {
			return "Prekovremeni sati: " + prekovremeniSati;
		}
		return "";
	}

}
