package EksamenøvingH18_2;

public class PunktMain {

	public static void main(String[] args) {
		
		Rute r1 = new Rute(20);
		
		r1.leggTilPunkt(20.0, 40.0, 10.0);
		r1.leggTilPunkt(30.0, 20.0, 20.0);
		r1.leggTilPunkt(40.0, 60.0, 30.0);
		r1.leggTilPunkt(60.0, 80.0, 80.0);
		r1.leggTilPunkt(20.0, 10.0, 10.0);
		
        Rute r2 = new Rute(20);
		
		r2.leggTilPunkt(20.0, 40.0, 10.0);
		r2.leggTilPunkt(10.0, 20.0, 20.0);
		r2.leggTilPunkt(20.0, 30.0, 30.0);
		r2.leggTilPunkt(40.0, 30.0, 40.0);
		r2.leggTilPunkt(20.0, 10.0, 10.0);
		
		Punkt p1 = new Punkt(20.0, 40.0, 80.0);
		r1.leggtil(p1);
		
		System.out.println(r1.antall());
		
		Punkt [] k1 = r1.komrpimer();
		
		
		System.out.println(r1.korteste(r1, r2));
	}

}
