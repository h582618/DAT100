package no.hvl.dat100;

import static javax.swing.JOptionPane.*;


public class WhileEks {

	public static void main(String[] args) {
	    String melding = "H�yde i Cm, avslutt med 0";
		int h�yde;
		
		h�yde = Integer.parseInt(showInputDialog(melding));
		
		
		int sum = 0;
		int antall = 0;
		while(h�yde != 0) {
		   sum += h�yde;
		   antall++;
		   h�yde = Integer.parseInt(showInputDialog(melding));
			
		}
		double snitt = (double)sum/antall;
		
		showMessageDialog(null, "gjenomsnitt " + snitt);
		}
	}


