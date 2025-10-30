public class Main {
	public static void main(String[] args) {

		Automobil a1 = new Automobil("Audi", 2014, 4000, "kafena", 4, "benzin");
		Kamion k1 = new Kamion("Mercedes", 2000, 4000, "crvena", 3000, true);
		Kombi km1 = new Kombi("Ford", 2010, 2000, "bijela", 8);
		a1.cijenaRegistracije();
		k1.cijenaRegistracije();
		km1.cijenaRegistracije();

		a1.prikazInformacija();
		k1.prikazInformacija();
		km1.prikazInformacija();
	}
}