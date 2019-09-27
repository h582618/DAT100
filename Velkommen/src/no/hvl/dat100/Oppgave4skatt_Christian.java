package no.hvl.dat100;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.parseInt;

public class Oppgave4skatt_Christian {

	public static void main(String[] args) {
		String belopnr = showInputDialog("Skriv inn bruttoinntekt");
		int belop = parseInt(belopnr);
		int trinn;
		double skatt = 0;
		int trinnskatt;
		
		String txtUt;
		double ekstra1 = (230951-164101)*0.0093;
		double ekstra2 = ekstra1 + (580651-230951)*0.0241;
		double ekstra3 = ekstra2 + (934051-580651)*0.1152;
		
		if (belop >= 0 && belop <= 164100) {
			System.out.print("Det blir ikke skatt, så beløpet er det samme " + belop + ", trinn 0");
		}
		if(belop>164101) {
			trinn = belop-164101;
			skatt = (trinn * 0.0093);
		}
		if(belop>230951) {
			trinn = belop-230951;
			skatt = (trinn * 0.0241) + ekstra1;
		}
		if(belop>580651) {
			trinn = belop-580651;
			skatt = (trinn * 0.1152) + ekstra2;
		}
		if(belop>934051) {
			trinn = belop-934050;
			skatt = (trinn * 0.1452) + ekstra3;
		}
		txtUt = ("Din inntekt er: " + belop + "kr \n"
				+ "Skatten du må betale blir: " + skatt);
		showMessageDialog(null, txtUt);
}
}