package uke45;

public class ResultatSamling {
	private Resultat[] tabell;
	private int nesteLedige;

	public ResultatSamling(int antall ) {
		tabell = new Resultat[antall];
		nesteLedige = 0;
	}
	
	public boolean settInn(Resultat a) {

		for(int i = 0; i < tabell.length; i++ ) {
			if(nesteLedige > 0 && tabell[i].getKandidatNr() == a.getKandidatNr()) {	
				return false;	
		}
		}
		tabell[nesteLedige] = a;
		nesteLedige++;
		return true;
	}
}
