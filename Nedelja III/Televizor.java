
public class Televizor {

	private int brojKanala;
	private int jacinaTona;
	private String nazivKanala;

	public Televizor(int brojKanala, int jacinaTona, String nazivKanala) {
		if (brojKanala >= 1) {
			this.brojKanala = brojKanala;
		} else {
			this.brojKanala = 1;
		}

		if (jacinaTona >= 0 && jacinaTona <= 10) {
			this.jacinaTona = jacinaTona;
		} else {
			this.jacinaTona = 5;
		}

		this.nazivKanala = nazivKanala;
	}

	public int getBrojKanala() {
		return brojKanala;
	}

	public void setBrojKanala(int brojKanala) {
		if (brojKanala >= 1) {
			this.brojKanala = brojKanala;
		} else {
			System.out.println("Broj kanala mora biti ≥ 1");
		}
	}

	public int getJacinaTona() {
		return jacinaTona;
	}

	public void setJacinaTona(int jacinaTona) {
		if (jacinaTona >= 0 && jacinaTona <= 10) {
			this.jacinaTona = jacinaTona;
		} else {
			System.out.println("Jačina tona mora biti između 0 i 10");
		}
	}

	public String getNazivKanala() {
		return nazivKanala;
	}

	public void setNazivKanala(String nazivKanala) {
		this.nazivKanala = nazivKanala;
	}

	public void pojacajTon() {
		if (jacinaTona < 10) {
			jacinaTona++;
		} else {
			System.out.println("Jačina tona je već maksimalna");
		}
	}

	public void ispisi() {
		System.out.println(
				"Broj kanala: " + brojKanala + ", Naziv kanala: " + nazivKanala + ", Jačina tona: " + jacinaTona);
	}

	public static void main(String[] args) {
		Televizor t1 = new Televizor(10, 6, "Kanal 1");
		t1.ispisi();
		t1.pojacajTon();
		t1.ispisi();

		Televizor t2 = new Televizor(0, 12, "Kanal 2");
		t2.ispisi();
	}
}
