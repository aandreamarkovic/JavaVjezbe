import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Unesite riječ: ");
		String rijec = sc.nextLine();
		rijec = rijec.replace(" ", "");
		String okrenutaRijec = new StringBuilder(rijec).reverse().toString();
		System.out.print(rijec.equalsIgnoreCase(okrenutaRijec));
	}
}