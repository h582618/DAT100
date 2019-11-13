package Eksamenøving;

public class GPSBeregninger {
	public double hoyestepunkt(Rute rute) {
		Punkt[] tab = rute.komrpimer();
		
		double maks = tab[0].getHoyde();
		for(int i = 1; i < tab.length; i++) {
			if(tab[i].getHoyde() > maks) {
				maks= tab[i].getHoyde();
			}
			
		}
		return maks;
	}
	
	public double lengde(Rute rute ) {
		Punkt[] tab = rute.komrpimer();
		double lengde = 0;
		for(int i = 0; i < tab.length -1; i++) {
			lengde += avstand(tab[i], tab[i+1]);
			
		}
		return lengde;
	}
	public Rute korteste(Rute rute1, Rute rute2) {
		double leR1 = lengde(rute1);
		double leR2 = lengde(rute2);
		if(leR1 < leR2) {
			return rute1;
		} else {
			return rute2;
		}
	}

}
