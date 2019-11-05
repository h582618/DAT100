package Uke40;

import java.lang.StringBuilder;


public class Kvadrat {
private int sidelengde;

public Kvadrat(int sidelengde) {
	this.sidelengde = sidelengde;
}
public double areal() {
	double areal = sidelengde*sidelengde;
	
	return areal;
}
public double omkrets() {
	
	double omkrets = sidelengde*4;
	
	return omkrets;
}
public double diagonal() {
	double diagonal = Math.sqrt(2)*sidelengde;
	
	return diagonal;
}
public String stjerner() {
//	Lager en ny strinBuilder kalt 
	StringBuilder sb = new StringBuilder();
//	Legger til en stjerne for hver gang løkken kjøres, 
//	i dette tilfellet sidelengde ganger stjerne
	for(int i = 0; i < sidelengde; i++) {
		
		sb.append("* ");
	}
	return sb.toString();
	
	
}

public boolean sum(Kvadrat a, Kvadrat b) {
	
	
	return areal() == a.areal() + b.areal();
}


public String skrivUt() {
	
	stjerner();

	
	for(int i = 0; i < sidelengde; i++) {
		System.out.println(stjerner());
	}
	System.out.println("Omkretsen er : " + omkrets());
	System.out.println("Arealet er : " + areal());
	System.out.println("Diagonalen er : " + diagonal());
	System.out.println("");
	
	
	return stjerner();
			
}

}
