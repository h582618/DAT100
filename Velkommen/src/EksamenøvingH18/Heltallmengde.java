package EksamenøvingH18;

public class Heltallmengde {
	private boolean[] mengde;
	
	public Heltallmengde (int n) {
		mengde = new boolean[n];
	}
	
	public String toString() {
		
		String svar ="{";
		boolean forste = true;
		
		for( int i = 0; i < mengde.length; i++) {
			if(mengde[i]) {
				if(forste) {
					svar = svar + i;
					forste = false;
				} else {
					svar += "," + i;
				}
				
				
			}
		}
		svar += "}";
		return svar;
	}
	public boolean erMed(int t) {
		return mengde[t];
		
	}
	public void leggtil(int t) {
		mengde[t]=true;
	}
	public boolean erDelmengde(int[] itab) {
		for(int e: itab) {
			if(!erMed(e)) {
				return false;
			}
		}
		return true;
	}
	
	public void komplement() {
		for (int i = 0; i <mengde.length; i++) {
			mengde[i] = !mengde[i];
		}
		
	}
	public boolean erMed2(int t) {
		if(t >= 0 && t < mengde.length) {
			return mengde[t];
		}
		else {
			throw new RuntimeException("Ulovlig index");
		}
	}
	

}
