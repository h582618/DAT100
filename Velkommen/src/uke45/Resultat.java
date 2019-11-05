package uke45;

public class Resultat {
	private int kandidatNr;
	private int poengSum;
	
	public Resultat(int kanditatnr, int poengsum) {
		this.kandidatNr = kanditatnr;
		this.poengSum = poengsum;
		
	}
	public int getKandidatNr() {
		return this.kandidatNr;
	}
	public void setKandidatNr(int kandidatnr) {
		this.kandidatNr = kandidatnr;
	}
	public int getpoengSum() {
		return this.poengSum;
	} 
	public void setPoengsum(int poengsum) {
		this.poengSum = poengsum;
		
	}
}
