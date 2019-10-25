package Uke43;

public class MiniExcel {

	private static int[][] data = { 	
			{ 1, 2, 0 }, 
			{ 3, 4, 0 },
			{ 5, 6, 0 }, 
			{ 0, 0, 0 } 
			
	};

	public static void skrivUt() {

		System.out.println("-----");
		for(int [] rad: data) {
			
			for(int v : rad ) {
				System.out.print(v+" ");
			}
			System.out.println();
		}

		System.out.println("-----");
	}

	public static void beregnSum() {


		
		System.out.println("------");
		int k = 0;
		int sum= 0;
		
		int sum1 = 0;
		
//		ikke utvidet for løkke, bruk en vanlig en!
		
		for(int i = 0 ; i < data.length-1; i++) {
			int rad [] = data[i];
			
			for(int b = 0; b <rad.length-1; b++) {
				System.out.print(rad[b]+" ");
				sum = sum + rad[b];
			}
			
			System.out.print(sum);
			sum=0;
			System.out.println();
		}
		// for hver rad (med unntak av siste rad) summer elementene 
		// og skriv summen i den siste posisjonen for den aktuelle raden

		for(int e = 0; e < data.length-1; e++) {

		for(int c = 0; c < data.length; c++) {
			sum1 = sum1 + data[c][k]; 
			
		}
		k++;
		System.out.print(sum1+" ");
		sum1 = 0;
		
		
	}
		System.out.println();
		System.out.println("------");
	}

	public static void main(String args[]) {

//		skrivUt();
		beregnSum();
		

	}
}
