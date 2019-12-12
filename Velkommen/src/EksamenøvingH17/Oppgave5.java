package EksamensøvingH17;

public class Oppgave5 {
	private int[][] matrise;

	public Oppgave5(int [][] matrise) {
		this.matrise = matrise;
	}
	public static boolean erPositiv(int[][] mat, int r, int k) {
		if (mat[r][k] > 0) {
			return true;
		}
		return false;
	}

	public static boolean erPositivRekke(int[][] mat, int r) {

		for (int i = 0; i < mat.length; i++) {
			if ((mat[r][i] <= 0)) {
				return false;
			}
		}
		return true;

//		Usikker på om dette vil funke? sjekk
//		for(int e : mat[r]) {
//			if(!(e > 0)) {
//				return false;
//			}
//		}
//		return true;
	}

	public int antallNuller(int[][] mat) {
		int teller = 0;
		for (int i = 0; i < mat.length; i++) {
			for (int k = 0; k < mat[i].length; k++) {
				if (mat[i][k] == 0) {
					teller++;
				}
			}
		}
		return teller;
	}

	public boolean erKvadratisk(int[][] mat) {
		int rader = 0;
		int kollonner = 0;
		for (int i = 0; i < mat.length; i++) {
			rader++;
			for (int k = 0; k < mat[i].length; k++) {
				kollonner++;
			}
//			Eller dette?
//			int lengde = mat.length-1;
//			int lengde2 = mat[1].length;
		}
		if (kollonner == rader*rader) {
			return true;
		}
		return false;
	}

	public static int spor(int[][] mat) {
		int n = 0;
		int diag = 0;
		for (int i = 0; i < mat.length; i++) {
			for (int k = 0; k < mat[i].length; k++) {
				if (k == 0) {
					diag += mat[i][k + n];
				}

			}
			n++;
		}
		return diag;
	}
}
