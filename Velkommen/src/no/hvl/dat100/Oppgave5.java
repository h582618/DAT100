package no.hvl.dat100;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Oppgave5 {

	public static void main(String[] args) {

		for (int elever = 1; elever <= 10; elever++) {
			String input = showInputDialog("Legg inn Poengsum her");
			int poeng = Integer.parseInt(input);

			if (poeng >= 90 && poeng <= 100) {

				showMessageDialog(null, "A");
			} else if (poeng >= 80 && poeng < 90) {

				showMessageDialog(null, "B");
			}

			else if (poeng >= 60 && poeng < 80) {

				showMessageDialog(null, "C");

			}

			else if (poeng >= 50 && poeng < 60) {

				showMessageDialog(null, "D");

			} else if (poeng >= 40 && poeng < 50) {

				showMessageDialog(null, "E");

			}

			else if (poeng >= 0 && poeng < 40) {

				showMessageDialog(null, "F");
			} else {
				elever--;

			}
		}
	}

}