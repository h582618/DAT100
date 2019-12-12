package EksamensrettingNotepad19;

public class Graf {
	
	private static boolean [] [] nabomatrise ={ 
			{ false, true, false, true, false, false },
			{ true, false, true, false, true, true }, 
			{ false, true, false, false, false, true },
			{ true, false, false, false, false, false }, 
			{ false, true, false, false, false, true },
			{ false, true, true, false, true, false } };
	

	public static boolean erNaboer(int u, int w) {
		return nabomatrise[u][w];
	}
	public static void grad(int v) {
	     
		 String naboer = ""; 
		 boolean forste = true;
		 int teller = 0;
		 
		 for(int i= 0; i < nabomatrise.length; i++) {
		   if(nabomatrise[v][i]) {
		       teller++;
			   if(forste) {
				 naboer += "" + i;
				 forste = false;
			   }
			    else {
				 naboer += " , " + i;
			
			
		   }
		 }
		
	}
		 System.out.println("Node" + v + " har " + teller + " naboer " +"(nodene " + naboer + " )"  );
	}

	public static int antallLokker() {
		
		int lokker = 0;
		for(int i = 0; i < nabomatrise.length; i++){
			if(nabomatrise[i][i])
				lokker++;
			}		
		return lokker;
	    }
		
	
	public static boolean uavhengigMengde(int[] s) {
		
		for(int i = 0; i < s.length; i++) {
			for(int j = 0; j < s.length; j++) {
				
			if(nabomatrise[s[i]][s[j]] && (i != j)){
				return false;
			}
		}
	    }
	return true;	

	}
}
