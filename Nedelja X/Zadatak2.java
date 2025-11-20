
import java.util.Scanner;

public class Zadatak2 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		double cijena = 0;
		boolean validno = true;

		while (validno) {
			System.out.print("Unesi cijenu proizvoda: ");

			try {
				String unos = scanner.nextLine();
				cijena = Double.parseDouble(unos);

				if (cijena <= 0) {
					throw new IllegalArgumentException("Cijena mora biti pozitivan broj.");
				}

				validno = false;

			} catch (NumberFormatException e) {
				System.out.println("Greška: moras unijeti broj, a ne tekst!");
			} catch (IllegalArgumentException e) {
				System.out.println("Greška: " + e.getMessage());
			}
		}

		System.out.println("Cijena je uspjesno unesena: " + cijena);
	}
}