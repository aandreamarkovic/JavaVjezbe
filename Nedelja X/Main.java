import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Vozilo> vozila = new ArrayList<>();

		vozila.add(new Biciklo(123, 30));
		vozila.add(new Motor(525, 80));
		vozila.add(new Automobil(578, 100));

		double udaljenost = 10;

		System.out.println("Dostava na udljenost" + udaljenost);

		for (Vozilo v : vozila) {
			v.info();

			double vrijeme = v.izracunajVrijemeDostave(udaljenost);
			System.out.println("Vrijeme dostave: " + vrijeme);

			if (v instanceof Ekonomican) {
				Ekonomican e = (Ekonomican) v;
				double potrosnja = e.potrosnjaPoKm() * udaljenost;
				System.out.println("Potrosnja na " + udaljenost + " km: " + potrosnja);
			}

		}
	}

}
