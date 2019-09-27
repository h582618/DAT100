package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class Oppgave3 {

	public static void main(String[] args) {
		
		String brukernavn = showInputDialog("Brukernavn :");

		String passord = showInputDialog("Passord :");

		String riktigbrukernavn = "Matias" ;
		
		String riktigpassord = "Matias96" ;
		
		if(brukernavn.equals(riktigbrukernavn)&& passord.equals(riktigpassord)) {
		    showMessageDialog(null, "Access Granted");
		}
		else { showMessageDialog(null, "Access Denied");
		}
	
	}

}