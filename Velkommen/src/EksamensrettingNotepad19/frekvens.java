package EksamensrettingNotepad19;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class frekvens {
	public static void main(String [] args ) {

	ArrayList<String> listeAvOrd = new ArrayList<String>();
	HashMap<String, Integer> fo = new HashMap<String, Integer>();
	
	String[] s = {"det","er","alle","er","kanskje","er"};
	
	for(String e : s) {
		listeAvOrd.add(e);
	}
	  for(String e : listeAvOrd) {
		  
		  if(!fo.containsKey(e)) {
			  fo.put(e,1);
		  } else {
			fo.put(e,(fo.get(e)+1));  
		  }      
	  }  
		  System.out.println("Ord du vil vite frekvens for");
	
	      Scanner sc = new Scanner(System.in);
		  String tastatur = sc.nextLine();
		  
		  System.out.print("Frekvensen er " + fo.get(tastatur));
		 
		  sc.close();
		  
		
	
		  }
	}	

