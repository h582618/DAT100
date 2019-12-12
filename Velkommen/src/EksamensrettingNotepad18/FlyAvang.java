package EksamensrettingNotepad18;

public class FlyAvang {
	
private int[][] flyavgang;

public final static int LEDIG = 1;
public final static int OPPTATT = 2;
public final static int CHECKEDIN = 3;
public final static int BOARDED = 4;

public FlyAvang(int r, int p) {
    flyavgang = new int[r][p]; 
	
	
	for(int i = 0; i < flyavgang.length; i++) {
      for(int j = 0; j < flyavgang[i].length; j++) {
	      flyavgang[i][p] = LEDIG;
	  
	  }
 }
}


 public void print() {
     for(int i = 0; i < flyavgang.length; i++) {
	     for(int j = 0; j < flyavgang[i].length; j++) {
		    if(flyavgang[i][j] == LEDIG) {
			System.out.print("O"); 
		    } else {
			System.out.print("X");
			} 
	 } 
      System.out.println(" " + (i+1));	 
  }
 }
 
 public void setStatus(int r, int p, int status) {
     
	 flyavgang[r][p] = status;
 
 }
 public boolean reserver(int r, int p) {
   
    if(flyavgang[r][p] == LEDIG){
	  flyavgang[r][p] = OPPTATT;
	  return true;   
     }

     return false;	 
 
 }
 
 public String printcard(int r, int p, String navn) {
    
	String[] plasser = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T"};
	String pcard = "Not checked in";
	
	if(flyavgang[r][p] == CHECKEDIN) {
	  pcard = navn + "\n" + (r+1) + plasser[p];  
	}
	return pcard;
 
 }
 
     public boolean boardingcompleted(){
	   for(int i = 0; i < flyavgang.length; i++) {
	    for(int j = 0; j < flyavgang[i].length; j++) {
		   if(flyavgang[i][j] == OPPTATT || flyavgang[i][j] == CHECKEDIN) {
		    return false;
		}
	   }
	 }
	   return true;
	}
	 
	 
}
