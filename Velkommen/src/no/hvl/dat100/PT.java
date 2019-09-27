package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class PT {

        public static void main (String[] args) {
		String inputv = showInputDialog("Vekt");
		String inputh = showInputDialog("Høyde");
		String inputa = showInputDialog("Alder");
		String inputg = showInputDialog("cutting, bulking or maintenance");
		//String inputk = showInputDialog("Kjønn");
		
		double v = Double.parseDouble(inputv);
	    double h = Double.parseDouble(inputh);
		double a = Double.parseDouble(inputa);
	    
		
		//if(inputk.contentEquals("mann")) {
			
		//}
		
		double proteinb = 1.8;
		double carbob = 3.0;
		
		
		double proteinc = 2.4;
		double carboc = 2.0;
		
		double proteinm = 1.6;
		double carbom = 2.5;
		
		String b = "bulking";
		String c = "cutting";
		String m = "maintenance";
	
		System.out.print(bmr(v,h,a));
		
		if(inputg.contentEquals(b)) {
			showMessageDialog(null, v*proteinb + " g proteiner " + v*carbob + " g carbs" );
		}
		else if(inputg.contentEquals(c)) {
			
			showMessageDialog(null, v*proteinc + " g proteiner " + v*carboc + " g carbs");
		}
			
		else if(inputg.contentEquals(m)) {
			
			showMessageDialog(null,v*proteinm + " g proteiner " + v*carbom + " g carbs");
		}	
			
	
        }
        
		private static double bmr(double v, double h, double a) {
			
			
			double cals = (88.362+(13.397*v) + (4.799*h) - (5.677*a));
			
			return cals;
			
		
		}
		
}

	

		
	
	


