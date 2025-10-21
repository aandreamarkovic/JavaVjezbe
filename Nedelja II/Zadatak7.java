import java.util.Scanner;

public class Zadatak7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Unesi trocifreni broj: ");
		int broj = sc.nextInt();

		int a = broj / 100;
		int b = (broj / 10) % 10;
		int c = broj % 10;

		int proizvod = a * b * c;
		int zbir = a + b + c;

		int kod = proizvod - zbir;
		System.out.println("Kod : " + kod);
	}
}
