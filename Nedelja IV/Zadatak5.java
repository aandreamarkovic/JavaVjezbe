
import java.util.Random;
import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		System.out.print("Unesi duzinu niza: ");
		int n = sc.nextInt();
		double[] niz = new double[n];

		System.out.print("Originalni niz: ");
		for (int i = 0; i < n; i++) {
			niz[i] = rand.nextInt(100) + 1;
			System.out.print((int) niz[i] + " ");
		}
		System.out.println();

		for (int i = 0; i < n; i++) {
			if (((int) niz[i]) % 2 == 0) {
				niz[i] = -niz[i];
			} else {
				niz[i] = 1.0 / niz[i];
			}
		}

		System.out.print("Modifikovani niz: ");
		for (double v : niz)
			System.out.print(v + " ");

	}

}
