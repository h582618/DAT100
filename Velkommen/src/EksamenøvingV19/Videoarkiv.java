package EksamenøvingV19;

public class Videoarkiv {
	private Video[] vTab;
	private int antall;

	public Videoarkiv(int maksAntall) {

		vTab = new Video[maksAntall];
		antall = 0;
	}

	public void leggTil(Video v) {

		if (antall < vTab.length) {
			vTab[antall] = v;
			antall++;
		} else {
			System.out.println("Tabellen er full");
		}
	}

	public int finnTotalTid() {

		int tTid = 0;
		for (int i = 0; i < antall; i++) {
			tTid += vTab[i].getSekund();
		}
		return tTid;

	}

	public void listAlle(String produsent) {

		System.out.println("Produsent " + produsent + " sine filmer");

		String titler = ": ";
		int antallF = 0;

		for (int i = 0; i < antall; i++) {
			if (vTab[i] != null && vTab[i].getProdusent().contentEquals(produsent)) {
				titler += vTab[i].getTittel();
				titler += ", ";
				antallF++;
			}
		}
		System.out.println(titler);
		System.out.println(antallF);
	}

	public void slett(String tittel) {
		for (int i = 0; i < antall; i++) {
			if (vTab[i].getTittel().contentEquals(tittel) && vTab[i].getTittel() != null) {
				vTab[i] = null;
				vTab[i] = vTab[antall - 1];
				vTab[antall - 1] = null;
				antall--;
				return;
			}
		}
		System.out.println("Finner ikke Tittel");
	}

//	Teste metode
	public void skrivUt() {
		for (int i = 0; i < vTab.length; i++) {
			System.out.println(vTab[i]);
		}
	}

	public void bestePar(int tidsgrense) {

		int tid = 0;
		int tid2 = 0;

		String bT = null;

		for (int i = 0; i < antall; i++) {
			for (int k = 0; k < antall; k++) {
				if(i != k ) {
					tid2 = vTab[i].getSekund() + vTab[k].getSekund();
					if (tid2 <= tidsgrense && tid2 > tid) {
						tid = tid2;
						bT = vTab[i].getTittel() + " og " + vTab[k].getTittel();
					}	
				}
				

			}

		}
		System.out.println(bT + " passer best");
	}

}
