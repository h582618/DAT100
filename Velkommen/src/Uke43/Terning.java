package Uke43;

import java.io.*;
import java.util.Random;
public class Terning {

	// aktuell verdi for terningen
    private int oye, trillet;
	Random number = new Random();
	public Terning() {
		oye = number.nextInt(6)+ 1;
	}

	public int getOyne() {

		return trillet;
	}

	public void trill() {
		trillet = oye;
		
	
	}
}