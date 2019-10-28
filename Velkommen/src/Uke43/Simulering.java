package Uke43;

public class Simulering {
	private int[] antall;
	private int antallkast;
	private int[] kast;

	public void Simulering(int n) {

		antallkast = n;
		antall = new int[] { 1, 2, 3, 4, 5, 6 };
		kast = new int[n];

		int[] resultat = new int[6];
//		System.out.println("Du fikk " + oyne);
		for (int i = 0; i < antallkast; i++) {
//			Ny linje hvis den er 20,40,60,80 eller 100
			if (i == 20 || i == 20 * 2 || i == 20 * 3 || i == 20 * 4 || i == 20 * 5) {
				mrom();
			}
			Terning terning = new Terning();
			terning.trill();
			int oyne = terning.getOyne();
			kast[i] = terning.getOyne();
			System.out.print(kast[i] + " ");

//			Legger til terningkast i resultat listen

			for (int b = 0; b < antall.length; b++) {
				if (antall[b] == oyne) {
					resultat[b] = resultat[b] + 1;

				}

			}
		}
//		Statistikk
//		Printer ut ny linje deretter resultat

		mrom();
		mrom();
		double gsnitt = 0;
		for (int i = 0; i < resultat.length; i++) {
			System.out.println("Antall " + antall[i] + "-ere : " + resultat[i]);

		}
		int seks = 6;
		int teller = 0;
//		Regner ut gjennomsnitt
		for (int e : kast) {
			gsnitt = gsnitt + e;
//			Antall kast for å få den første 6eren	
			if(seks!= kast[teller]) {
				teller++;
			}
		
		}
		teller = teller +1;

		System.out.println("Antall kast for å få den første 6-eren: "+teller);
		
		System.out.println("Gjennomsnittskast : " + gsnitt / n);
//		Finner tallet det er flest av 
		
		int flest = resultat[0];
		for(int i = 1; i < resultat.length; i++) {
			flest = Math.max(resultat[i], flest);
		}
//		finner ut hvilket tall det er flest av 
		
//		TODO
//		Må finn en løsning når det gjelder lik max, f.eks hvis både 6-ere og 2-ere har samme antall er størst.
		
		int hvilke = 0;
//		int [] hvilke = new int[6] ;
		for(int c = 0; c < resultat.length; c++) {
			if(flest == resultat[c]) {
//				hvilke[c] = c;
				hvilke = c;
			}
		}
//		for(int e : hvilke) {
//			System.out.print(e);
		
//		}
		hvilke ++;
		
		System.out.println("Terningsverdien det var flest av : " + hvilke +", Antall: " +  flest);


	}

//  Mellomrom
	public void mrom() {
		System.out.println();

	}
}
