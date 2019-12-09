package EksamensøvingH13;

public class Oppgave1 {

	public static void main(String[] args) {
//	a

				int x = 4;
				System.out.println("y = ");
				System.out.println(x * 2 + (x/3) * (x-3));
				
				
				System.out.println(" ");
				

				
			
				for(int i = 10; i > 0; i = i-2) {
					System.out.println(i-1);
				}
				
				
						
				System.out.println(" ");
//	c			
				AnnenKlasse f = new AnnenKlasse();
				AnnenKlasse b = new AnnenKlasse(2);
				
				System.out.println(f.regnUt());
				System.out.println(b.regnUt(3));
				System.out.println(b.regnUt(10));
//		d
				
				System.out.println(" ");
				
				KlasseEn etObjekt = new KlasseTo();
				System.out.println(etObjekt);
		
				System.out.println(" ");
				
//		e
				try {
					int k = 3;
					k = k /0;
					System.out.println(k);
				} catch (NullPointerException ex) {
					System.out.println("Unntak nr. 1 kastet");
					
				} catch (ArithmeticException ex) {
					System.out.println("Unntak nr. 2 kastet");
				}
				
			}
	


}
