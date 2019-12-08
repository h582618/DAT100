package EksamensøvingH17;

public class Flyavganger {
	private Flyavgang [] tab;
	
	
	public Flyavganger(int n) {
		tab = new Flyavgang[n];
	}

	public boolean erNull(int p) {
		if(tab[p] == null) {
			return true;
		}
		return false;
	}
	public int antall() {
		int teller = 0;
		for(Flyavgang b : tab) {
			if(b != null) {
				teller++;
			}
		}
		return teller;
	}
	public void visinfo() {
		for(Flyavgang b: tab) {
			if(b != null) {
			System.out.print(b.toString());
		}
	}
}
	public boolean setStatus(int nummer, char status) {
		boolean funnet = false;
		for(Flyavgang b : tab) {
			if(b != null && b.getNummer() == nummer) {
				funnet = true;
				b.setStatus(status);
			}
		}
		return funnet;
//			For løkke varianten
//		for(int i = 0; i < tab.length; i++) {
//			if(tab[i] != null && tab[i].getNummer() == nummer) {
//				funnet = true;
//				tab[i].setStatus(status);
//			}
		
	}
	public boolean settinn(Flyavgang flyavgang) {
		boolean sattinn = false;
		for(int i = 0; i < tab.length; i++) {
			if(tab[i] == null) {
				tab[i] = flyavgang;
				sattinn = true;
				return sattinn;
			}
		}
		return sattinn;
	}
	
	public boolean slett(int nummer) {
		for(int i = 0; i < tab.length; i++) {
			if(tab[i].getNummer() == nummer) {
				tab[i] = null;
				return true;
			}
		}
		return false;
	}
}

