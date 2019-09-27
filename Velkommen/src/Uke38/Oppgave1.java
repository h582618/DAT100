package Uke38;

public class Oppgave1 {

	public static void main(String[] args) {
// test
		int tabell1[] = { 3, 8, 10, 11,  };

		int tabell2[] = { 6, 19, 23, 9, 101 };
		
		erSortert(tabell1);
		
		
		/*
		skrivUt(tabell1);


		summer3(tabell1);
		
		
		finnesTall(tabell1, 5);

		
		 
		posisjonTall(tabell1, 10);
		
		
		reverser(tabell1);
		
	
		settSammen(tabell1, tabell2);
		*/
	}
    // 1a
	public static void skrivUt(int[] tabell) {
		System.out.print("[ ");
		for (int i = 0; i < tabell.length; i++) {
			System.out.print(tabell[i] + ", ");
		}
		System.out.print("]");
	}
     // For løkke
	public static void summer(int[] tabell) {
		int tabelltotal = 0;
		for (int i = 0; i < tabell.length; i++) {
			tabelltotal = tabelltotal + tabell[i];
		}
		System.out.print(tabelltotal);

	}
	// While løkke
	public static void summer2(int[] tabell) {
		int tabelltotal = 0;
		int i = 0;
		 while (i <  tabell.length) {
	      tabelltotal = tabelltotal + tabell[i];
			 i++;
		 
		 
		}
		System.out.print(tabelltotal);
}
	// utvidet for løkke
	public static void summer3(int[] tabell) {
		int tabelltotal = 0;
		for (int e : tabell) {
			tabelltotal = tabelltotal + e;
			
		}
		System.out.print(tabelltotal);
}
	//1c 
	
	public static boolean finnesTall(int[] tabell,int tall) {
		
		boolean funnet = false;
		
		int i = 0;
		while(!funnet && i < tabell.length) {
			if(tabell[i]==tall) {
				funnet = true;
				System.out.print("Fant den");
			 
			} 
			i++;
			
			
			}
		return funnet;
	}
	
	   //1d
	
	 public static int posisjonTall(int[] tabell,int tall) {
		for(int i=0; i < tabell.length; i++) {
			if(tabell[i] == tall) {
		     	System.out.print("["+i+"]");
		     	}
			
		    
	 }
		return -1;	
	}
	
	 //1e
	 
	 public static int [] reverser(int[] tabell)  {
		 for(int i=0; i < tabell.length / 2; i++) {
			 int temp = tabell[i];
			 tabell[i] = tabell[tabell.length - i -1	];
			 tabell[tabell.length - i -1 ] = temp;
			 
		 }
		 skrivUt(tabell);
		 return tabell;
		 }
	 //1f 
	 
	 public static boolean erSortert (int[] tabell) {
		 boolean sortert = true;
		 boolean sortert2 = true;
		 
		  for(int i = 0; i < tabell.length-1; i++) {
			  if(tabell[i] < tabell[i+1]) {
				  sortert = true;
			  }
			  else {
				  sortert2 = false;
			  }
				 	  
	 }
		  System.out.print(sortert&&sortert2);
		  return sortert;
	 }
	 
	 
	 //1g
	 public static int[] settSammen(int[] tabell1,int[] tabell2) {
	
		 int [] tabellt;
		 tabellt = new int [tabell1.length+tabell2.length];
		
		 for(int i = 0; i < tabell1.length; i++) {
			 tabellt[i] = tabell1[i];
		 }
		 int i = tabell1.length;
		 for(int k = 0; k < tabell2.length; k++) {
			 tabellt[i] = tabell2[k];
			 i++;
		 }
		 
		 skrivUt(tabellt);
		 return tabell1;
	 }
	 }



