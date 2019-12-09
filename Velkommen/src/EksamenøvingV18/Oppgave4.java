package EksamenøvingV18;

public class Oppgave4 {
	public char[][] brett = { 
			{ 'I', 'I', 'I', 'I', 'I', 'I' }, 
			{ 'I', 'I', 'I', 'I', 'I', 'I' },
			{ 'B', 'I', 'G', 'G', 'G', 'G' }, 
			{ 'B', 'B', 'G', 'G', 'B', 'B' } };

	public boolean harTegn(int r, int k, char c) {

		if (brett[r][k] != 0 && brett[r][k] == c) {
			return true;
		}
		return false;
	}

	public boolean ingenBrikke(int r, int k) {
		return harTegn(r, k, 'I');
	}

	public void visTilstand() {
		for (int i = 0; i < brett.length; i++) {
			for (int k = 0; k < brett[i].length; k++) {
				if (brett[i][k] != 'I') {
					System.out.print(brett[i][k]);
				} else {
					System.out.print(" ");
				}

			}
			System.out.println("");
		}
			
		}
	public int hvilkenRekke(int k) {
		for(int i = 0; i < brett.length; i++) {
			if(!(ingenBrikke(i,k))) {
				if(i == 0) {
					return -1; 
				} else {
					return i-1;	
				}     
			}
		}
		return -1;
	}
	public void plasserBrikke(int k, char c) {
		
		int r = hvilkenRekke(k);
		if(r>= 0 ) {
			brett[r][k] = c;
		}
	}
	public boolean sjekkVannrett(int r, int k, char c) {
		boolean vannrett = true;
		while(vannrett == true && k < brett[r].length ) {
			if(brett[r][k] != c) {
				vannrett = false;
				
			}
			k++;
		}
		return vannrett;
		
	}
	public boolean fireVanrett(int r, char c) {
		
		for(int i = 0; i < brett[r].length; i++) {
			if(sjekkVannrett(r,i,c)) {
				return true;
			}
		}
		return false;	
	}
}

