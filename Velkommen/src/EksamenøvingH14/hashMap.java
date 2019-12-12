package EksamenøvingH14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Scanner;


import static javax.swing.JOptionPane.*;

public class hashMap {

	public static void main(String[] args) {
		
		HashMap <String, Integer> ft = new HashMap<String, Integer>();
		String[] data = lesDataFraFil();

		
		for(int i = 0; i < data.length; i++) {
			
			
			Integer p = ft.get(data[i]);
			if(p == null) {
				ft.put(data[i], 1);
			}
			else { 
				ft.put(data[i], p+1);
				
			}
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Hvilke ord vil du vite frekvens for");
		String input = sc.nextLine();
		
		if(ft.get(input) != null) {
			System.out.println(ft.get(input));
		} else {
			System.out.println("O");
		}
		
		
	
		System.out.println(ft);
			
		

	}
	public static String [] lesDataFraFil() {
		String [] tab = null;
		
		try {
			
			PrintWriter ord = new PrintWriter("hashmap.txt");
			String flereOrd = "Er, det, alle, det, det";
			ord.println(flereOrd);
			ord.close();
			
			Scanner sc = new Scanner(new File(("hashmap.txt")));
			while(sc.hasNextLine()) {
				String setning = sc.nextLine();
				 tab = setning.split(", ");
			}
			
			} catch(FileNotFoundException e) {
			System.out.println("Finner ikke filen");
			}
		
		return tab;
	}

}
