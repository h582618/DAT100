package EksamenøvingH18_2;

public class FlyAvgangMain {

	public static void main(String [] args) {
		
	FlyAvgang fa = new FlyAvgang(6,4);
	
	

	fa.setStatus(3, 2, 2);

	System.out.println(fa.printcard(0, 2, "Matias Vedeler"));
	
	System.out.println(fa.boardingcompleted());
	
	fa.print();
	
	
	}
	

}
