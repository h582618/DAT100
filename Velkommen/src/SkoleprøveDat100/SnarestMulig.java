package SkoleprøveDat100;

import javax.swing.JOptionPane;

public class SnarestMulig extends Bestilling {
	private int maxtid;
	
	public SnarestMulig(String navn, int kontaktnummer, String adresse, int maxtid) {
		super(navn, kontaktnummer, adresse);
		this.maxtid = maxtid;
	}

	
	public void skrivUt() {
		JOptionPane.showMessageDialog(null, super.getKontaktnummer() + " " + super.getKundenavn() + " " + super.getAdresse() + " " + maxtid);
	}
}
