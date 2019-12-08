package EksamensøvingH17;

import java.io.*;
import java.util.*;

import javax.swing.JOptionPane;

public class Oppgave3 {

	public static void main(String[] args) {

		lesForsok(5);
	}

	public static void les(String filnavn) throws FileNotFoundException {
		File fil = new File(filnavn);
		Scanner sc = new Scanner(fil);
		Scanner leser = sc;
		while (leser.hasNextLine() && !leser.nextLine().contains("//")) {
			System.out.println(leser.nextLine());
		}

		leser.close();
	}

	public static boolean lesCatch(String filnavn) {

		try {
			les(filnavn);
			return true;
		} catch (FileNotFoundException e) {
			return false;
		}

	}
	public static void lesForsok(int forsok) {
		
		int f = 0;
		while(f < forsok) {
			String filnavn = JOptionPane.showInputDialog("Angi filnavn");
			if(!lesCatch(filnavn)) {
				f++;
				JOptionPane.showMessageDialog(null,"Feil");
			}
			else break;
		}
	}
}
