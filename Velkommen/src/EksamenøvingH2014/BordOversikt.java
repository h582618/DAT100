package EksamenøvingH2014;

public class BordOversikt {
	
	private Bord [] bt;
	
	BordOversikt(int antall){
		bt = new Bord[antall];
	}
	
	public void leggTIL(Bord b) {
		for(int i = 0; i < bt.length; i++) {
			if(bt[i] != null) {
				bt[i] = b;
			}
		}
	}
	
	public int antallLedige() {
		
		int ledig = 0;
		for(int i = 0; i < bt.length; i++) {
			if(bt[i].getLedig()) {
				ledig++;
			}
		}
		return ledig;
	}
	public int finnFørsteLedige(int antall) {
		
		int v = -1;
		
		for(int i = 0; i < bt.length; i++) {
			if((bt[i] != null) && (bt[i].getAntall() >= antall && bt[i].getLedig())) {
				v =  i;
			}
		}
		return v;	
	}
	
	public int passerBest(int antall) {
		
		int verdi = 0;
		int verdi1 = 0;
		
		for(int i = 0; i < bt.length; i++) {
			if( ((bt[i].getAntall() >= antall && bt[i].getLedig()) && bt[i].getAntall() > verdi )) {
				verdi1 = bt[i].getAntall();
				verdi = i;
			}
		}
		return verdi1;
	}

}
