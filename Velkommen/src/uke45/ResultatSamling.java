package uke45;

public class ResultatSamling {
	private Resultat[] tabell;
	private int nesteLedige;

	public ResultatSamling(int antall ) {
		tabell = new Resultat[antall];
		nesteLedige = 0;
	}
	
	public boolean settInn(Resultat a) {
		boolean ny = finnPos(a.getKandidatNr()) == -1;
		
			if(nesteLedige < tabell.length && ny) {	
				tabell[nesteLedige] = a;
				nesteLedige++;
				return true;
		}

		return false;
	}
//	finner posisjonen til et resultat, gitt et kanditatnr, leverer -1 hvis objektet ikke er der 
	
	public int finnPos(int kandidatNr) {
		boolean funnet = false;
		for(int i = 0; i < nesteLedige && !funnet; i++) {
			if(tabell[i].getKandidatNr() == kandidatNr) {
				funnet = true;
				return i;
				
			}
		}
		return -1;
	}
//	finner ansatt git ansattnummeret
//	returnerer null hvis objektet ikke finnes
	
	public Resultat finn(int kandidatNr) {
		int pos = finnPos(kandidatNr);
		if(pos >= 0) {  //funnet!
			return tabell[pos];
		}
		return null;
	}
	public double gSnitt() {
		double gsnitt = 0;
		for(int i = 0; i < nesteLedige; i++) {
			gsnitt = gsnitt + tabell[i].getpoengSum(); 
			
		}
		return gsnitt/nesteLedige;	}
	
	public void skrivUt() {
		for(int i = 0; i < nesteLedige; i++) {
			System.out.println(tabell[i].SkrivUt());
		}
	}
	
	
}
