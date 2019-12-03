package SkoleprøveDat100;

public class Main {

	public static void main(String[] args) {
		
		ToDoListe Liste = new ToDoListe(10);
		
		ToDoElement k1 = new ToDoElement("Bestille ferie",1,4);
		ToDoElement k2 = new ToDoElement("Bestå denne eksamen",2,1);
	
		

		Liste.leggTil(k1);
		Liste.leggTil(k2);
		
	   System.out.println(Liste.finnViktig());
	   
//	   ToDoElement viktig = Liste.finnViktig();
//	    
//	    System.out.println(viktig.toString());
	    


	}
}
