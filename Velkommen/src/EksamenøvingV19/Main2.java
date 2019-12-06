package EksamenøvingV19;

import java.util.*;

public class Main2 {

	public static void main(String[] args) {
		Innlegg innlegg = null;
		Scanner tastatur = new Scanner(System.in);	
		
		System.out.println("Bruker");
		String bruker = tastatur.nextLine();
		
		System.out.println("Dato");
		String dato = tastatur.nextLine();
		
		System.out.println("1: Bilde \n2: Tekst \n Valg? ");
		int valg = tastatur.nextInt();
		
		
		switch(valg) {
		case 1: 
			System.out.println("Du har valgt bilde");
			String url = tastatur.nextLine();
			innlegg = new Bilde(bruker,dato,url);
			break;
		case 2: 
			System.out.println("Du har valgt tekst");
			String tekst = tastatur.nextLine();
			innlegg = new Tekst(bruker,dato,tekst);
			break;
		default : 
			System.out.println("Feilmelding1");
		}
		
		if(innlegg != null) {
			innlegg.skrivUt();
		}
		
	}
}
