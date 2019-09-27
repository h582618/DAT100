package no.hvl.dat100;

import static javax.swing.JOptionPane.showInputDialog;

public class Oppgave1 {

	public static void main(String[] args) {
		String input1 = showInputDialog("Legg inn tall 1");

		String input2 = showInputDialog("Legg inn tall 2");

		int tall1 = Integer.parseInt(input1);
		int tall2 = Integer.parseInt(input2);

		if (tall2 == 0) {
			System.out.println("Kan ikke dele på 0");
		} else {
			System.out.print(tall1 / tall2);
		}
	}

}
