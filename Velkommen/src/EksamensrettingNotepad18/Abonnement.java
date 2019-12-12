package EksamensrettingNotepad18;

public abstract class Abonnement {
	 
	 private String navn;
	 private int fødselsnummer;
	 private int telefonnummer;
	 private double minuttpris;
	 
	 public Abonnement(String navn, int fødselsnummer, int telefonnummer, double minuttpris){
	    this.navn = navn; 
		this.fødselsnummer = fødselsnummer;
		this.telefonnummer = telefonnummer;
		this.minuttpris = minuttpris;
		
		}
		
	   public String getNavn(){
	   return navn;
	   }
	   
	   public void setNavn(String navn) {
	   this.navn = navn;
	   }
	   
	   public int getFødselsnummer() {
	    return fødselsnummer;
	   }
	   
	   
	   public void setFødselsnummer(int fødselsnummer) {
	   this.fødselsnummer = fødselsnummer;
	   }
	   
	   public int getTelefonnummer(){
	    return telefonnummer; 
		}
	   public void setTelefonnummer(int telefonnummer) {
		 
	   this.telefonnummer = telefonnummer;
		 }
		 
		public double getMinuttpris() {
		return minuttpris;
		}
		
		public void setMinuttpris(double minuttpris){
		this.minuttpris = minuttpris;
		}
		
		public abstract double pris(int tn, int slengde);
		
}
