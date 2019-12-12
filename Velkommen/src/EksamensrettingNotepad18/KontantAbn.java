package EksamensrettingNotepad18;

public class KontantAbn extends Abonnement {
	   private double balanse;
	   
	   public KontantAbn(String navn, int fødselsnummer, int telefonnummer, double minuttpris, double balanse) {
	   super(navn,fødselsnummer,telefonnummer,minuttpris);
	   this.balanse = balanse;
	   }
	   
	   @Override
	   public double pris(int tn, int slengde) {
	   
	      return super.getMinuttpris() * slengde;
	   }
	}
