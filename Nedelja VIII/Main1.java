public class Main1 {
	public static void main(String[] args) {
		Restoran restoran = new Restoran("Odiva Restoran", "Ulica bb, Podgorica", "3476380421");

		Konobar k1 = new Konobar(1, "Milan", "Petrovic", 10, 40, 5);

		Menadzer m1 = new Menadzer(2, "Andrea", "Markovic", 15, 35, 200);

		Kuvar kuvar1 = new Kuvar(3, "Milica", "Ostojic", 13, 40);

		restoran.dodajZaposlenog(k1);

		restoran.dodajZaposlenog(m1);

		restoran.dodajZaposlenog(kuvar1);

		restoran.generisiObracun(11, 2025);

		System.out.println("Ukupan trošak plata: " + restoran.ukupniTrosak() + " EUR");
	}
}
