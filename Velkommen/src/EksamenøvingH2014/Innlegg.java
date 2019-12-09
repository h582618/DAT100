package EksamenøvingH2014;

public class Innlegg {
	
	private String bruker;
	private String dato;
	private int likes;
	
	public Innlegg(String bruker, String dato) {
		this.bruker = bruker;
		this.dato = dato;
		this.likes  = 0;
	}
	
	public void atLike() {
		likes++;
	}
	
	public void skrivUt() {
		
		System.out.println("Bruker: " + bruker + " Dato: " + dato + " Likes: " + likes);
	}
}
