package Eksamen�ving;
// e
public abstract class KontantAbn extends Abonnement{
	private double balanse;

public KontantAbn(String navn, int f�dselsnummer, int nummer, double minuttpris, double balanse) {
	super(navn, f�dselsnummer, nummer, minuttpris);
	this.balanse = balanse;
}
// f
@Override
public double pris(int summer, int lengde) {
	return getMinuttpris() * lengde;
}
}
