package Uke43;

import java.io.*;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class LeseFraFil {

	static String MAPPE_STR = System.getProperty("user.dir") + "/src/no/hvl/dat100/jplab11/oppgave1/";

	static public void main(String[] args){

		boolean funnet = false;
		int antall = 5; 
		while(!funnet && antall >= 0) {
		try { String filnavn;

		filnavn = JOptionPane.showInputDialog("Filnavn i mappen " + MAPPE_STR);

		File file = new File(MAPPE_STR + filnavn);
		BufferedReader leser = new BufferedReader(new FileReader(file));

		int linenumber = 1;

		// les innhold i filen linje for linje
		String line;
		
		while (leser.ready()) {
			line = leser.readLine();
			System.out.println(linenumber + " " + line);
			linenumber++;
			funnet = true;
		}

		} catch(FileNotFoundException e) {
			JOptionPane.showMessageDialog(null, "Fant ikke filen, du har " + (antall) + " forsøk igjen");
			antall--;
			if(antall < 0) {
				JOptionPane.showMessageDialog(null, "Du har brukt opp dine forsøk");
			}
		}
		
		catch(IOException f) {
			
		}
		}
		// JOptionPane.showMessageDialog(null, "Filen " + filnavn + " finnes
		// ikke. \n" + e.getMessage());
	}
}
