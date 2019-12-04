package EksamenøvingV19;

public class Main3 {

	public static void main(String[] args) {
	
		Videoarkiv va = new Videoarkiv(100);
		Video v1 = new Video("The grudge", "Ole Olsen" , 1000);
		Video v2 = new Video("Løkker i java", "Ole Olsen" , 5000);
		Video v3 = new Video("2 girls 1 cup", "Ole Olsen" , 300);
		
		va.leggTil(v1);
		va.leggTil(v2);
		va.leggTil(v3);
		
		va.slett("Løkker i java");
		va.listAlle("Ole Olsen");
		
		System.out.println(va);

	}

}
