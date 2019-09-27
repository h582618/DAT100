package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class Nedboer {
	public static void main(String[] args) {
     String melding = "Nedbør i antal mm for dag";
     final int ANT_DAGER = 3;	
     int sum = 0 ;
     for(int dagnr = 1; dagnr <= ANT_DAGER; dagnr++)
     {
     int nedboer = Integer.parseInt(showInputDialog(melding+dagnr));
     sum += nedboer;
	}
     showMessageDialog(null, "Sum nedboer: " + sum);
     
}
}