package EksamensøvingH17;

public abstract class Resultat {
	private String navn;
	private char kjønn;
	
	public Resultat(String navn, char kjønn) {
		this.navn = navn;
		this.kjønn = kjønn;
	}
	public String getNavn() {
		return navn;
	}
	public void setNavn(String navn) {
		this.navn = navn;
	}
	public char getKjønn() {
		return kjønn;
	}
	public void setKjønn(char kjønn) {
		this.kjønn = kjønn;
	}

	public abstract int poeng();
	
	public String toString() {
		String sex = "";
		switch(kjønn) {
		case 'M':
			sex = "Mann";
			break;
		case 'K':
		    sex = "Kvinne";
	        break;
		default: 
			sex = "Ugyldig Kjønn";
		}
		return "Navn: " + navn + ", Kjønn: "+ sex;
	}
}
