package AutoMat;

public class Automat {
	private String Produkt;
	private double Mynter;

	public Automat(String Produkt, Double Mynter) {
		this.Produkt = Produkt;
		this.Mynter = Mynter;
	}
	
	public String GetProdukt() {
		return this.Produkt;
	}
	public void setProdukt(String Produkt) {
		this.Produkt = Produkt;
	}
	
	public Double GetMynter() {
		return this.Mynter;
	}
	public void setMynter(double Mynter) {
		this.Mynter = Mynter;
	}
}
