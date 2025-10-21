import java.util.Scanner;

public class Zadatak15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Unesi broj paketa N: ");
		int n = sc.nextInt();
		System.out.print("Unesi koordinatu baze x: ");
		double x = sc.nextDouble();
		System.out.print("Unesi koordinatu baze y: ");
		double y = sc.nextDouble();

		double ukupnaUdaljenost = 0;

		for (int i = 1; i <= n; i++) {
			System.out.print("Unesi koordinate paketa " + i + " (x y): ");
			double x1 = sc.nextDouble();
			double y1 = sc.nextDouble();

			if (x1 >= 0 && y1 >= 0) {
				double dist = Math.sqrt(Math.pow(x - x1, 2) + Math.pow(y - y1, 2));
				ukupnaUdaljenost += 2 * dist;
			}
		}

		System.out.println("Ukupna udaljenost drona: " + ukupnaUdaljenost);

	}

}
