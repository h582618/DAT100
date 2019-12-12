package EksamenrettingV19;

public class MultiBillett extends Billett{
  private int antall;
  
  public MultiBillett(int antall, int soner){
    super(soner);
    this.antalll = antall;
    
  }
  public boolean aktiver(int sone){
    
    boolean aktivert = false;
    
    Status st = Billet.getStatus();
    
    if(st == IKKEAKTIV || (st == AKTIV && antall > 0)){
      if(st == IKKEAKTIV{
        Billett.setStatus(AKTIV);
      }
      Billet.setSoneaktivert(sone);
      antall = antall - 1;
      aktivert = true;
    }
    return aktivert;
    
  }
  public enkeltBillett[] konverter(){
    
    int Bsoner = Billett.getSoner();
    EnkeltBillett [] eb = new EnkeltBillet[antall-1];
    for(int i = 0; i < antall; i++){
      eb[i] = new Enkelbillett(Bsoner);
      
    }
    return eb;
  }
}
    
    

    
  }
}