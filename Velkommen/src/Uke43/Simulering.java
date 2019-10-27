package Uke43;

public class Simulering {
	private int [] antall;
	private int antallkast;
	private int [] kast;	
	
	public int [] Simulering(int n) {
		antallkast = n;
		antall = new int [] {1,2,3,4,5,6};
		kast = new int [100];
		
		int [] resultat = new int [6];
//		System.out.println("Du fikk " + oyne);
		for(int i = 0; i < antallkast; i++) {
//			Ny linje 
			if( i == 20 || i == 20*2 || i == 20*3 || i ==20*4 || i == 20*5){
				mrom();
			}
			Terning terning = new Terning();
			terning.trill();
			int oyne = terning.getOyne();
			kast[i]=terning.getOyne();
			System.out.print(kast[i]+" ");
			
			
		for(int b = 0 ; b < antall.length; b++) {
			if (antall[b] == oyne ) {
				resultat[b] = resultat[b] + 1;
				
			}
			
		}
		}
//		Printer ut ny linje deretter resultat
		mrom();
		int i = 0;
		for(int e : resultat) {
			i++;
			System.out.println("Antall " + i+"-ere "+e);
		
		}
	return resultat;
	}
	public void mrom() {
		System.out.println();
		
	}
}

