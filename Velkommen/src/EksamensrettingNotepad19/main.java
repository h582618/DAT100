package EksamensrettingNotepad19;

public class main {

public static void main(String [] args) {
	
	
	 Videoarkiv va = new Videoarkiv(100);
	 
	 Video v1 = new Video("Løkker i java" , "Ole olsen", 500);
	 Video v2 = new Video("Hvordan bestå eksamen" , "Matias vedeler", 200);
	 Video v3 = new Video("How to program" , "Sven-Olai", 300);
	 
	 va.leggTil(v1);
	 va.leggTil(v2);
	 va.leggTil(v3);
	 
	 va.listeAlle("Ole olsen");
	 
	 va.bestePar(600);
	 
	 
  }
}
