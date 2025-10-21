import java.util.Scanner;

public class Enkriptovanje {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Unesi cifru: ");
		String s = sc.nextLine();

		s = s.replaceAll("[02468]", "0");
		s = s.replaceAll("[13579]", "1");

		System.out.println("Enkriptovani string: " + s);
	}

}
