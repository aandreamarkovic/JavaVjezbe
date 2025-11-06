public class TVUredjaji extends EProizvod {
	private double ekran;

	public TVUredjaji(String opis, String sifra, double cijena, double ekran) {
		super(opis, sifra, cijena);
		this.ekran = ekran;
	}

	@Override
	public double maloprodajnaCijena() {
		double cijena = super.maloprodajnaCijena();
		if (ekran > 65)
			cijena *= 1.10;
		return cijena;
	}

	@Override
	public String prikazi() {
		return super.prikazi() + ", Ekran: " + ekran + "\"";
	}
}
