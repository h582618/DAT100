package Uke39;

public class Oppgave1 {
	
	    public static void main(String[] args) {
	    
	    // Lager en dobbel tabell med gitt antall rekker
	    boolean aud [] [];
	    
	    int antall = 4;
	    int rader = 4;
	    
	    boolean [] [] rom222 = new boolean [rader] [antall];
	    boolean [] [] aud1=
	        {
	                {false, false, false, false},
	                {false, false, true, false},
	                {true, false, true, true},
	                {true, true, true, true}
	        };
	    
	    // Opptelling av plasser
	    int antalls= 0;
	    double opptatt = 0.0;
	    for (int t = 0; t < aud1.length; t++ ) {
	        boolean[] rad = aud1[t];
	    
	        for (int i = 0; i < rad.length; i ++) {
	            boolean plass = rad[i];
	            
	        
	            if (plass) {
	                antalls++ ;    
	            } else{
	                opptatt++;
	            }
	        }
	    
	    } System.out.println(antalls);
	        
	        double prosentandel = (opptatt/(opptatt + antalls))*100;
	        System.out.println(prosentandel + "%");
	        
	    for (int i = 0; i < aud1.length; i++) {
	        
	        boolean[] rad = aud1[i];
	        
	         for (int t = 0; t < aud1.length; t++) {
	            boolean plass = rad[t];
	            
	            if (plass) {
	                System.out.println("rad: " + (i + 1) + ", " + "rekke: " + (t+1));
	                i = aud1.length;
	            }
	        }
	        
	         boolean ferdig = false;
	         
	    } 
	    outerloop:
	    for (int i = aud1.length-1; i > 0; i--) {
	        boolean[] rad = aud1[i];
	        
	         for (int t = aud1.length-1; t > 0; t--) {
	            boolean plass = rad[t]; 	
	            
	            if (plass) {
	                System.out.println("rad: " + (i + 1) + ", " + "rekke: " + (t+1));
	                break outerloop;
	                
	        
	               
	                
	            }
	        }
	        
	    }
	    }
	}

