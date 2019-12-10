package Varelager;

public class Bestilling {
	private int Bestillingsnr;
	private String dato;
	private Vareliste vareliste;
	
	public Bestilling(int bestillingsnr, String dato, Vareliste Vareliste) {
		this.Bestillingsnr = bestillingsnr;
		this.dato = dato;
		this.vareliste = vareliste;
	}
	

}
