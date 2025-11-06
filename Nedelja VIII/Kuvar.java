public class Kuvar {
	int id;
	String ime;
	String prezime;
	double plataPoSatu;
	double ukupanBrojSati;

	public Kuvar(int id, String ime, String prezime, double plataPoSatu, double ukupanBrojSati) {
		this.id = id;
		this.ime = ime;
		this.prezime = prezime;
		this.plataPoSatu = plataPoSatu;
		this.ukupanBrojSati = ukupanBrojSati;
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

	public double izracunajPlatu() {
		return 1500 + 4 * ukupanBrojSati * plataPoSatu;
	}

	public String getTip() {
		return "Kuvar";
	}

	public String getNapomena() {
		return "Fiksni dodatak: 1500";
	}
}
