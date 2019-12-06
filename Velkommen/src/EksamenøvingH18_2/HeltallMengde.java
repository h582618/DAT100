package EksamenøvingH18_2;

public class HeltallMengde {
	private boolean [] mengde;

	public HeltallMengde(int n ) {
		boolean [] hMengde = new boolean[n];
		mengde = hMengde;
	
		
	}

	public String toString() {
		String s = "{";
		
		for(int i = 0; i < mengde.length; i++) {
			if(mengde[i] && i != mengde.length-1) {
				s += (i+", ");
			}else if (mengde[i]){
				s += (i);
			}
			s += "}";
		}
		return s;
		
	}
	public boolean erMed(int t) {
		
		try {
		return(mengde[t]);
		} catch (RuntimeException e) {
			 System.out.println("Ikke en gyldig posisjon");
			 return false;
		}
		
	}
	public void leggtil(int t) {
		mengde[t]=true;
	}
	public boolean erDelmengde(int [] itab) { 
		for(int i = 0; i < itab.length; i++) {
			if(!mengde[itab[i]]);
				return false;
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
