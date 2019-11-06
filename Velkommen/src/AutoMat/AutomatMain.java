package AutoMat;

public class AutomatMain {

	public static void main(String[] args) {
		
		Automat S = new Automat("Sjokolade", 8.0);
		Automat B = new Automat("Brus", 12.0);
		Automat K = new Automat("Kaffe", 5.0);
		
		Automat.veksel(B,50);

	}

}
