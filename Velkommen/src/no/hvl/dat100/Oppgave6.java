package no.hvl.dat100;	

import javax.swing.JOptionPane;

public class Oppgave6 {

  public static void main(String[] args) {

    int b, h, d;
    String btext, htext, dtext;

    // les inn h�yde, bredde, dybde
    htext = JOptionPane.showInputDialog("Angi h�yde:");
    btext = JOptionPane.showInputDialog("Angi bredde:");
    dtext = JOptionPane.showInputDialog("Angi dybde:");

    // konverter fra tekst til heltal

    h = Integer.parseInt(htext);
    b = Integer.parseInt(btext);
    d = Integer.parseInt(dtext);

    int volum = b * h * d;

        JOptionPane.showMessageDialog(null, "volumet er "+volum);
      }
}