import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		ArrayList<EProizvod> proizvodi = new ArrayList<>();
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("\n1. Unos uređaja\n2. Pregled svih\n3. Pregled po tipu\n4. Izlaz");
			System.out.print("Izbor: ");
			String izbor = sc.nextLine();

			if (izbor.equals("1")) {
				System.out.print("Opis: ");
				String opis = sc.nextLine();
				System.out.print("Šifra (RA/TE/TV): ");
				String sifra = sc.nextLine();
				System.out.print("Uvozna cijena: ");
				double cijena = Double.parseDouble(sc.nextLine());

				if (sifra.toUpperCase().startsWith("RA")) {
					System.out.print("Procesor: ");
					String p = sc.nextLine();
					System.out.print("Memorija: ");
					String m = sc.nextLine();
					proizvodi.add(new Racunari(opis, sifra, cijena, p, m));

				} else if (sifra.toUpperCase().startsWith("TE")) {
					System.out.print("OS: ");
					String os = sc.nextLine();
					System.out.print("Ekran: ");
					double e = Double.parseDouble(sc.nextLine());
					proizvodi.add(new Telefoni(opis, sifra, cijena, os, e));

				} else if (sifra.toUpperCase().startsWith("TV")) {
					System.out.print("Ekran: ");
					double e = Double.parseDouble(sc.nextLine());
					proizvodi.add(new TVUredjaji(opis, sifra, cijena, e));

				} else {
					System.out.println("Nepoznata šifra!");
				}

			} else if (izbor.equals("2")) {
				for (EProizvod p : proizvodi)
					System.out.println(p.prikazi());

			} else if (izbor.equals("3")) {
				System.out.print("Tip (Racunari/Telefoni/TV): ");
				String tip = sc.nextLine().toLowerCase();
				for (EProizvod p : proizvodi) {
					if ((tip.equals("racunari") && p instanceof Racunari)
							|| (tip.equals("telefoni") && p instanceof Telefoni)
							|| (tip.equals("tv") && p instanceof TVUredjaji)) {
						System.out.println(p.prikazi());
					}
				}

			} else if (izbor.equals("4")) {
				break;

			} else {
				System.out.println("Nepoznata opcija!");
			}
		}
		sc.close();
	}
}
