package Eksamenøving;

import java.util.HashMap;

// g
public abstract class MaanadAbn extends Abonnement {
	private Abonnement gratis [];
	private int antall = 4;

	public MaanadAbn(String navn, int fødselsnummer, int nummer, double minuttpris) {
		super(navn, fødselsnummer, nummer, minuttpris);
		gratis = new Abonnement[antall];
		
	}
	
//	h
	@Override
	public double pris(int nummer, int lengde) {
		for(int i = 0; i < gratis.length; i++ ) {
			if(gratis[i] != null && gratis[i].getNummer() == nummer) {
				super.setMinuttpris(0);
				return super.getMinuttpris();
			}
			}
		return super.getMinuttpris()*lengde;
		}
	
	
	
	
	public double pris1(int nr, int lengde) {
		double p = 0.0;
		int i = 0;
		
		boolean funnet = false;
		while(i < gratis.length && !funnet) {
//			funnet =(nr == gratis[i]);
			if(gratis[i] != null && gratis[i].getNummer()==nr) {
				funnet = true;	
			}
			i++;
		}
		if(!funnet) {
			p = getMinuttpris()*lengde;
		}
		return p;
	}
}




