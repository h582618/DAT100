package EksamenøvingH18_2;

public abstract class MaanedAbn extends Abonnement {
	private Abonnement[] gratis;
	
	public MaanedAbn(String navn, String fødselsnummer, int telefonnummer,double minuttpris) {
		super(navn, fødselsnummer,telefonnummer,minuttpris);
		
		gratis = new Abonnement [4];
		
	}
	@Override
	public double pris(int tn, double samtalelengde) {
		
		double pris = 0;
		
		for(Abonnement e : gratis) {
			if(e.getTelefonnummer() == tn && e != null) {
				return pris;
			}
		}
		return samtalelengde * getMinuttpris();
		
	}

}
