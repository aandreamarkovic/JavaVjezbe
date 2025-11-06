public class Telefoni extends EProizvod {
	private String operativniSistem;
	private double ekran;

	public Telefoni(String opis, String sifra, double cijena, String os, double ekran) {
		super(opis, sifra, cijena);
		this.operativniSistem = os;
		this.ekran = ekran;
	}

	@Override
	public double maloprodajnaCijena() {
		double cijena = super.maloprodajnaCijena();
		if (ekran > 6)
			cijena *= 1.03;
		return cijena;
	}

	@Override
	public String prikazi() {
		return super.prikazi() + ", OS: " + operativniSistem + ", Ekran: " + ekran + "\"";
	}
}
