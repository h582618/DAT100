package no.hvl.dat100;

public class Firegangen {

	public static void main(String[] args) {

		final int Maks = 4;
			//Overskrift 
		System.out.print(" * ");
		for(int j = 1; j <=Maks; j++) {
			System.out.print(" " + j + " ");
		}
		System.out.println();
		for(int i= 1; i<=Maks; i++) {
			System.out.print(" " + i + " ");
			for (int j = 1; j <= Maks; j++) {
				if (i*j<10) {
					System.out.print(" ");
				}
				System.out.print(i*j + " ");
			}
			System.out.println();
		}
		}
	}


