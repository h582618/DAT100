package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class Oppgave4Skatt {

	public static void main(String[] args) {
		String input = showInputDialog("Din inntekt");
		int inntekt = Integer.parseInt(input);

		int trinn0 = 164100;
		int trinn0max = 230950;
		double sats0 = 1.0093;
		double skatt0 = trinn0*sats0;
		double skattmax0 = trinn0max * sats0;
		
		double skatt_0 = 0;
	
		
		int trinn1 = 230950;
		int trinn1max = 580650;
		double sats1 = 1.0241;
		double skatt1 = trinn1*sats1;
		double skattmax1 = trinn1max * sats1;
		
		double skatt_1 = 0;
		
		int trinn2 = 580650;
		int trinn2max = 934050;
		double sats2 = 1.1152;
		double skatt2 = trinn2*sats2;
		double skattmax2 = trinn2max * sats2;
		
		double skatt_2 = 0;
		
		int trinn3 = 934050;
		double sats3 = 1.1452;
		double skatt3 = trinn3*sats3;
		
		double skatt_3 = 0;
		
		if(inntekt<=trinn0) {
			showMessageDialog(null,"ingen skatt");
		}
		if (inntekt>trinn0 && inntekt>trinn0max) {
				skatt_1 = skattmax0;
			}
		if(inntekt>trinn1 && inntekt>trinn1max) {
			    skatt_2 = skatt_1 + skattmax1;
		}
	
		if(inntekt>trinn2 && inntekt>trinn2max) {
		    skatt_3 = skatt_2 +skattmax2;
		}
		    
		     
		System.out.print(skatt_3);
	     }
		}

