public class EProizvod {
	private String opisProizvoda;
	private String sifraProizvoda;
	private double uvoznaCijena;

	public EProizvod(String opisProizvoda, String sifraProizvoda, double uvoznaCijena) {
		this.opisProizvoda = opisProizvoda;
		this.sifraProizvoda = sifraProizvoda;
		this.uvoznaCijena = uvoznaCijena;
	}

	public String getOpisProizvoda() {
		return opisProizvoda;
	}

	public void setOpisProizvoda(String opisProizvoda) {
		this.opisProizvoda = opisProizvoda;
	}

	public String getSifraProizvoda() {
		return sifraProizvoda;
	}

	public void setSifraProizvoda(String sifraProizvoda) {
		this.sifraProizvoda = sifraProizvoda;
	}

	public double getUvoznaCijena() {
		return uvoznaCijena;
	}

	public void setUvoznaCijena(double uvoznaCijena) {
		this.uvoznaCijena = uvoznaCijena;
	}

	public String odrediTip() {
		if (sifraProizvoda.toUpperCase().startsWith("RA"))
			return "Racunari";
		else if (sifraProizvoda.toUpperCase().startsWith("TE"))
			return "Telefoni";
		else if (sifraProizvoda.toUpperCase().startsWith("TV"))
			return "TV";
		else
			return "Nepoznat";
	}

	public double maloprodajnaCijena() {
		double cijena = uvoznaCijena * 1.05;
		return cijena;
	}

	public String prikazi() {
		return "Šifra: " + sifraProizvoda + ", Opis: " + opisProizvoda + ", Tip: " + odrediTip() + ", Maloprodajna: "
				+ String.format("%.2f", maloprodajnaCijena());
	}
}
