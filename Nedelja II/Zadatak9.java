import java.util.Scanner;

public class Zadatak9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Unesi broj mjeseca: ");
		int broj = sc.nextInt();

		if (broj == 1) {
			System.out.println("Januar");
		} else if (broj == 2) {
			System.out.println("Februar");
		} else if (broj == 3) {
			System.out.println("Mart");
		} else if (broj == 4) {
			System.out.println("April");
		} else if (broj == 5) {
			System.out.println("Maj");
		} else if (broj == 6) {
			System.out.println("Jun");
		} else if (broj == 7) {
			System.out.println("Jul");
		} else if (broj == 8) {
			System.out.println("Avgust");
		} else if (broj == 9) {
			System.out.println("Septembar");
		} else if (broj == 10) {
			System.out.println("Oktobar");
		} else if (broj == 11) {
			System.out.println("Novembar");
		} else if (broj == 12) {
			System.out.println("Decembar");
		} else {
			System.out.println("Nedozvoljen broj");
		}

	}

}
