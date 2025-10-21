
public class Zadatak3 {

	public static void main(String[] args) {
		int[] posjete = { 1200, 850, 1990, 1740, 1990, 760, 1340, 2000, 1900, 2000 };
		int max = posjete[0];
		for (int i = 1; i < posjete.length; i++) {
			if (posjete[i] > max)
				max = posjete[i];
		}
		System.out.println("Najvise posjeta u jednoj utakmici: " + max);
	}
}