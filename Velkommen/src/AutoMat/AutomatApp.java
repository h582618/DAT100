package AutoMat;

public class AutomatApp {
	
	Automat S = new Automat("Sjokolade", 8.0);
	Automat B = new Automat("Brus", 12.0);
	Automat K = new Automat("Kaffe", 5.0);
	

	public double veksel(Automat t, int input) {
		
		double veksel = input - t.GetMynter();
		
		return veksel;
	}
	
	
}
