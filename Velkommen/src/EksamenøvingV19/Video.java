package EksamenøvingV19;

public class Video {
	private String tittel;
	private String produsent;
	private int sekund;
	
	public Video(String tittel, String produsent, int sekund){
		this.tittel = tittel;
		this.produsent = produsent;
		this.sekund = sekund;
		
	}
	
	public String getTittel() {
		return tittel;
	}
	public void setTittle(String tittel) {
		this.tittel = tittel;
	}
	public String getProdusent() {
		return produsent;
	}
	public void setProdusent(String produsent) {
		this.produsent = produsent;
	}
	
	public int getSekund() {
		return sekund;
	}
	public void setSekund(int sekund) {
		this.sekund = sekund;
	}

	
	public String toString() {
		
		int minutt = sekund / 60;
		int rest = sekund % 60;
		
		
		return "Tittel: " + tittel + ", produsent: " + produsent + ". Tid:" + minutt +"."+rest;
	}
}
