package Uke40;

public class Varelager {

	protected Vare[] varer;
	protected int antall;


public Varelager(int n) {
	antall=0;
	varer = new Vare[n];
	
}
Varelager vl = new Varelager(4);

// 4b
public boolean leggTilVare(Vare v) {
	boolean sattinn = false;
	
	if( antall < varer.length) {
		varer[antall] = v;
		antall++;
		sattinn = true;
		
	}
	return sattinn;
}
public Vare finnVare(int varenr ) {
	Vare v = null;
	int i = 0;
	while( i < varer.length && (v ==null)) {
		if(varer[i].getVarenr() == varenr) {
			v = varer[i];
		}
		i++;
	}
	return v;
}

}


