package Eksamen�vingH18_2;

public abstract class MaanedAbn extends Abonnement {
	private int[] gratis;
	
	public MaanedAbn(String f�dselsnummer, int telefonnummer,double minuttpris) {
		super(f�dselsnummer,telefonnummer,minuttpris);
		
		gratis = new int [4];
		
	}
	public double pris(int tn, double samtalelengde) {
		
		double pris = 0;
		
		for(int e : gratis) {
			if(e == tn) {
				return pris;
			}
		}
		return samtalelengde * getMinuttpris();
		
	}

}
