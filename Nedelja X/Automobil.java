
public class Automobil extends Vozilo {

	public Automobil(int id, double maxBrzina) {
		super(id, maxBrzina);
	}

	@Override
	public double izracunajVrijemeDostave(double udaljenostKm) {
		return udaljenostKm / maxBrzina;
	}

}
