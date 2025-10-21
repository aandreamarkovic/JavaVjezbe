
public class Zaposleni {

	private String ime;
	private String prezime;
	private int godineStaza;
	private double plata;

	public Zaposleni(String ime, String prezime, int godineStaza, double plata) {
		this.ime = ime;
		this.prezime = prezime;
		this.godineStaza = godineStaza;
		this.plata = plata;
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

	public int getGodineStaza() {
		return godineStaza;
	}

	public void setGodineStaza(int godineStaza) {
		this.godineStaza = godineStaza;
	}

	public double getPlata() {
		return plata;
	}

	public void setPlata(double plata) {
		this.plata = plata;
	}

	public void ispisi() {
		System.out.println(ime + " " + prezime + ", Godine staža: " + godineStaza + ", Plata: " + plata);
	}

	public void povecajPlatu() {
		if (plata < 800 && godineStaza > 10) {
			plata *= 1.06;
		}
	}

	public static void ispisiNajvecuPlatu(Zaposleni[] zaposleni) {
		if (zaposleni.length == 0)
			return;

		Zaposleni najplaceniji = zaposleni[0];
		for (Zaposleni z : zaposleni) {
			if (z.plata > najplaceniji.plata) {
				najplaceniji = z;
			}
		}

		System.out.println("Zaposleni sa najvećom platom: " + najplaceniji.ime + " " + najplaceniji.prezime
				+ ", Plata: " + najplaceniji.plata);
	}

	public static void main(String[] args) {
		Zaposleni[] zaposleni = new Zaposleni[5];
		zaposleni[0] = new Zaposleni("Sava", "Milanovic", 11, 750);
		zaposleni[1] = new Zaposleni("Anastasija", "Krstovic", 7, 750);
		zaposleni[2] = new Zaposleni("Mitar", "Petrovic", 13, 880);
		zaposleni[3] = new Zaposleni("Jovana", "Jovovic", 4, 850);
		zaposleni[4] = new Zaposleni("Milena", "Todorovic", 20, 900);

		for (Zaposleni z : zaposleni) {
			z.povecajPlatu();
			z.ispisi();
		}

		ispisiNajvecuPlatu(zaposleni);
	}

}
