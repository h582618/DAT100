package EksamenøvingV18;

public class SpillerMain {

	public static void main(String [] args) {
		
		Spiller s1 = new Spiller("08.12.2019","Matias V", 8);
		Spiller s2 = new Spiller("08.12.2019","Martine V", 8);
		
		s1.leggTilRes(3);
		s1.leggTilRes(5);
		s1.leggTilRes(2);
		s1.leggTilRes(4);
		s1.leggTilRes(5);
		s1.leggTilRes(2);
		s1.leggTilRes(1);
		s1.leggTilRes(2);
		
		s2.leggTilRes(6);
		
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		
		
		
		int [] parTab =  {6,4,3,3,5,5,5,4,6};

		
		Spiller best = null;
		
		if(s1.sumSlag() < s2.sumSlag()) {
			best = s1;
		} else if (s1.sumSlag() == s2.sumSlag()) {
			System.out.println("Uavgjort");
		} else {
			best = s2;
		}
		System.out.println(best);
		
		
		s1.visScore(parTab);
	}
}
