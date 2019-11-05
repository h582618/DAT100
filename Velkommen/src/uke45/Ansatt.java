package uke45;

/*
 *  Klasse for representasjon av ansatt-data.
 */
public class Ansatt  {

  private int    ansNr;
  private String fornavn;
  private String etternavn;
  protected double lonn;
  
  @Override
  public boolean equals(Object other) {
      if (this == other) {
          return true;
      }
      
      if (other == null || !(other instanceof Ansatt)) {
          return false;
      }
      
      Ansatt a = (Ansatt) other;
      
      // antatt at ansattnr er unikt, så alternativ i forelesningsnotatar
      return this.ansNr == a.ansNr;
  }
  
  public Ansatt(int ansNr,        String fornavn,
                String etternavn, double lonn) {
    this.ansNr = ansNr;
    this.fornavn = fornavn;
    this.etternavn = etternavn;
    this.lonn = lonn;    
  }
 
 
  public int getAnsNr() {
    return ansNr;
  }
  
  public void setAnsNr(int ansNr) {
    this.ansNr = ansNr;
  }

  
  public String getFornavn() {
    return fornavn;
  }
  
  public void setFornavn(String fornavn) {
    this.fornavn = fornavn;
  }

  
  public String getEtternavn() {
    return etternavn;
  }
  
  public void setEtternavn(String etternavn) {
    this.etternavn = etternavn;
  }
  
  
  public double getLonn() {
    return lonn;
  }
  
  public void setLonn(double lonn) {
    this.lonn = lonn;
  }
  
  
  public String toString() {
    return ansNr + ": " + fornavn + " " + etternavn + " - lønn kr. " + lonn;
  }
  
}
