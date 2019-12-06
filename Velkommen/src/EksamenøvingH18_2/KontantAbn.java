package EksamenøvingH18_2;

public abstract class KontantAbn extends Abonnement {
	private double balanse;
	
	public KontantAbn(String fødselsnummer, int telefonnummer, double minuttpris, double balanse){
		super(fødselsnummer,telefonnummer,minuttpris);
		this.balanse = balanse;
		
	}
	
	public double pris(int tn, double samtalelengde) {
		double pris = samtalelengde * getMinuttpris();
		
				return pris;
	}

}
