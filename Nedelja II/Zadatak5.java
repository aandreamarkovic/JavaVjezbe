import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Unesi br predjenih kilometara: ");
		double km = sc.nextDouble();

		double cijena = 1 + 0.5 * km;

		System.out.println("Cijena vožnje: " + cijena + "€");
	}

}
