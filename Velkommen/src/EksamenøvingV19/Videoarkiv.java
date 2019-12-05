package EksamenøvingV19;

public class Videoarkiv {
	private Video[] vTab;
	private int antall;

	public Videoarkiv(int maksAntall) {
		
		vTab = new Video[maksAntall];
		antall = 0;
	}
	
	public void leggTil(Video v) {
		
		if(antall <= vTab.length) {
			vTab[antall] = v;
			antall++;
		}
		else {
			System.out.println("Tabellen er full");
		}
	}
	public int finnTotalTid() {
		
		int tTid = 0;
		for(int i= 0; i < antall; i++ ) {
			tTid += vTab[i].getSekund(); 
		}
		return tTid;
		
	}
	public void listAlle(String produsent) {
		
		System.out.println("Produsent " + produsent + " sine filmer");
		
		String titler = ": ";
		int antallF = 0;
		
		for(int i = 0; i < antall; i++) {
			if(vTab[i] != null && vTab[i].getProdusent().contentEquals(produsent)) {
				titler += vTab[i].getTittel();
				titler += ", ";
				antallF++;
			}
		}
		System.out.println(titler);
		System.out.println(antallF);
	}
	
	public void slett(String tittel) {
		
		for(int i = 0; i < antall; i++) {
			if(vTab[i].getTittel().contentEquals(tittel) && vTab[i].getTittel() != null) {
				vTab[i] = null;
				vTab[i] = vTab[antall-1];
				vTab[antall-1] = null;
				antall--;
				return;
			}
		}
		System.out.println("Finner ikke Tittel");
	}
	public void skrivUt() {
		for(int i = 0; i < vTab.length; i++) {
			System.out.println(vTab[i]);
		}
	}
}
