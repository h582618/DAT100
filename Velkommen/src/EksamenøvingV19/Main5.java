package EksamenøvingV19;

import java.util.*;

public class Main5 {

	public static void main(String[] args) {
		ArrayList<String> ListeAvOrd = new ArrayList<String>();
		HashMap<String, Integer> fo = new HashMap<String, Integer>();
		
		String[] LAO = {"er","det","alle","er","det","det"};
		
		for(int i = 0; i < LAO.length; i++ )
		ListeAvOrd.add(LAO[i]);
		
		
		for(String e : ListeAvOrd) {
			Integer v = fo.get(e);
			if(v != null) {
				fo.put(e, v+1);
			}else {
				fo.put(e, 1);
				}
				
			}
//		Går igjenom verdien.
		for(int e : fo.values()) {
			System.out.println(e);
		}
//		Går igjennom Nøkkelen
		for(String v : fo.keySet()) {
			System.out.println(v);
		}

//		a
		Scanner tastatur = new Scanner(System.in);
		for(int i = 0; i < ListeAvOrd.size(); i++ ) {
		
		System.out.println("Ord du vil vite frekvens for");
		
		
		String ord = tastatur.nextLine();
		
		
		Integer f = fo.get(ord);
		int frekvens = 0;
		if(f != null) {
			frekvens = f;
		}
		System.out.println(ord +" har frekvens : " + frekvens);
		}
		tastatur.close();
		

		
	

		
// b
		
				
	}	
	
	}
