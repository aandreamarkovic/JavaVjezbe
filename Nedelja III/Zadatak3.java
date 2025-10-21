import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int T = sc.nextInt();

		int pozicija = 0;

		for (int i = 0; i < T; i++) {
			int K = sc.nextInt();
			pozicija = (pozicija + K) % N;
			System.out.println(pozicija);
		}

		System.out.println("Konačna pozicija: " + pozicija);
	}

}
