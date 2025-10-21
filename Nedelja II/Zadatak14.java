import java.util.Scanner;

public class Zadatak14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ukupnaZarada = 0;

		for (int i = 1; i <= n; i++) {

			int brSati = sc.nextInt();
			if (brSati > 5) {
				ukupnaZarada += (brSati - 5) * 1 + 5 * 2;
			} else {
				ukupnaZarada += brSati * 2;
			}
		}

		System.out.println(ukupnaZarada);
	}

}
