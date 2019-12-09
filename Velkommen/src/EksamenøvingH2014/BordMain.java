package EksamenøvingH2014;

public class BordMain {

	public static void main(String[] args) {
		

		BordOversikt b = new BordOversikt(10);
		
		Bord b1 = new Bord(20, true);
		Bord b2 = new Bord(8, false);
		Bord b3 = new Bord(10, true);
		Bord b4 = new Bord(6, true);
		Bord b5 = new Bord(4, true);
		Bord b6 = new Bord(2, true);
		
		
		
		b.leggTIL(b1);
		b.leggTIL(b2);
		b.leggTIL(b3);
		b.leggTIL(b4);
		b.leggTIL(b5);
		b.leggTIL(b6);
		
		
		System.out.println(b.finnFørsteLedige(2));
		
		System.out.println(b.passerBest(2));
		
		
		
	}

}
