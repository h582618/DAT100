package uke45;


public class Switch_javahjelp {

	public static String dag(int nr) {
		String navn = "";
		
		switch(nr) {
		case 1: navn = "Søndag";
		break;
			
		case 2: navn = "Mandag";
		
		break; 
		
		case 3: navn = "Tirsdag";
		break;
			
		case 4: navn = "Onsdag";
		
		break;
		case 5: navn = "Torsdag";
		break;
			
		case 6: navn = "Fredag";
		
		break;
		
        case 7: navn = "Lørdag";
		
		break;
		default: navn= "Ukjent";
		
		}
		
		return navn;
	}

	public static void main(String[] args) {
		System.out.println(dag(5));

	}

}
