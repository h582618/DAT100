package SkoleprøveDat100;

public class Oppgave1 {
	
	public static void f(int a, int[] t) {
		 a = 7;
		 t[0] = 7;
		 }
		
	public static void main(String[] args) {
		 int b = 4;
		 int tab[] = {4, 3, 1};
		 f(b, tab);
		 
		 
		 System.out.println(b + " " + tab[0]);

		 // Kva er verdien av b og tab[0] her?
		 }
}