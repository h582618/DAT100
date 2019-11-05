package Uke40;

public class KvadratMain {

	public static void main(String[] args) {
		
		Kvadrat kv3 = new Kvadrat(3);
		Kvadrat kv4 = new Kvadrat(4);
		Kvadrat kv5 = new Kvadrat(5);
		kv3.skrivUt();
		
		System.out.println(" ");
		kv4.skrivUt();
		System.out.println(" ");
		
		kv5.skrivUt();
		
		
		System.out.println(kv5.sum(kv3, kv4));
	}

}

