package Forelesningeks;

public class FlerdimBoolean {

	public static void main(String[] args) {

		boolean[][] aud = { 
				{ false, false, false, false }, // rad 0
				{ false, false, true, false }, // rad 1
				{ true, false, true, true }, // rad 2
				{ true, true, true, true }, // rad 3
		};

		for (int r = 0; r < aud.length; r++) {

			boolean[] rad = aud[r];

			for (int p = 0; p < rad.length; p++) {

				boolean plass = rad[p];

				if (plass) {
					System.out.print("X");
				} else {
					System.out.print("O");
				}

			}
		
		System.out.println("");
	}
	}
}
