package EksamenøvingH2014;

public class Bord {
	
	private int antall;
	private boolean ledig;
	
	public Bord(int antall, boolean ledig) {
		this.antall = antall;
		this.ledig = ledig;
	}
	
	public int getAntall() {
		return antall;
	}
	public void setAntall(int antall) {
		this.antall = antall;
	}
	public boolean getLedig() {
		return ledig;
	}
	public void setLedig(boolean ledig) {
		this.ledig = ledig;
	}
	
	

}
