package uke45;

public class Varer {
	private int VareNr;
	private String VareNavn;
	private double Pris;

	public Varer(int VareNr,String VareNavn, double Pris) {
		this.VareNr = VareNr;
		this.VareNavn = VareNavn;
		this.Pris = Pris;
		
	}
	public int GetVareNr() {
		return this.VareNr;
	}

	public void SetVareNr(int VareNr) {
		this.VareNr = VareNr;
	}
	public String GetVareNavn() {
		return this.VareNavn;
	}
	public void SetVareNavn(String VareNavn) {
		this.VareNavn = VareNavn;
	}
	public double GetPris() {
		return this.Pris;
	}

	public void SetPris(double Pris) {
		this.Pris = Pris;
	}

	
	

}
