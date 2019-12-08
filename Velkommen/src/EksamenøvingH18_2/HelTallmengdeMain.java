package EksamenøvingH18_2;

public class HelTallmengdeMain {

	public static void main(String[] args) {
	
//		
//		boolean[] ekstab = {true, true, false, true, false};
		
		HeltallMengde h1 = new HeltallMengde(20);
		
		System.out.println(h1.toString());
		
		h1.leggtil(2);
		
		h1.leggtil(4);
		
		h1.leggtil(1);
		h1.leggtil(7);
		
		System.out.println(h1.erMed(3));
		
		int [] itab = {2,4,7};
		
		System.out.println(h1.erDelmengde(itab));
		
		System.out.println(h1.toString());
		
		h1.komplement();
		
		
	}

}
