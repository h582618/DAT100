package EksamenrettingV19;

public Parkeringshus(int etasjer, int plasser){
  pplasser = new boolean[etasjer][plasser];
  // Tabellen er ved default false, så jeg slipper å lage en løkke for å gjøre hver enkelt til false.
  }
}
public void skrivUt(){
  for(int i = 0; i < pplasser.length; i++){
    for(int j = 0; j < pplasser[i].length; j++){
      System.out.print("|")
      if(pplasser[i][j]){
        System.out.print("X")
      else{
        System.out.print(" ");
      }
      }
    }
    System.out.println("|");
  }
  public boolean erOpptatt(int etasje, int plass){
    return pplasser[etasje][plass]
  }
  public boolean parker(int etasje, int plass){
    
    // Antar at etasje og plass i paramtetret er en gyldig verdi i tabellen
    if(pplasser[etasje][plass]){
      return false;
    }
    pplasser[etasje][plass] = true;
    return true;
  } 
  public int antallLedige(int etasje){
    
    int teller = 0;
    
    for(int i = 0; i < pplasser[etasje].length; i++){
        if(!pplasser[etasje][i]) {
          teller++;
        }
      }
    return teller;
  }
  public int[] statusLedige() {
    
    int [] ledige = new int[pplasser.length];
    for(int i = 0; i < pplasser.length; i++){
         ledige[i] = antallLedige(i);
    }
    return ledige;
    
  }
}