package SkoleprøveDat100;

import javax.swing.JOptionPane;

public class MainB {

	public static void main(String[] args) {
		
		
		
		
		String navn = JOptionPane.showInputDialog("Navn");
		int nummer = Integer.parseInt(JOptionPane.showInputDialog("Nummer"));
		String adresse = JOptionPane.showInputDialog("Adresse");
		int maxtid = Integer.parseInt(JOptionPane.showInputDialog("Maxtid"));
		String dato = JOptionPane.showInputDialog("Dato");
		String tidspunkt = JOptionPane.showInputDialog("Tidspunkt");
		

		
		SnarestMulig b1 = new SnarestMulig(navn, nummer , adresse,maxtid);
		
		Tidspunkt b2 = new Tidspunkt(navn,nummer, adresse, dato, tidspunkt);

		
		b1.skrivUt();
		
		b2.skrivUt();

	}

}
