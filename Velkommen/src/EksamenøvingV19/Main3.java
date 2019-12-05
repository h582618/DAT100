package EksamenøvingV19;

public class Main3 {
	public static void main(String[] args) {
	
		Videoarkiv va = new Videoarkiv(10);
		Video v1 = new Video("The grudge", "Ole Olsen" , 1600);
		Video v2 = new Video("Løkker i java", "Ole Olsen" , 500);
		Video v3 = new Video("Narnia", "Ole Olsen" , 1000);
		Video v4 = new Video("Taco friday", "Ole Olsen" , 3000);
		Video v5= new Video("Sharks", "Ole Olsen" , 800);
		Video v6 = new Video("Harry", "Ole Olsen" , 7000);
		Video v7 = new Video("Burning 2", "Ole Olsen" , 3600);
		Video v8 = new Video("Livejasmin", "Ole Olsen" , 5350);
		Video v9 = new Video("Ketamingo", "Ole Olsen" , 2500);
		Video v10 = new Video("IT", "Ole Olsen" , 200);
		Video v11 = new Video("Flamingo", "Ole Olsen" , 4800);
		
		va.leggTil(v1);
		va.leggTil(v2);
		va.leggTil(v3);
		va.leggTil(v4);
		va.leggTil(v5);
		va.leggTil(v6);
		va.leggTil(v7);
		va.leggTil(v8);
		va.leggTil(v9);
		va.leggTil(v10);
		va.leggTil(v11);
		
		
		va.listAlle("Ole Olsen");
		
		System.out.println("\n");
		
		va.skrivUt();
		
		
		System.out.println("\n");
		
		
		va.bestePar(6334);
		

	}

}
