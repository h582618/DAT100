package Uke43;

import java.io.*;
import java.util.Scanner;

public class LagreData {

	public static void main(String[] args) throws IOException {
//		Åpner filen for skriving
		String filnavn = "c:/users/matia/documents/timelister/timerlister.csv";

		File fil = new File(filnavn);

		Scanner leser = new Scanner(fil);

		int linjeNr = 1;
		String linje;
		while (leser.hasNextLine()) {
			linje = leser.nextLine();
			System.out.println(linjeNr + ": " + linje);
			linjeNr++;
		}
		leser.close();
		


	}
}