package Uke38;

import java.io.*;

import static javax.swing.JOptionPane.*;
import java.lang.System.*;


public class Oppgave2 {

	public static void main(String[] args) {
	
		//2a
		//y streng

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
		
		
	System.out.println("Ditt mønster er " + t +" og er på plass");
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
//		System.out.println("Ditt mønster er " + antall + " ganger i tabellen");
//		
////		2c
//		String k = null;
//		
//		for(int i = 0; i < input.length; i++ ) {
//			k = input[i];
//			if(k.length() == 1 ){
//				System.out.println(k);
//				}
//			else if (k.length() % 2 == 0) {
//				System.out.print(k.charAt((k.length()-1)/2));
//				System.out.println(k.charAt(((k.length()-1)/2)+1));
//				
//				}
//			else if (k.length() >= 3) {
//				System.out.print(k.charAt((k.length()-2)/2));
//				System.out.print(k.charAt(((k.length()-2)/2)+1));
//				System.out.println(k.charAt(((k.length()-2)/2)+2));
//			}
//			
//				
//			}
		
	//
      
	
	
		String b [] = {"Test","Skiwe","ost","okei"}; 
		
       Sammenligning(b);
		
       
//       String test = "test";
//       
//       String Best = "Best";
//	
//       System.out.println(test.compareTo(Best));
//		
	
	}
         
	
	//2d
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

	//2e
	public static String [] Sammenligning(String [] t) {
		int temp = 0;
		int temp2 = 0;
		
		for(int i = 1; i < t.length; i++) {
			int var1 = t[i].compareTo(t[i]);
			if(var1 <= 0 ) {
				var1 = temp;
			}
			else {
				var1 = temp2;
				}
			
//		
			}
		
		
		return t;
	}
	
	
	
	
	
	
	
	
	
	
//		public static String Unikode(String t ) {
//			
//					
//			
//					byte [] array1 = t.getBytes();
//				
//					int antallchars = 0;
//					int verdi = 0;
//					
//					for(int i = 0; i < array1.length; i++) {	
//						verdi += array1[i];
//						antallchars ++;
//					}
//				
//					System.out.println(verdi);
//					System.out.println(antallchars);
//					
//					System.out.println(verdi/antallchars);
//			
//			return t;
//		}
//		 public static String [] første(String [] tabell) {
//		    	
//			 for(int i = 0; i < tabell.length; i++) {
//		    		tabell[i] = b;
//		    	}
//	    	return tabell;   
//		 }
}
	
//		System.out.println("Mønsteret ditt er " + antall + " ganger i tabellen");
	//	System.out.print(t.contains("br"));
	