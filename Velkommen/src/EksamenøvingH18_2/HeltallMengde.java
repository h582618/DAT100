package EksamenøvingH18_2;

public class HeltallMengde {
	private boolean [] mengde;

	public HeltallMengde(int n ) {
		mengde = new boolean[n];
	
		
	}

	public String toString() {
		String s = "{";
		
		boolean forste = true;
		
		for(int i = 0; i < mengde.length; i++) {
			if(mengde[i] && (!forste) ) {
				s += (", " + i);
			}else if (mengde[i] && forste){
				s += (i);
				forste = false;
			}
		}
		s += "}";
		return s;
		
	}
	public boolean erMed(int t) {
		
		if(t >= 0 && t < mengde.length) {
			return(mengde[t]);	
		} 
		else{
		throw new RuntimeException("Ikke en gyldig posisjon"); 
		}
		
	}
	public void leggtil(int t) {
		mengde[t]=true;
	}
	public boolean erDelmengde(int [] itab) { 
		
		for(int i = 0; i < itab.length; i++) {
			if(!mengde[itab[i]]) {
				return false;
			} 
	}
		  return true;
	}
	public void komplement() {
		
		int i = 0;
		
		for(boolean e : mengde) {
			mengde[i] = !e; 
			i++;
		}
	}
}
