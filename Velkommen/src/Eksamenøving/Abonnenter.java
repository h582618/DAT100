package Eksamenøving;

import java.util.HashMap;

public class Abonnenter {
	private HashMap<Integer, Abonnement> abonnenter;

	
	public Abonnenter() {
		abonnenter = new HashMap<Integer,Abonnement>();
	}

	
	public double finnPris(int tlfnr1, int tlfnr2, int lengde) {
		double pris = 0.0;
		Abonnement fra = abonnenter.get(tlfnr1);
		Abonnement til = abonnenter.get(tlfnr2);
		
		if(fra != null && til != null) {
			return fra.pris(til.getNummer(), lengde);		}
		
			
		return pris;
	}
}
