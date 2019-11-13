package Eksamenøving;
// e
public abstract class KontantAbn extends Abonnement{
	private double balanse;

public KontantAbn(String navn, int fødselsnummer, int nummer, double minuttpris, double balanse) {
	super(navn, fødselsnummer, nummer, minuttpris);
	this.balanse = balanse;
}
// f
@Override
public double pris(int summer, int lengde) {
	return getMinuttpris() * lengde;
}
}
