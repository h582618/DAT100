package SkoleprøveDat100;

import javax.swing.JOptionPane;

public class Bestilling {
	private int kontaktnummer;
	private String kundenavn;
	private String adresse;

	public Bestilling(String navn, int kontaktnummer, String adresse) {
		this.kontaktnummer = kontaktnummer;
		this.kundenavn = navn;
		this.adresse = adresse;

	}

	public int getKontaktnummer() {
		return kontaktnummer;
	}

	public void setKontaktnummer(int kontaktnummer) {
		this.kontaktnummer = kontaktnummer;
	}
	
	public String getKundenavn() {
		return kundenavn;
	}
	public void setKundenavn(String Kundenavn) {
		this.kundenavn = Kundenavn;
	}
	public String getAdresse() {
		return adresse;
		
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	
	public void skrivUt() {
		JOptionPane.showMessageDialog(null, kontaktnummer + " " + kundenavn + " " + adresse);
	}
	
}
