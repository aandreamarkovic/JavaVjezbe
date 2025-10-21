import java.util.Scanner;

public class Zadatak4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Unesi x donje desne ivice: ");
		double x1 = sc.nextDouble();
		System.out.print("Unesi y donje desne ivice: ");
		double y1 = sc.nextDouble();
		System.out.print("Unesi x gornje lijeve ivice: ");
		double x2 = sc.nextDouble();
		System.out.print("Unesi y gornje lijeve ivice: ");
		double y2 = sc.nextDouble();

		double sirina = Math.abs(x1 - x2);
		double visina = Math.abs(y1 - y2);

		double povrsina = sirina * visina;
		double obim = 2 * (sirina + visina);

		System.out.println("Površina zida: " + povrsina);
		System.out.println("Obim zida: " + obim);
	}

}
