package EksamensrettingNotepad18;

public abstract class Abonnement {
	 
	 private String navn;
	 private int f�dselsnummer;
	 private int telefonnummer;
	 private double minuttpris;
	 
	 public Abonnement(String navn, int f�dselsnummer, int telefonnummer, double minuttpris){
	    this.navn = navn; 
		this.f�dselsnummer = f�dselsnummer;
		this.telefonnummer = telefonnummer;
		this.minuttpris = minuttpris;
		
		}
		
	   public String getNavn(){
	   return navn;
	   }
	   
	   public void setNavn(String navn) {
	   this.navn = navn;
	   }
	   
	   public int getF�dselsnummer() {
	    return f�dselsnummer;
	   }
	   
	   
	   public void setF�dselsnummer(int f�dselsnummer) {
	   this.f�dselsnummer = f�dselsnummer;
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
