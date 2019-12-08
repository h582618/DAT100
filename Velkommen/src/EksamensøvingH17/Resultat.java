package Eksamens�vingH17;

public abstract class Resultat {
	private String navn;
	private char kj�nn;
	
	public Resultat(String navn, char kj�nn) {
		this.navn = navn;
		this.kj�nn = kj�nn;
	}
	public String getNavn() {
		return navn;
	}
	public void setNavn(String navn) {
		this.navn = navn;
	}
	public char getKj�nn() {
		return kj�nn;
	}
	public void setKj�nn(char kj�nn) {
		this.kj�nn = kj�nn;
	}

	public abstract int poeng();
	
	public String toString() {
		String sex = "";
		switch(kj�nn) {
		case 'M':
			sex = "Mann";
			break;
		case 'K':
		    sex = "Kvinne";
	        break;
		default: 
			sex = "Ugyldig Kj�nn";
		}
		return "Navn: " + navn + ", Kj�nn: "+ sex;
	}
}
