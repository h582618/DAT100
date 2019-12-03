package EksamenøvingH18;

public abstract class Abonnement {
//	a
	private String navn;
	private int fødselsnummer;
	private int nummer;
	private double minuttpris;

// b
    public Abonnement(String navn, int fødselsnummer, int nummer, double minuttpris) {
    	this.navn = navn;
    	this.fødselsnummer = fødselsnummer;
    	this.nummer = nummer;
    	this.minuttpris = minuttpris;
    }
    
//  c
    public String getNavn() {
    	return navn;
    }
    public void setNavn(String navn) {
    	this.navn = navn;
    }
    
    public int getFødselsnummer() {
    	return fødselsnummer;
    }
    public void setFødselsnummer(int fødselsnummer) {
    	this.fødselsnummer = fødselsnummer;
    }
    public int getNummer() {
    	return nummer;
    }
    public void setNummer(int nummer) {
    	this.nummer = nummer;
    }
    public double getMinuttpris() {
    	return minuttpris;
    }
    public void setMinuttpris(double minuttpris) {
    	this.minuttpris = minuttpris;
    }
   
//    d
    public abstract double pris (int nummer, int samtalelengde);
}