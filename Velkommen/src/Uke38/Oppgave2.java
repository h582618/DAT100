package Uke38;



import static javax.swing.JOptionPane.*;
import java.lang.System.*;


public class Oppgave2 {

	public static void main(String[] args) {
	
		//2a
		//Ny streng
		
		String t = showInputDialog("Mønster");
		
		
		int antallord = 5;
		String input [];
		input = new String[antallord];
		for(int i = 0; i <antallord; i++) {
		 String s = showInputDialog("Skriv inn String her");
		 input[i] = s;
		 
		}
		System.out.print("[");
		for(int k = 0; k <input.length; k++) {
			System.out.print(input[k]+", ");
		}
		System.out.println("]");
		
		
//		System.out.println("Ditt mønster er " + t +" og er på plass");
		//2b
	    int plass = 0;
	    int antall = 0;
		 
		for(int k = 0; k < input.length; k++) {
			
		if( input[k].contentEquals(t)) { 
			plass = k;
			antall ++;
			
	       System.out.println((plass+1));
	       
		}	
}	
		
//		2ck
		String k = null;
		
		for(int i = 0; i < input.length; i++ ) {
			k = input[i];
			if(k.length() == 1 ){
				System.out.println(k);
				}
			else if (k.length() % 2 == 0) {
				System.out.print(k.charAt((k.length()-1)/2));
				System.out.println(k.charAt(((k.length()-1)/2)+1));
				
				}
			else if (k.length() >= 3) {
				System.out.print(k.charAt((k.length()-2)/2));
				System.out.print(k.charAt(((k.length()-2)/2)+1));
				System.out.println(k.charAt(((k.length()-2)/2)+2));
			}
			
			//2d 
			
				
			}
		
	
		baklengs("test");
	}
         
	
	
	public static String baklengs(String k) {

		int c = 1;
			for(int i=0 ; i <k.length(); i++) {
				
				int t = k.length()-c;
	
				char b = k.charAt(t);

				c++;
				System.out.print(b);
				
			}
		return k;
	}

	
	}
//		System.out.println("Mønsteret ditt er " + antall + " ganger i tabellen");
	//	System.out.print(t.contains("br"));
	

	
