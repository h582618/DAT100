package no.hvl.dat100;

public abstract class Skuddaar {

	public static void main(String[] args) {

		int aar = 2000;
		int mnd = 2;

		int dager = 31;
		if (mnd == 4 || mnd == 6 || mnd == 9) {
			dager = 30;
		} else {
			if (mnd == 2) {
				dager = 28;
				boolean skuddar = (aar % 4 == 0) && (aar % 100 != 0);
				if (skuddar) {
					dager = 29;
				}
			}
		}
		System.out.println(dager);
	}
}
