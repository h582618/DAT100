package Eksamens�vingH17;

public class Spyd extends Resultat {
	private double lengde;
	
	public Spyd(String navn, char kj�nn, double lengde) {
		super(navn,kj�nn);
		this.lengde = lengde;
	}
	@Override
	public int poeng() {
		
		double p = 1000;
		
		if(getKj�nn() == 'M') {
			double l = lengde - 77.20;
			p = p + (l * 15);
		} else {
			double l = lengde - 60;
			p = p + (l * 15);
		}
		return (int)p;
	}
	@Override
	public String toString() {
		return super.toString() + ", Lengde: " + lengde;
	}

}
