package no.hvl.dat100;

import static javax.swing.JOptionPane.showInputDialog;

public class Oppgave2 {

public static void main(String[] args) {
	
	String input1 = showInputDialog("Legg inn tall 1");
		
	String input2 = showInputDialog("Legg inn tall 2");
	
	String input3 = showInputDialog("Legg inn tall 3");
		
		int tall1 = Integer.parseInt(input1);
		int tall2 = Integer.parseInt(input2);
		int tall3 = Integer.parseInt(input3);
		
		int f�rsteTall =0;
		int andreTall = 0;
		int tredjeTall = 0;
		
		//f�rstetall
		
		if(tall1>tall2 && tall1>tall3) {
			f�rsteTall = tall1;
		  }
		else if(tall2>tall1 && tall2>tall3) {
			f�rsteTall = tall2;
		
		}
		else if(tall3>tall1 && tall3>tall2) {
			f�rsteTall = tall3;
		   }
		
		//andreTall
		
		
		if(f�rsteTall==tall1 && tall2>tall3) {
			
			andreTall = tall2;	
		  }
		 else if(f�rsteTall==tall2 && tall3>tall2) {
			andreTall = tall3;
	    	}
		 else if(f�rsteTall==tall3 && tall2>tall1) {
			andreTall = tall2;
		   }
		
		
		//Tredjetall
		
         if(andreTall==tall1 && tall2>tall3) {
			
			tredjeTall = tall2;	
		  }
		 else if(andreTall==tall2 && tall3>tall1) {
			tredjeTall = tall3;
	    	}
		 else if(andreTall==tall3 && tall1>tall2) {
			tredjeTall = tall1;
		   }
		
		
		System.out.print("F�rstetall " + f�rsteTall + " Andretall "+ andreTall + " Tredjetall " + tredjeTall);
	}

}
