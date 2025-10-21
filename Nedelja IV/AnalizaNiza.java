
public class AnalizaNiza {

	public double nadjiParniPP(int[] niz) {
		int suma = 0;
		int brojac = 0;

		for (int broj : niz) {
			if (broj > 0 && broj % 2 == 0) {
				suma += broj;
				brojac++;
			}
		}

		if (brojac == 0)
			return 0;
		return (double) suma / brojac;
	}
}
