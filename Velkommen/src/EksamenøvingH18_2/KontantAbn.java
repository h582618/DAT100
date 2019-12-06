package Eksamen�vingH18_2;

public abstract class KontantAbn extends Abonnement {
	private double balanse;
	
	public KontantAbn(String f�dselsnummer, int telefonnummer, double minuttpris, double balanse){
		super(f�dselsnummer,telefonnummer,minuttpris);
		this.balanse = balanse;
		
	}
	
	public double pris(int tn, double samtalelengde) {
		double pris = samtalelengde * getMinuttpris();
		
				return pris;
	}

}
