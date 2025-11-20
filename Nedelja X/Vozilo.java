
abstract public class Vozilo {

	protected int id;
	protected double maxBrzina;

	public Vozilo(int id, double maxBrzina) {
		super();
		this.id = id;
		this.maxBrzina = maxBrzina;
	}

	public void info() {
		System.out.println("ID vozilo:" + id + "Max brzina:" + maxBrzina);
	}

	public abstract double izracunajVrijemeDostave(double udaljenostKm);

}
