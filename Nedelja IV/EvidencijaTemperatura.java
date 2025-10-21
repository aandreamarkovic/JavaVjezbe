import java.util.Scanner;

public class EvidencijaTemperatura {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double[] niz = new double[5];
		for (int i = 0; i < 5; i++)
			niz[i] = sc.nextDouble();

		System.out.println("Duzina niza: " + niz.length);
		System.out.print("Temperatura: ");
		for (double t : niz)
			System.out.print(t + " ");

		System.out.print("\nUnesi temperaturu: ");
		double val = sc.nextDouble();

		int brPojava = 0;
		for (double t : niz)
			if (t == val)
				brPojava++;

		System.out.println(brPojava > 0 ? "Postoji" : "Ne postoji");

		double[] novi = new double[niz.length - brPojava];
		int j = 0;
		for (int i = 0; i < niz.length; i++)
			if (niz[i] != val)
				novi[j++] = niz[i];

		System.out.print("Novi niz: ");
		for (double t : novi)
			System.out.print(t + " ");

		double suma = 0, max = novi[0];
		for (double t : novi) {
			suma += t;
			if (t > max)
				max = t;
		}

		System.out.println("\nProsjek: " + (suma / novi.length));
		System.out.println("Maksimalna: " + max);
	}
}
