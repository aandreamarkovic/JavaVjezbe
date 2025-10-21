
public class Zadatak1 {

	public static void main(String[] args) {

		int[] niz = new int[10];

		for (int i = 0; i < 10; i++) {
			niz[i] = i + 1;
		}

		for (int i = 9; i >= 0; i--) {
			System.out.print(niz[i] + " ");
		}
	}
}