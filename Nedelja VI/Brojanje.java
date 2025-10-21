import java.util.Scanner;

public class Brojanje {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Unesi rečenicu: ");
		String recenica = sc.nextLine();

		String[] rijeci = recenica.split(" ");
		System.out.println("Broj rijeci: " + rijeci.length);
	}
}
