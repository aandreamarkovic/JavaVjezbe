
public class Zadatak3 {

	public static void main(String[] args) {
		int s1, s2, q = 8;
		s1 = 1;
		s2 = ++s1 + 5;
		s1 = s2++;
		s2 += (q % 3) + q / 5 + 2;
		System.out.println(s1);
		System.out.println(s2);
	}

}
