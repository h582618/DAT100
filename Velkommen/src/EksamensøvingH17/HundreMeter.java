package EksamensøvingH17;

public class HundreMeter extends Resultat{
	private double tid;

	public HundreMeter(String navn, char kjønn, double tid) {
		super(navn,kjønn);
		this.tid = tid;
	}
	@Override
	public int poeng() {
		
		double p = 1000;
		if(getKjønn() == 'M' ) {
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
