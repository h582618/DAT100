package EksamenøvingV19;

import java.util.*;

public class Main2 {

	public static void main(String[] args) {
		Scanner tastatur = new Scanner(System.in);	
		
		System.out.println("Bruker");
		String bruker = tastatur.nextLine();
		
		System.out.println("Dato");
		String dato = tastatur.nextLine();
		
		System.out.println("Url");
		String url = tastatur.nextLine();
		
		
		Bilde b1 = new Bilde(bruker,dato,url);
		
		b1.skrivUt();
	}
}
