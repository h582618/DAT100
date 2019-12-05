package EksamenøvingV19;

public class Graf2 {

	private static boolean[][] nabomatrise = { 
			{ false, true, false, true, false, false },
			{ true, false, true, false, true, true }, 
			{ false, true, false, false, false, true },
			{ true, false, false, false, false, false }, 
			{ false, true, false, false, false, true },
			{ false, true, true, false, true, false } };


	public static boolean erNaboer(int u, int w) {

		return nabomatrise[u][w];
	}

//	node 0 har 2 naboer, 1 og 
	public static int grad(int v) {

		int grad = 0;

		for (int i = 0; i < nabomatrise.length; i++) {
				if (nabomatrise[v][i]) {
					grad++;
				}
			}
		return grad;
	}

	public static int antallLokker() {

		int grad = 0;
		for (int i = 0; i < nabomatrise.length; i++) {
			for (int k = 0; k < nabomatrise[i].length; k++) {
				if (i == k && nabomatrise[i][k]) {
					
					grad++;
				}
			}
		}
		return grad;
	}
	public static boolean uavhengigMengde(int [] s) {
		for(int i = 0; i < s.length-1; i++) {
			for(int k = i+1; k < s.length; k++) {
				if(nabomatrise[s[i]][s[k]]) {
					return false;
					
				}
			}
		}
		return true;
	}
}