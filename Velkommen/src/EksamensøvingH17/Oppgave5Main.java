package EksamensøvingH17;

public class Oppgave5Main {

	public static void main(String [] args) {
		
		int [][] matrise = { 
				{1,2,3},
				{4,-5,6},
				{-7,8,0}};
		
		Oppgave5 k1 = new Oppgave5(matrise);
		
		System.out.println(k1.erKvadratisk(matrise));
		
		System.out.println(k1.spor(matrise));
		
		System.out.println(k1.erPositivRekke(matrise, 0));
		
		System.out.println(k1.antallNuller(matrise));
		}
	}

