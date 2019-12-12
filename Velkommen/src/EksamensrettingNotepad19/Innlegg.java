package EksamensrettingNotepad19;

public class Innlegg {

    private String bruker;
	 private String dato;
	 private int likes;
	 
	 public Innlegg(String bruker, String dato){
	 this.bruker = bruker;
	 this.dato = dato;
	 this.likes = 0;
	 
	 }
	 
	 public void skrivUt(){
	    System.out.print("Bruker: " + bruker + " Dato: " + dato + " Likes: " + likes);
	 } 		 
}
