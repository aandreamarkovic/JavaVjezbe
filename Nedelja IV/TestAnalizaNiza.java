import java.util.Scanner;

public class TestAnalizaNiza {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Unesi duzinu niza: ");
		int n = sc.nextInt();
		int[] niz = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.print("Unesi element " + i + ": ");
			niz[i] = sc.nextInt();
		}

		AnalizaNiza analiza = new AnalizaNiza();
		double prosjek = analiza.nadjiParniPP(niz);

		System.out.println("Prosjecna vrijednost pozitivnih parnih brojeva: " + prosjek);
	}
}
