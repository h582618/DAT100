package EksamenøvingH18_2;

public abstract class KontantAbn extends Abonnement {
	private double balanse;
	
	public KontantAbn(String navn, String fødselsnummer, int telefonnummer, double minuttpris, double balanse){
		super(navn, fødselsnummer,telefonnummer,minuttpris);
		this.balanse = balanse;
		
	}
	
	@Override
	public double pris(int tn, double samtalelengde) {
		double pris = samtalelengde * getMinuttpris();
		
				return pris;
	}

}
