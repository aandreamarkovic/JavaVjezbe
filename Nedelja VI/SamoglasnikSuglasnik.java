import java.util.Scanner;

public class SamoglasnikSuglasnik {
	private static boolean jeSamoglasnik(char c) {
		c = Character.toLowerCase(c);
		return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String tekst = sc.nextLine();
		int brSamoglasnika = 0;
		int brSlova = 0;
		for (int i = 0; i < tekst.length(); ++i) {
			char c = tekst.charAt(i);
			if (Character.isLetter(c)) {
				brSlova++;
				if (jeSamoglasnik(c)) {
					brSamoglasnika++;

				}
			}
		}

		System.out.println("Broj samoglasnika je:" + brSamoglasnika);
		System.out.println("Broj suglasnika je:" + (brSlova - brSamoglasnika));

	}
}