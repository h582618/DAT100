package EksamenøvingH2014;

public class Bilde extends Innlegg {
	private String url;

	public Bilde(String navn, String dato, String url) {
		super(navn, dato);
		this.url = url;
	}

	public void skrivUt() {
		super.skrivUt();
		System.out.print("Url: " + url);
	}
}
