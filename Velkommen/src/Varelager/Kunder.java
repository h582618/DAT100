package Varelager;

public class Kunder {
	private int kundenr;
	private String kundenavn;
	private String adresse;
	
	public Kunder(int kundenr, String kundenavn, String adresse) {
		this.kundenr = kundenr;
		this.kundenavn = kundenavn;
		this.adresse = adresse;
	}
	
	public int getKundenr() {
		return kundenr;
	}
	public void setKundenr(int kundenr) {
		this.kundenr = kundenr;
	}
	public String getKundenavn() {
		return kundenavn;
	}
	public void setKundenavn(String kundenavn) {
		this.kundenavn = kundenavn;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	

}
