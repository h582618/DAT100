package EksamenøvingV18;

public class Oppgave1Main {
	
		public static void ma() {
			double a = 4.1;
			double b = 2.7;
			String s = "abcde";

			System.out.println(4 + 5 / 2); // precedens og heltalsdivision 4 + (5 / 2)
			
			System.out.println(13 % 4);    // rest ved divisjon med 4
			
			System.out.println(!(a > b));             // operatorer
			System.out.println((a < b) || (a != 0));
			
			System.out.println('a' == 'A');
			
			System.out.println("1" + "7");    // + blir sammensetting av strenger pga. type på argumenter
			
			System.out.println(s.charAt(2));  // indeksering fra 0 i tekststrenger
			
	}

		public static void mb(int n) {        // forstå kontrollstrukturer - her for
			
			for (int i = 0; i < n; i++) {     // bruk papir og pen til en slik oppgave
				
				for (int j = i; j < n; j++) {
					
					System.out.print("#");
				}
				
				System.out.println();
				
			}
		}

		public static void mc() {
			
			int i = 5;
			
			do {
				
				System.out.println(i);
				i = i - 2;
				
			} while (i > 0);

		}

		public static int d(int a, int b) {
			
			a = 2 * a;
			
			b = b / 2;
			
			System.out.println(" I metode d: a = " + a + ", b = " + b);
			
			return a * b;
		}
		
		public static void md() { // metodekald - formelle og aktuelle parametre
			
			int a = 3;
			int b = 5;
			
			int c = d(a, b);
			System.out.println("a = " + a + ", b = " + b + ", c = " + c);
			
			c = d(b, a);
			System.out.println("a = " + a + ", b = " + b + ", c = " + c);
		} 

		public static void main(String[] args) {
			System.out.println("=========================\n");
			ma();
			System.out.println("=========================\n");
			mb(3);
			System.out.println("=========================\n");
			mc();
			System.out.println("=========================\n");
			md();
			System.out.println("=========================\n");
			
			

		}

	}


