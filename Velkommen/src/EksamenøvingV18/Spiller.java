package EksamenøvingV18;

public class Spiller {
	private String dato;
	private String navn;
	private int antallFerdige;
	private int[] resTab;

	public Spiller(String dato, String navn, int antall) {
		this.navn = navn;
		this.dato = dato;
		resTab = new int[antall];
		antallFerdige = 0;
	}

	public String getDato() {
		return dato;
	}

	public void setDato(String dato) {
		this.dato = dato;
	}

	private String getNavn() {
		return navn;
	}

	public void setNavn(String navn) {
		this.navn = navn;
	}

	public int getAntallFerdige() {
		return antallFerdige;
	}

	public void leggTilRes(int r) {

		if (resTab.length > antallFerdige) {
			resTab[antallFerdige] = r;
			antallFerdige++;
		}
	}

	public int antallOverPar(int[] parTab) {
		int fler = 0;
		for (int i = 0; i < resTab.length; i++) {
			if (resTab[i] > parTab[i]) {
				fler++;
			}
		}
		return fler;
	}

	public void visScore(int[] parTab) {

		String navn = null;
		System.out.println(toString());
		for (int i = 0; i < antallFerdige; i++) {
				if (resTab[i] == 1) {
					navn = "Hole in one";
				} else {

					int score = parTab[i] - resTab[i];
					switch (score) {
					case 1:
						navn = "Birdie";
						break;
					case 2:
						navn = "Eagle";
						break;
					case 3:
						navn = "Albatross";
						break;
					case 4:
						navn = "kondor";
						break;
					default: 
						navn = "";
						break;
					}
				}

			System.out.println("Hull " + (i+1) +": " + resTab[i] + " ("+parTab[i]+") "+"- " + navn);

		}
	}

	public int sumSlag() {
		int sum = 0;
		for (int i = 0; i < antallFerdige; i++) {
			sum = sum + resTab[i];
		}
		return sum;
	}

	public boolean erFerdig() {
		boolean ferdig = true;
		for (int e : resTab) {
			if (e < 0) {
				return false;
			}
		}
		return ferdig;
	}

	public String toString() {
		return navn + ", " + dato + ", Sum slag: " + sumSlag() + " etter " + antallFerdige + " av " + resTab.length
				+ " hull\n";
	}
}
