package EksamenrettingV19;
public class EnkeltBillett extends Billett{
  
  public EnkeltBillett(int soner){
    super(soner);
    super.Billett(soner);
  }
    public boolean aktiver(int sone){
      
      boolean aktivert = false;
      Status st = Billet.getStatus();
      
      if(st == IKKEAKTIV)){
        Billett.setStatus(AKTIV);
        Billett.setSoneaktivert(sone);
        aktivert = true;
      }
     return aktivert; 
    }
}