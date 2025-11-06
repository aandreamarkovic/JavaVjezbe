
public class ObracunPlate {
	int mesec;
	int godina;
	String imeZaposlenog;
	String prezimeZaposlenog;
	String tip;
	double iznos;
	String napomena;

	public ObracunPlate(int mesec, int godina, String imeZaposlenog, String prezimeZaposlenog, String tip, double iznos,
			String napomena) {
		this.mesec = mesec;
		this.godina = godina;
		this.imeZaposlenog = imeZaposlenog;
		this.prezimeZaposlenog = prezimeZaposlenog;
		this.tip = tip;
		this.iznos = iznos;
		this.napomena = napomena;
	}
}
