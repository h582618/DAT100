package Eksamen�vingH18_2;

public abstract class KontantAbn extends Abonnement {
	private double balanse;
	
	public KontantAbn(String navn, String f�dselsnummer, int telefonnummer, double minuttpris, double balanse){
		super(navn, f�dselsnummer,telefonnummer,minuttpris);
		this.balanse = balanse;
		
	}
	
	@Override
	public double pris(int tn, double samtalelengde) {
		double pris = samtalelengde * getMinuttpris();
		
				return pris;
	}

}
