package no.hvl.dat100;

import static java.lang.Math.*;
import static javax.swing.JOptionPane.*;



public class uke3oppgave3 {

	public static void main(String[] args) {
		
 
		String input0  = showInputDialog("Legg inn tall her");
		String input1 = showInputDialog("Opphøyd i");
		
		double x = Double.parseDouble(input0);
		int n = Integer.parseInt(input1);
		int i = 1;
		double y = 1.0;
		while(i<=n) {
			i = i+1;
			y = y * x;
		}
		
		showMessageDialog(null,y);
		
		//showMessageDialog(null, Math.pow(x, n));
	}

}
