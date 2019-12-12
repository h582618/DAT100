package EksamenrettingV19;

public class Oppg1 {

		
		
		public static void metode1(int a, int b) {
			   int temp = a;
			   a = b;
			   b = temp;
			}

			public static void metode2(int[] tabell) {
			   int temp = tabell[0];
			   tabell[0] = tabell[1];
			   tabell[1] = temp;
			}

			public static void main(String[] args ) {
			   int[] tab1 = { 1, 2 };
			   int[] tab2 = { 1, 2 };

			   metode1(tab1[0], tab1[1]);
			   System.out.println(tab1[0] + " " + tab1[1]);

			   metode2(tab2);
			   System.out.println(tab2[0] + " " + tab2[1]);
			} 

}
