package EksamenøvingV19;

public class Oppgave1 {

//	a)
	public static void main(String[] args) {
	 System.out.println(5 + 3 * 2);  //11
	 System.out.println(9 % 5); // 4
	 System.out.println(9 / 5);  // 1
	 int i = 3;
	 int j = 7;
	 System.out.println( (i < 3) && (j >= 5) ); //false 
	 System.out.println( (j != 3) || (i < j) ); //true	 
	
//	 b
	 System.out.println(b(28, 12));  
	 
//	 x = 28, y = 12 
//	 x = 16, y = 12
//	 x = 4, y = 12
//	 x = 4, y = 8
//	 4
	 
//	 c
	 System.out.println(c(32812)); 
	 
//	 x = 3281
//	 x = 328
//	 x = 32
//	 x = 3
//	 x = 0
//   5

//	 d
	 System.out.println(f(4.0, 7));
	 
//	 11.0
//	 Her velges siste metode f fordi første i paramteren er double, mens den neste er int 
//	 hvis en er double, blir begge double. (+,-,*,/)
	 
//	 e
	 
	 e();
	 
//	 Lengden så langt : 1
//	 lengden så langt : 3
//	 lengden så langt : 6
	 
//	 Unntak nr 2 kasta.
	 
	 
//	 Linje utenfor løkken blir ikke utført fordi løkken ikke blir ferdig.
//	 Løkken blir ikke ferdig for tab[3] er tom (null). 
	 

	 
	 }
//	b
	public static int b(int x, int y) {
		 while (x != y) {
		 System.out.println("x = " + x + ", y = " + y);
		if (x > y) {
		 x = x - y;
		} else {
		 y = y - x;
		}
		 }
		 return x;
		 }
//	c
	public static int c(int x) {
		 int i = 0;
		 do {
		x = x / 10;
		i++;
		System.out.println("x = " + x);
		 } while (x != 0);
		 return i;
		}
	
// d	Merk at det er to metoder med navnet f.
	public static double f(int a, double b){
		 return a - b;
		 }
		 public static double f(double a, int b){
		 return a + b;
		 }


// e
public static void e() {
	 String[] sTab = new String[4];
	 sTab[0] = "a";
	 sTab[1] = "ab";
	 sTab[2] = "abc";
	 int totalLengde = 0;
	 try {
	for (int i = 0; i < sTab.length; i++) {
	 totalLengde += sTab[i].length();
	 System.out.println("Lengde så langt: " + totalLengde);
	}
	System.out.println("Total lengde av strengene: " + totalLengde);
	 } catch (ArithmeticException e) {
	 System.out.println("Unntak nr 1 kasta.");
	 } catch (NullPointerException e) {
	System.out.println("Unntak nr 2 kasta.");
	 } catch (Exception e) {
	System.out.println("Unntak nr 3 kasta.");
	 }
}
}
