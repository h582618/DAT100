package EksamensrettingNotepad18;

import java.util.HashMap;

public class Abonnenter {
 
	private HashMap<Integer, Abonnement> abonnenter;
	
	public Abonnenter() {
		abonnenter = new HashMap<Integer,Abonnement>();
	}
	 
	 public double finnPris(int tlfnr1, int tlfnr2, int lengde) {
	 
	         double pris = 0.0;
			 
			 if(abonnenter.containsKey(tlfnr1) && abonnenter.containsKey(tlfnr2)) {
			 
			 Abonnement abb1 = abonnenter.get(tlfnr1);
			 pris = abb1.pris(tlfnr2,lengde);
	         
			 }
			  
			 return pris;
			
			}
	}
