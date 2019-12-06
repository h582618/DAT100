package EksamenøvingH18_2;

import java.util.ArrayList;

public class Rute {
	Punkt[] punkter;
	private int antall = 0;

	public Rute(int n) {
		punkter = new Punkt[n];
		
		
	}
	public int antall() {
//		return antall;
//		Hvis vi lager antall variabel slipper vi all kode nedenfor
	    int a = 0;
	    int i = 0;
	    while(punkter[i] != null && i < punkter.length) {
	    	a++;
	    	i++;
	    }
//	    Alternativ
//	    for(int i = 0; i < punkter.length; i++) {
//			if(punkter[i] != null) {
//				a++;
//			}
//		}
		return a;
		
	}
	public boolean leggtil(Punkt p) {
		if(antall < punkter.length) {
			punkter[antall()+1] = p;
//			antall()++;
//			Hvis vi har antall variabel bruker vi heller denne
			return true;
		}
		return false;
		
	}
	public boolean leggTilPunkt(double breddegrad, double lengdegrad, double hoyde) {
		Punkt s1 = new Punkt(breddegrad, lengdegrad, hoyde);
		return leggtil(s1);
		
		
	}
	
	public Punkt[] komrpimer() {
		
		Punkt[] p = new Punkt[antall()];
		
		for(int i = 0 ; i < antall(); i++) {
			p[i] = punkter[i];
		}
		return p;
	}
	
	public double hoyestepnkt(Rute rute) {
		Punkt[] p = rute.komrpimer();
		
		double hp = 0.0;
		
		for(int i = 0; i < p.length; i++) {
			if(p[i].getHoyde() > hp) {
				hp = p[i].getHoyde();
			}
		}
		return hp;
	}
	public double lengde(Rute rute) {
		Punkt[] p = rute.komrpimer();

		
		return avstand(p[0],p[antall()]);
		
//		Forsøkte forløkke, men fant bedre alternativ
//		double lengde = 0.0;
//		for(int i = 0; i < p.length-1; i++){
//			avstand(p[i],p[i+1]);
//		}
	}
	public double avstand(Punkt p1, Punkt p2) {
//		Finner avstanden mellom punkt p1 og p2 
		
	}
	public Rute korteste(Rute rute1, Rute rute2) {
		Rute kortest = rute1;
		if(lengde(rute1) > lengde(rute2)) {
			kortest = rute2;
		}
		return kortest;
	}
}
