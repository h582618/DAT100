package EksamenøvingH18_2;

public class Punkt {
	
	private double breddegrad; 
	private double lengdegrad;
	private double hoyde;
	
	public Punkt(double breddegrad,double lengdegrad, double hoyde){
		this.breddegrad = breddegrad;
		this.lengdegrad = lengdegrad;
		this.hoyde = hoyde;
	}

	public double getBreddegrad() {
		return breddegrad;
	}

	public void setBreddegrad(double breddegrad) {
		this.breddegrad = breddegrad;
	}

	public double getLengdegrad() {
		return lengdegrad;
	}

	public void setLengdegrad(double lengdegrad) {
		this.lengdegrad = lengdegrad;
	}

	public double getHoyde() {
		return hoyde;
	}

	public void setHoyde(double hoyde) {
		this.hoyde = hoyde;
	}
	

}
