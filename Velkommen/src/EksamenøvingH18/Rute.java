package EksamenøvingH18;

public class Rute {
	
	private Punkt[] punkter;
	
	public Rute(int n) {
		punkter = new Punkt[n];
	}
	public int antall() {
		int i = 0;
		while(i < punkter.length && punkter[i] != null) {
			i++;
			
		}
		return i;
	}
	public boolean leggTil(Punkt p) {
		int ant = antall();
		if(ant < punkter.length) {
			punkter[ant] = p;
			return true;
		} else {
			return false;
		}
	}
	public Punkt[] komrpimer() {
		Punkt[] nyTab = new Punkt [antall()];
		
		for(int i = 0; i < nyTab.length; i++) {
			nyTab[i] = punkter[i];
		}
		
		
		return nyTab;
	}
	


}
