import java.util.Scanner;

public class Zadatak12 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Unesi broj N: ");
		int N = sc.nextInt();

		int ukupno = 0;
		int preko500 = 0;

		for (int i = 1; i <= N; i++) {
			System.out.print("Unesi potrošnju za domaćinstvo " + i);
			int potrosnja = sc.nextInt();

			ukupno += potrosnja;

			if (potrosnja > 500) {
				preko500 += potrosnja;
			}
		}

		System.out.println("Ukupna potrošnja: " + ukupno);
		System.out.println("Zbir potrošnje > 500 kWh: " + preko500);
	}

}
