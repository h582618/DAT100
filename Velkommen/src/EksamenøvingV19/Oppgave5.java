package EksamenøvingV19;
import  java.util.*;

public class Oppgave5 {
	
	public static void main(String [] args) {
		ArrayList<String> listeAvOrd = new ArrayList<String>();
		HashMap<String, Integer> fo = new HashMap<String, Integer>();
		//b Lag frevensoversikten
		//a Leser inn et ord fra bruker og skriver ut tilhørende
		// frekvens
		
		listeAvOrd.add("er");
		listeAvOrd.add("det");
		listeAvOrd.add("alle");
		listeAvOrd.add("er");
		listeAvOrd.add("det");
		listeAvOrd.add("det");
//		a
		Scanner tastatur = new Scanner(System.in);
		System.out.println("Ord du vil vite frekvens for?");
		
		String ord = tastatur.nextLine();
		
		for(String e : listeAvOrd) {
			Integer k = fo.get(e);
			if(k == null) {
				fo.put(e, 1);
			} else {
				fo.put(e, k+1);
			}
		}
		
		
		Integer f = fo.get(ord);
		int frekvens = 0;
		if(f != null) {
			frekvens = f;
		}
		System.out.println(ord + " Har frekvens " + frekvens);
		
	
//	b lag frekvensoversikten

		
	}
	

	}


