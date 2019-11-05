package uke45;

public class Reperatorer extends Ansatt{
	
	
	private String produkt;
	
	
	public Reperatorer(int ansNr, String fornavn,String etternavn, double lonn, String produkt) {
		super(ansNr, fornavn, etternavn,lonn);
		this.produkt = produkt;
		
	}
	public String getProdukt() {
		return this.produkt;
	}
	
	
	public void setProdukt(String produkt) {
		this.produkt = produkt;
	}
	
	
//	public String toString1() {
//		w
//		
//		return (getAnsNr()+""+getFornavn()+""+getEtternavn()+" " + getLonn() + produkt);	
//				
//	}
	public String toString() {
		return super.toString() + " Produkt " + produkt;
	}
	

}
