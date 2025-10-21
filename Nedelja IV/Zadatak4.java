import java.util.Scanner;

public class Zadatak4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Unesi duzinu niza: ");
		int n = sc.nextInt();
		int[] niz = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.print("Unesi element " + i + ": ");
			niz[i] = sc.nextInt();
		}

		for (int pass = 0; pass < n - 1; pass++) {
			for (int j = 0; j < n - 1 - pass; j++) {
				if (niz[j] > niz[j + 1]) {
					int tmp = niz[j];
					niz[j] = niz[j + 1];
					niz[j + 1] = tmp;
				}
			}
		}

		System.out.print("Sortiran niz: ");
		for (int v : niz)
			System.out.print(v + " ");
		System.out.println();

		System.out.print("Unesi broj za pretragu: ");
		int trazeni = sc.nextInt();
		int index = -1;
		for (int i = 0; i < n; i++) {
			if (niz[i] == trazeni) {
				index = i;
				break;
			}
		}

		if (index >= 0) {
			System.out.println("Broj " + trazeni + " postoji u nizu na indeksu " + index + ".");
		} else {
			System.out.println("Broj " + trazeni + " ne postoji u nizu.");
		}
	}
}
