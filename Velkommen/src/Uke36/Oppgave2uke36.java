package Uke36;


public class Oppgave2uke36 {

	public static void main(String[] args) {
		
		System.out.println("x grader" + "   x i radianer" + "  sin(x)" + "   cos(x)" );
		
		
		int antall = 40;
		
		for(int i = 1; i<=antall; i ++) {
			System.out.print("-");
		}
		
		Double g	 =  0.0;
		Double maxgrader = 180.0;
		
		
		
		
		while(g<=maxgrader){
	
				
			Double radianer = Math.toRadians(g);
			System.out.println("");
		//	System.out.print(g + "    " + radianer + "    " + Math.sin(radianer) + "    " + Math.cos(radianer));
			System.out.printf("%1$9.3f %2$9.3f %3$9.3f %4$9.3f", g, radianer, Math.sin(radianer), Math.cos(radianer));
			
			g += 15.0;
		}
		    
		


		
		
		//System.out.println();
		
		//System.out.println("      0" + "         0.000" + "    0.000" + "     1.000" );
		
		
		//Double ViR = (Math.PI * grader1)/180;
		
		//System.out.println("      15" + "         1" + "     0.000" + "     1.000" );
		
	  }
	}


