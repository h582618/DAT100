package Eksamens�vingH17;

public class HundreMeter extends Resultat{
	private double tid;

	public HundreMeter(String navn, char kj�nn, double tid) {
		super(navn,kj�nn);
		this.tid = tid;
	}
	@Override
	public int poeng() {
		
		double p = 1000;
		if(getKj�nn() == 'M' ) {
			double t = 10.40 - tid;
			p = p + (t*240);
		} else {
			double t = 11.60 - tid;
			p = p + (t*240);
		}
		return (int)p;
	}
	@Override
	public String toString() {
		
		return super.toString() + ", Tid: "+ tid;
		
	}
}
