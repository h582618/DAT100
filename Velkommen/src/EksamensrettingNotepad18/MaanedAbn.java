package EksamensrettingNotepad18;

public class MaanedAbn extends Abonnement {
    
	  private Abonnement gratis [];
	  
	public MaanedAbn(String navn, int f�dselsnummer, int telefonnummer, double minuttpris) {
	    
		super(navn,f�dselsnummer,telefonnummer,minuttpris);
		gratis = new Abonnement[4];
		
	  }
	@Override
	  public double pris(int tn, int sLengde) {
	    
		double p = 0.0; 
		
		for(int i = 0; i < gratis.length; i++) {
		   if(tn == gratis[i].getTelefonnummer()) {
		    return p;
		}
	  }
	  return sLengde * super.getMinuttpris();

}
}
