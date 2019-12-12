package EksamensrettingNotepad18;

public class helTallmnegde {
	private boolean[] mengde;


     public helTallmnegde(int n) { 

    mengde = new boolean[n];
	
    
	for(boolean b : mengde) {
	     b = false;
 	}
     }
	
	public String toString() {
	
	String m = "{";
	
	for(int i = 0; i < mengde.length; i++) {
	      if(mengde[i]) {
		    m += i +", ";
		  
		  } else if (mengde[i] && i == mengde.length-1)
	          m += i;
	
	}
	
      m += "}";
	
	return m;
	}
	
	public boolean erMed(int t) {
	
	return(mengde[t]);
	}
	
	public void leggtil(int t) {
	 
	mengde[t] = true;
	
	
	}
	
	public boolean erDelmengde(int [] itab) {
	
	for(int i = 0; i  < itab.length; i++) {
	 if(!mengde[itab[i]]){
	   return false;
	}
	
	}
	return true;
	}
	public void komplement() {
	 for(int i = 0; i < mengde.length; i++) {
	   if(mengde[i]){
	   mengde[i] = false;
	 } else {
	    mengde[i] = true;
	}
	 }
	}
	
	
	public boolean SjekkerMed(int t) {
	 
    if(t >= 0 && mengde[t]) {
    	return mengde[t];
    } else {
    	throw new RuntimeException("Utenfor index");
    }
	 
	}
}

	
