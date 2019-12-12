package EksamensrettingNotepad19;

import java.util.Scanner;

public class Mainoppg2 {

	public static void main(String [] args) {
		   
		   Scanner sc = new Scanner(System.in);
		   
		   System.out.println("Tast inn Bruker");
		   
		   String bruker = sc.nextLine();
		   
		   System.out.println("Tast inn Dato");
		   
		   String dato = sc.nextLine();
		   
		   System.out.println("Bilde eller Tekst?");
		   
		   String valg = sc.nextLine();
		   
		   Innlegg i1 = null;
		   
		   if(valg.equals("Bilde")){
			  System.out.println("Tast inn URL");
            String url = sc.nextLine(); 			  
		       i1 = new Bilde(bruker, dato, url); 
		   }  else if(valg.equals("Tekst")) {
			   System.out.println("Tast inn tekst");

               String tekst = sc.nextLine(); 			  
		       i1 = new Tekst(bruker, dato, tekst);
			} else {
				System.out.print("Ugyldig verdi");
			}
		   
		   if(i1 != null) {   
		   i1.skrivUt();

		   }
		   
	   }

	
}
