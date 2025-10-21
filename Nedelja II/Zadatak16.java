import java.util.Scanner;

public class Zadatak16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Unesi broj mrava: ");
		int n = sc.nextInt();

		System.out.print("Unesi x gornje desne ivice stola: ");
		double x1 = sc.nextDouble();
		System.out.print("Unesi y gornje desne ivice stola: ");
		double y1 = sc.nextDouble();

		System.out.print("Unesi x donje lijeve ivice stola: ");
		double x2 = sc.nextDouble();
		System.out.print("Unesi y donje lijeve ivice stola: ");
		double y2 = sc.nextDouble();

		int brojMrava = 0;

		for (int i = 1; i <= n; i++) {
			System.out.print("Unesi koordinatu mrava " + i + " (x y): ");
			double xm = sc.nextDouble();
			double ym = sc.nextDouble();

			// provjera da li je mrav na ivici stola
			if ((xm >= x2 && xm <= x1 && (ym == y1 || ym == y2)) || (ym >= y2 && ym <= y1 && (xm == x1 || xm == x2))) {
				brojMrava++;
			}
		}

		System.out.println("Broj mrava po ivici stola: " + brojMrava);
	}
}
