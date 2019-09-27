package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class Oppg5fakultet {

	public static void main(String[] args) {
		String Input = showInputDialog("Heltall");
		 
		int heltall = Integer.parseInt(Input);
		int fakultet = 1;
		
	    	if(heltall > 0) {
		
			
      		for(int n=1; n <= heltall; n++) {
		    fakultet *= n;
		
		
		  }
		   } 
		showMessageDialog(null,fakultet);
	
		}
		

}
