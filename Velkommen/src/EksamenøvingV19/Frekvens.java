package EksamenøvingV19;

import java.util.*;

public class Frekvens {
	public static void main(String [] args ) {

	ArrayList<String> listeAvOrd = new ArrayList<String>();
	HashMap<String, Integer> fo = new HashMap<String, Integer>();
	
//	b Lag frekvensoversikten
	
	
	String[] s = {"det","er","alle","er","kanskje","er"};
	
	for(String e : s) {
		listeAvOrd.add(e);
	}
	
	
	
	for(String b : listeAvOrd) {
//		Integer frekvense = fo.get(b);
		if(!(fo.containsKey(b))){
			fo.put(b, 1);
		} 
			else { 
				fo.put(b, (fo.get(b)+1));
			}
			}
		
	Scanner sc = new Scanner(System.in);

	String tastatur = null;
//	a

	while(tastatur != "Q") {
		
		tastatur = sc.nextLine();
	System.out.println(fo.get(tastatur));

	
	
//	Integer svar = fo.get(tastatur);
//	
//	int frekvens = 0;
//		
//		if(svar != null) {
//			frekvens = svar;
//		}
	}
}
}
	
	



