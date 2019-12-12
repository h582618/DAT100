package EksamenrettingV19;

public abstract class Billett{
  private int soner;
  private Status status;
  private int soneaktivert;
  
  public Billett(int soner){
    this.soner = soner;
    this.status = DEAKTIVERT;
    this.soneaktivert = 0;
  }
  public int getSoner(){
    return soner;
  }
  public void setSoner(int soner){
    this.soner = soner;
  }
  public Status getStatus(){
    return status;
  }
  public void setStatus(Status status){
    this.status = status;
  }
  public int getSoneaktivert(){
    return soneaktivert;
  }
  public void setSoneaktivert(int soneA){
    this.soneaktivert = soneA;
  }
  public void deaktivert() {
    if(status != DEAKTIVERT){
    this.status = DEAKTIVERT;  
    }
  }
  public abstract boolean aktiver(int sone);
  
  public boolean erGyldig(int sone){
    
    // litt usikker på hva oppgaveteksten vil her angåendene sonene
    // Antar de mener soneaktivert - sone siden de sier forskjellen mellom dem?
   
    boolean aktiv = false;
    int sonea = soneaktivert - sone;
    
    if(status == AKTIV && sonea <= soner ){
      aktiv = true;
    }
    return aktiv;
  }
}