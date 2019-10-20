package Uke38;


import java.util.Arrays;

import java.lang.System;

public class Oppgave4 {
	
	public static void main(String[] args) {
		final long startTime = System.currentTimeMillis();
		double  tabell[];
		
		tabell = new double[1000000];
		
		for(int i=0; i < tabell.length; i++) {
			tabell[i] = Math.random();
		}
		
		Arrays.sort(tabell);
		
		for(int k=0; k < tabell.length; k++) {
			System.out.println(tabell[k] + " ");
		}
		
		final long endTime = System.currentTimeMillis();
//		System.out.println(sort(double[] tabell));
		System.out.println("Tid i millisekunder " + (endTime - startTime));
	}

}
