package EksamenøvingV19;

public class Graf {
	// matrisen i eksemplet over
	private boolean[][] nabomatrise = { { false, true, false, true, false, false },
			{ true, false, true, false, true, true }, { false, true, false, false, false, true },
			{ true, false, false, false, false, false }, { false, true, false, false, false, true },
			{ false, true, true, false, true, false } };

//	a
	public boolean erNaboer(int u, int w) {
		return nabomatrise[u][w];
	}
//  b
	public int grad(int v) {
		int teller = 0;

		for (int i = 0; i < nabomatrise.length; i++) {
			if (nabomatrise[v][i]) {
				teller++;
			}
		}
		return teller;
	}
// c
	public int antallLokker() {
		int teller = 0;

		for (int i = 0; i < nabomatrise.length; i++) {
			if (nabomatrise[i][i]) {
				teller++;

			}
		}
		return teller;
	}
// d
	public boolean uavhengigMengde (int[] s) {
		for(int i = 0; i < s.length; i++) {
			for(int j = i+1; i < s.length; j++) {
				if(erNaboer(s[i],s[j])) {
					return false;
				}
			}
			
		}
		return true;
	}
}


