package EksamensrettingNotepad18;

public class Rute {
	public class Rute{
		 private Punkt[] punkter;
		 
		 Public Rute(int n) {
		 punkter = new Punkt[n];

		}

		public int antall() {
		 int teller = 0;
		   
		  for(int i = 0; i < punkter.length; i++) {
		   if(punkter[i] != null) {
		   teller++; 
		  } else {
		     break;
			 }
		   return teller;
		   }
		   
		   eller 
		   
		   int teller = 0;
		   int i = 0;
		   while(punkter[i] != null && i < punkter.length) {
		   teller++;
		   i++;
		   
		   }
		   return teller;
		  }
		  
		  public boolean leggTil(punkt p) {
		   if(antall() < tabell.length) {
		    punkter[antall()] = p;
			
			
		   }
		   
		   public boolean leggTilPunkt(double breddegrad, double lengdegrad, double hoyde) {
		        
				Punkt p = new Punkt(breddegrad,lengdegrad,hoyde);
				
				punkter.leggtil(p);
				
				}
		   
		   public punkt[] komprimer() {
		   
		       Punkt [] komp = new Punkt[antall()-1];
			   
			   for(int i = 0; i < antall(); i++) {
			       komp[i] = punkter[i];
			   }
		        return komp;
		   }
		   
		   public double hoyestepunkt(Rute rute){
		    
			Punkt[] rTab = Rute.komprimer();
			
			double hoyest = rTab[0];
			
			
			for(int i = 0; i  < rute.antall(); i++) {
		         if(rTab[i].getHoyde() > hoyest) {
				    hoyest = rTab[i].getHoyde();
				 }
		   }
		   return hoyest;
		  }
		  
		  public double lengde(Rute rute) {
		   
		   Punkt[] rTab = Rute.komprimer();
		    
			double l = 0.0;
		   
		     for(int i = 0; i < rute.antall()-1; i++){
			      l = l + avstand(rTab[i],rTab[i+1]);
			 }
		    return l;
		  }
		  
		  
		   public Rute korteste(Rute rute1, Rute rute2) {
		    
		    if(rute1.lengde() > rute2.lengde()){
			return rute1;
			}


		    return rute2;
			}
}
