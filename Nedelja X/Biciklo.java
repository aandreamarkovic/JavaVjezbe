
public class Biciklo extends Vozilo implements Ekonomican {

	public Biciklo(int id, double maxBrzina) {
		super(id, maxBrzina);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double izracunajVrijemeDostave(double udaljenostKm) {
		return udaljenostKm / maxBrzina;
	}

	@Override
	public double potrosnjaPoKm() {
		return 0;
	}
}
