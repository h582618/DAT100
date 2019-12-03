package SkoleprøveDat100;

import javax.swing.JOptionPane;

public class Tidspunkt extends Bestilling {
	private String dato;
	private String tidspunkt;
	
	public Tidspunkt(String navn, int kontaktnummer, String adresse, String dato, String tidspunkt) {
		super(navn, kontaktnummer, adresse);
		this.tidspunkt = tidspunkt;
		this.dato = dato;
	}
	
	public void skrivUt(){
		
		JOptionPane.showMessageDialog(null, super.getKontaktnummer() + " " +   super.getKundenavn() + " " + super.getAdresse()+" " + dato +" " + tidspunkt);
	}

}
