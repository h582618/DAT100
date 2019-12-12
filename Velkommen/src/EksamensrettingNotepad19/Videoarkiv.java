package EksamensrettingNotepad19;

public class Videoarkiv {
	private Video[] vTab;
	private int antall;
	
	public Videoarkiv(int maksAntall) {
		
		vTab = new Video[maksAntall];
		antall = 0;
	}
	
	public void leggTil(Video v) {
		
		if(antall < vTab.length) {
			
			vTab[antall] = v;
			antall++;
		} else {
			System.out.print("Tabellen er full");
	    }
	}
	
	public int finnTotaltTid() {
		
		int t = 0;
		for(int i = 0; i < antall; i++) {
		    t += vTab[i].getSekund();
	    }
		
		return t;
	}
	public void listeAlle(String produsent) {
		System.out.print(produsent + " sine filmer: "); 
		
		int teller = 0;
		
		for(int i = 0; i < antall; i++) {
			
			String p = vTab[i].getProdusent();
			if(p.equals(produsent)) {
			    System.out.println(vTab[i].getTittel());
			    teller++;
			}
			
		}
		System.out.println("Antall videoer " + teller);
		
	}
	public void slett(String tittel) {
		
		boolean slettet = false;
		for(int i = 0; i < antall; i++) {
			if(vTab[i].getTittel().equals(tittel)) {
				vTab[i] = vTab[antall-1];
				vTab[antall-1] = null;
				slettet = true;
			}
		}
		if(!slettet) {
			System.out.print("Fant ikke tittel");
		}
		
	}
	
	public void bestePar(int tidsgrense) {
	  
	  int tid = 0;
	  int tid2 = 0;
	  String utskrift = "";
	  
	  for(int i = 0; i < antall; i++) {
		  for(int j = 0; j < antall; j++) {
			 tid2 = vTab[i].getSekund() + vTab[j].getSekund();
             if((tid2 <= tidsgrense)  && (tid2 > tid) && (j != i)) {
				 tid = tid2;
				 utskrift += vTab[i].getTittel() + " og " + vTab[j].getTittel() + " passer best.";
			 }
		  }

         	  
  }
	  System.out.println(utskrift);	
	
}
}
