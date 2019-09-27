package Uke36;


import static javax.swing.JOptionPane.*;


public class Oppgave3uke36 {

		public static void main(String[] args) {

			int bredde = lesInnTall("Bredde");

			int hoyde = lesInnTall("Hoyde");

			int a = areal(bredde,hoyde);

			showMessageDialog(null,"Areal: " + a);
		}

		private static int areal(int bredde, int hoyde) {

			int flateareal = bredde * hoyde;

			return flateareal;
		}
		
		private static int lesInnTall(String message) { 
			int tall = 0;
			do {
			String input1 = showInputDialog(message);
			tall = Integer.parseInt(input1);
			} 
			while(tall<0); 
			return tall;
		}
}
	