import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Unesi duzinu niza: ");
		int n = sc.nextInt();
		int[] niz = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.print("Unesi bodove za element " + i + ": ");
			niz[i] = sc.nextInt();
		}

		int suma = 0;
		int min = niz[0];
		int minIndex = 0;

		for (int i = 0; i < n; i++) {
			suma += niz[i];
			if (niz[i] < min) {
				min = niz[i];
				minIndex = i;
			}
		}

		double prosjek = (double) suma / n;

		System.out.println("Prosjecan broj bodova: " + prosjek);
		System.out.println("Najmanji element: " + min + " na indeksu " + minIndex);
	}
}