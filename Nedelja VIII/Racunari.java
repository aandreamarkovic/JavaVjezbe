public class Racunari extends EProizvod {
	private String procesor;
	private String memorija;

	public Racunari(String opis, String sifra, double cijena, String procesor, String memorija) {
		super(opis, sifra, cijena);
		this.procesor = procesor;
		this.memorija = memorija;
	}

	@Override
	public double maloprodajnaCijena() {
		return super.maloprodajnaCijena() * 1.05;
	}

	@Override
	public String prikazi() {
		return super.prikazi() + ", Procesor: " + procesor + ", Memorija: " + memorija;
	}
}
