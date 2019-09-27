package Uke36;

import easygraphics.*;

public class Oppgave4MetodeMetoden extends EasyGraphics {

	public static void main(String[] args) {
		launch(args);
	}

	public void run() {
		makeWindow("Murvegg");

		int antall = 10;
        int rader = 4;
		
		int x = 50;
		

		for(int r = 0; r < rader; r++) {
	
     		for (int i = 0; i < antall; i++) {
			drawRectangle(x, 200, 40, 40);
			x += 40;
		}
		drawRectangle(x, 200, 20, 40);
       r++;
		}
}
}