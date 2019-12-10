package Varelager;

public class Varer {
	private int varenr;
	private String varenavn;
	private double pris;

	public Varer(int varenr, String varenavn, double pris) {
		this.varenr = varenr;
		this.varenavn = varenavn;
		this.pris = pris;
	}

	public int getVarenr() {
		return varenr;
	}

	public void setVarenr(int varenr) {
		this.varenr = varenr;
	}

	public String getVarenavn() {
		return varenavn;
	}

	public void setVarenavn(String varenavn) {
		this.varenavn = varenavn;
	}

	public double getPris() {
		return pris;
	}

	public void setPris(double pris) {
		this.pris = pris;
	}
}
