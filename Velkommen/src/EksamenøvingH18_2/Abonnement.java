package Eksamen�vingH18_2;

public abstract class Abonnement {
	private String f�dselsnummer;
	private int telefonnummer;
	private double minuttpris;
	private String navn;
	
	public Abonnement(String navn, String fn, int tn, double mp) {
		f�dselsnummer = fn;
		telefonnummer = tn;
		minuttpris = mp;
		this.navn = navn;
	}
	
	public String getF�dselsnummer() {
		return f�dselsnummer;
	}
	public void setF�dselsnummer(String fn) {
		f�dselsnummer = fn;
	}
	public int getTelefonnummer() {
		return telefonnummer;
	}
	public void setTelefonnummer(int tn) {
		telefonnummer = tn;
	}
	public double getMinuttpris() {
		return minuttpris;
	}
	public void setMinuttpris(double mp) {
		minuttpris = mp;
	}
	
	public abstract double pris(int tn, double samtalelengde);
	
}
