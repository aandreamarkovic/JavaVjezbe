import java.util.Scanner;

public class Zadatak13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		String broj = n + "";
		int brCif = broj.length();
		int suma = 0;

		for (int i = 0; i < broj.length(); i++) {
			char cifra = broj.charAt(i);
			int cifraBroj = Integer.parseInt(cifra + "");
			suma += Math.pow(cifraBroj, brCif);
		}

		if (suma == n) {
			System.out.println("Da");
		} else {
			System.out.println("Ne");
		}
	}
}
