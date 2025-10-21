import java.util.Scanner;

public class Zadatak10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Unesi gornju lijevu koordinatu prozora (x y):");
		int px1 = sc.nextInt();
		int py1 = sc.nextInt();
		System.out.println("Unesi donju desnu koordinatu prozora (x y):");
		int px2 = sc.nextInt();
		int py2 = sc.nextInt();

		System.out.println("Unesi gornju lijevu koordinatu zavjese (x y):");
		int zx1 = sc.nextInt();
		int zy1 = sc.nextInt();
		System.out.println("Unesi donju desnu koordinatu zavjese (x y):");
		int zx2 = sc.nextInt();
		int zy2 = sc.nextInt();

		if (zx1 <= px1 && zy1 <= py1 && zx2 >= px2 && zy2 >= py2) {
			System.out.println("Zavjesa prekriva prozor.");
		} else {
			System.out.println("Zavjesa ne prekriva prozor.");
		}
	}

}
