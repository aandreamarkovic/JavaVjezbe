import java.util.Scanner;

public class Zadatak6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("x hrasta: ");
		double xH = sc.nextDouble();
		System.out.print("y hrasta: ");
		double yH = sc.nextDouble();
		System.out.print("x kuće: ");
		double xK = sc.nextDouble();
		System.out.print("y kuće: ");
		double yK = sc.nextDouble();

		double xB = xK + 2;
		double yB = yK - 3;

		System.out.println("Blago: (" + xB + ", " + yB + ")");

		System.out.println("Vazdušno rastojanje: " + Math.sqrt((xB - xH) * (xB - xH) + (yB - yH) * (yB - yH)));
		System.out.println("Rastojanje preko kuće: " + (Math.sqrt((xK - xH) * (xK - xH) + (yK - yH) * (yK - yH))
				+ Math.sqrt((xB - xK) * (xB - xK) + (yB - yK) * (yB - yK))));
	}

}
