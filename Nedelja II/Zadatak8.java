import java.util.Scanner;

public class Zadatak8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Unesi cijeli broj: ");
		int broj = sc.nextInt();

		if (broj >= 0) {
			System.out.print("Broj je pozitivan");
		} else {
			System.out.print("Broj je negativan");
		}
		if (broj % 2 == 0) {
			System.out.println(" i paran.");
		} else {
			System.out.println(" i neparan.");
		}
	}

}
