package EksamenrettingV19;

public MiniGoogle(int n){
  websider = new WebDokument[n];
}
public void sok(String sokeord){
  
  for(int i = 0; i < websider.length; i++){
    if(websider[i].finnes(sokeord){
      System.out.println(Websider[i].getUrl());
    }
  }
  
}
public String beste(String sokeord){
  
  String b = null;
  int best = 0; 
  
  for(int i = 0; i < websider.length; i++){
    if(websider[i].frekvens(sokeord) > best){
       best = websider[i].frekvens(sokeord);
       b = websider[i].getUrl();
    }
  }
    return b;
  
}
public WebDokument indekser(WebDokument webside){
  webDokument temp = null;
  
  for(int i = 0; i < websider.length; i++){
    if(websider[i] == null){
      websider[i] = webside;
      return temp;
    }
  }
  int r = random(websider.length-1));
  temp = webside[r];
  webside[r] = webside;
  
  return temp;
}
public String[] google(String [] sokeord){
  
  //Setter størrelsen på g slik at jeg forsikrer meg at jeg ialfall har nok plass, hadde vært mer gunstig å bruke Arraylist så størrelsen kunne vært dynamisk  
  
  String [] g = new String[websider.length];
  int j = 0;
  
  for(int i = 0; i < websider.length; i++){
    if(websider[i].finnes(sokeord) {
      g[j] = websider[i].getUrl();
      j++;
      
    }
  }
  return g;
  
}

