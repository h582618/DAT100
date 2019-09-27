package no.hvl.dat100;

import static javax.swing.JOptionPane.showInputDialog;

public class Oppgave4 {

	public static void main(String[] args) {
		
		//Algoritme beskrivelse Tid%3600/60
		

		String Input = showInputDialog("Legg inn antall sekunder :");
		int Tid = Integer.parseInt(Input);
		int Timer = (Tid/3600);
		int Minutter = (Tid%3600)/60;	//Minutter gir feil
		int Sekunder = (Tid%60);
	
		String svar_Timer = "" + Timer;
		if(Timer == 1) {
			svar_Timer += " time,";
		} else {
			svar_Timer += " timer, ";
		}
		String svar_Minutter = "" + Minutter;
		if(Timer == 1) {
			svar_Minutter += " Minutt,";
		} else {
			svar_Minutter += " Minutter, ";
		}
		String svar_Sekunder = "" + Sekunder;
		if(Timer == 1) {
			svar_Sekunder += " Sekund,";
		} else {
			svar_Sekunder += " Sekunder, ";
		}
		
		
		
		
		
		
		System.out.println(svar_Timer+Minutter+svar_Minutter+svar_Sekunder);
		
		
	}

}	
