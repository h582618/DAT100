package Uke43;

import java.io.*;

import java.util.*;

//import Timelister.TLDataConverter;
//import Timelister.Timer;
//import BergenRenhold-Timelister.Timelister.Timer.*;


public class LagreData {
	
	private int [] TLDATA;
	private static String SEP_STR= ",";
	
	public static void main(String[] args) throws IOException {
//		Åpner filen for skriving
		String filnavn = "c:/users/matia/documents/timelister/timerlister.csv";
		File fil = new File(filnavn);

		Scanner leser = new Scanner(fil);

		String dato, fornavn, etternavn, hendelser, timer;
		
		int linjeNr = 1;
		String linje;
		while (leser.hasNextLine()) {
			linje = leser.nextLine();
			String[] timeDP = linje.split(SEP_STR);
			dato = timeDP[0];
			fornavn = timeDP[1];
			etternavn = timeDP[2];
			hendelser = timeDP[3];
			timer = timeDP[4];
			System.out.println(linjeNr + ": " + linje);
			linjeNr++;
		leser.close();
		


	}
	}
	public class Timer {
		private double dato;
		private String fornavn;
		private String etternavn;
		private String hendelse;
		private double timer;

		public Timer(double dato, String fornavn, String etternavn, String hendelse, Double timer) {
			this.dato = dato;
			this.fornavn = fornavn;
			this.etternavn = etternavn;
			this.hendelse = hendelse;
			this.timer = timer;
		}
		public double getDato() {
			return this.dato;
		}
		
		public void setTime(double timer) {
			this.timer = timer;
		}
		public String getFornavn() {
			return this.fornavn;
		}
		public String getEtternavn() {
			return this.etternavn;
		}
		public String getHendelse() {
			return this.hendelse;
		}
		public double getTime() {
			return this.timer;
		}
	public String toString() {
			String str = this.dato + " (" + this.fornavn + "," + this.etternavn + ")" + this.timer + "," + this.hendelse;
			return str;
	}
public int toSeconds(String timestr) {
		
		int secs= 0;
		int hr, min, sec;
		String [] timeStrTab = timestr.split("");
		String [] timeStrNum = {
				timeStrTab[11], timeStrTab[12], //timer
				timeStrTab[14], timeStrTab[15], //minutter
			    timeStrTab[17], timeStrTab[18] //sekunder
	};
		if(timeStrNum[0].contentEquals("0")) {
			hr = Integer.parseInt(timeStrNum[1]);
			secs += hr * 3600;
		}
		else {
			hr = Integer.parseInt(timeStrNum[0]+timeStrNum[1]);
			secs += hr * 3600;
		}
		
//		Minutter 
		if(timeStrNum[2].contentEquals("0")) {
			min = Integer.parseInt(timeStrNum[3]);
			secs += min * 60;
		}
		else {
			min = Integer.parseInt(timeStrNum[2]+timeStrNum[3]);
			secs += min * 60;
		}
//		sekunder
		if(timeStrNum[4].contentEquals("0")) {
			sec = Integer.parseInt(timeStrNum[5]);
			secs += sec;
		}
		else {
			sec = Integer.parseInt(timeStrNum[4]+timeStrNum[5]);
			secs += sec;
		}
		return secs;
}
	
        public Timer convert(String datoStr, String fornavnStr, String etternavnStr, String hendelserStr, String timerStr) {
	    Timer time = new Timer((double)(toSeconds(datoStr)),fornavnStr,etternavnStr,hendelserStr
			,(double)(toSeconds(timerStr)));
	
	return time;
		}
        
    	
//		public boolean insert(String dato1, String fornavn1, String etternavn1, String hendelser1, String timer1) {
//			Timer time;
//			
//			time = convert(dato1, fornavn1, etternavn1, hendelser1, timer1);
//			
//			return 
//			
//		}
	
		
		
//	public static ArrayList <String> [] readTL(String filnavn) {
//		
//		ArrayList<String> s = new ArrayList<String>();
//		
//		while(line != null 
//		
//		return s;
//	}
}
}
