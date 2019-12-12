package EksamensrettingNotepad18;

public class KontantAbn extends Abonnement {
	   private double balanse;
	   
	   public KontantAbn(String navn, int f�dselsnummer, int telefonnummer, double minuttpris, double balanse) {
	   super(navn,f�dselsnummer,telefonnummer,minuttpris);
	   this.balanse = balanse;
	   }
	   
	   @Override
	   public double pris(int tn, int slengde) {
	   
	      return super.getMinuttpris() * slengde;
	   }
	}
