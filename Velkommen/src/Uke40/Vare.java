package Uke40;
		
	public class Vare {
		private int varenr;
		private String navn;
		private double pris;

	public Vare(int varenr, String navn, double pris) {
		
		this.varenr = varenr;
		this.navn = navn;
		this.pris = pris;
	}
	Vare v = new Vare(1, "ostepops", 200.0); 
//	3b
	public int getVarenr() {
	int nr = v.getVarenr();
	v.setVarenr(2);
		return varenr;
	}
	public void setVarenr(int varenr) {
		this.varenr = varenr;
	}
	
//	3c
	
	
	public String toString() {
		return "vare [varenr = "+ varenr + ",navn=" + navn + ",pris " + pris + "]";
		
	}
}
