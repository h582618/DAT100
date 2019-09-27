package Uke36;

import easygraphics.*;

public class Oppgave4uke36 extends EasyGraphics {

	public static void main(String[] args) {
		launch(args);
	}

	public void run() {
		makeWindow("Murvegg");

		int antall = 10;

		int x = 50;
		int y = 60;
		int z = 50;
		int v = 60;

		for (int i = 0; i < antall; i++) {
			drawRectangle(x, 200, 40, 40);
			x += 40;
		}
		drawRectangle(x, 200, 20, 40);

		drawRectangle(y - 10, 240, 20, 40);

		for (int j = 0; j < antall; j++) {
			drawRectangle(y + 10, 240, 40, 40);
			y += 40;
		}

		for (int k = 0; k < antall; k++) {
			drawRectangle(z, 280, 40, 40);
			z += 40;
		}
		drawRectangle(z, 280, 20, 40);
		
		drawRectangle(v - 10, 320, 20, 40);

		for (int l = 0; l < antall; l++) {
			drawRectangle(v + 10, 320, 40, 40);
			v += 40;
		}
	}
}