package EksamensøvingH17;

public class Spyd extends Resultat {
	private double lengde;
	
	public Spyd(String navn, char kjønn, double lengde) {
		super(navn,kjønn);
		this.lengde = lengde;
	}
	@Override
	public int poeng() {
		
		double p = 1000;
		
		if(getKjønn() == 'M') {
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
