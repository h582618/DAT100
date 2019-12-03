package Eksamen�vingH18;

public abstract class Abonnement {
//	a
	private String navn;
	private int f�dselsnummer;
	private int nummer;
	private double minuttpris;

// b
    public Abonnement(String navn, int f�dselsnummer, int nummer, double minuttpris) {
    	this.navn = navn;
    	this.f�dselsnummer = f�dselsnummer;
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
    
    public int getF�dselsnummer() {
    	return f�dselsnummer;
    }
    public void setF�dselsnummer(int f�dselsnummer) {
    	this.f�dselsnummer = f�dselsnummer;
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