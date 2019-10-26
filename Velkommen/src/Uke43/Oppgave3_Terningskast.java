package Uke43;

import java.util.*;

public class Oppgave3_Terningskast {

	
	
	
	public static void main(String[] args) {

		int [] antall = new int[7];
		
		int [] resultat = {0,1,2,3,4,5,6};
		
		int kast = 0;
		
		while(kast <= 20) {
			int v = random();
			kast++;
			for(int i=0; i < resultat.length; i++ ) {
				if(v==resultat[i]) {
					antall[i] = antall[i]+1;
				}
				
			}
			System.out.print(v+" ");
		}
		System.out.println();
		
		System.out.println("antall kast " + kast);
		for(int i=1; i < antall.length; i++) {
			System.out.println("Antall " + i+"-ere" + " " + antall[i]);
		}
	}

	
	public static int random() {
		
		Random ran = new Random();
		int t = ran.nextInt(7);
		
		return t;
	}
}
