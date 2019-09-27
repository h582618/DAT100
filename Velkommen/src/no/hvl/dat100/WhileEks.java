package no.hvl.dat100;

import static javax.swing.JOptionPane.*;


public class WhileEks {

	public static void main(String[] args) {
	    String melding = "Høyde i Cm, avslutt med 0";
		int høyde;
		
		høyde = Integer.parseInt(showInputDialog(melding));
		
		
		int sum = 0;
		int antall = 0;
		while(høyde != 0) {
		   sum += høyde;
		   antall++;
		   høyde = Integer.parseInt(showInputDialog(melding));
			
		}
		double snitt = (double)sum/antall;
		
		showMessageDialog(null, "gjenomsnitt " + snitt);
		}
	}


