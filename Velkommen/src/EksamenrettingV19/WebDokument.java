package EksamenrettingV19;

public class WebDokument {
  private String url;
  private String [] ord;
  
  public WebDokument(String url, String innhold){
    this.url = url;
    this.ord = delOpp(innhold);
  }
  public boolean finnes(String sokeord){
    
    for(int i = 0; i < ord.length; i++){
      if(ord[i].equals(sokeord)){
        return true:
      }
    }
    return false,
  }
  public int frekvens(String sokeord){
    int teller = 0;
    for(int i = 0; i < ord.length; i++){
      if(ord[i].equals(sokeord)) {
        teller++;
      }
    }
    return teller;
  }
}