package NettresurserOppg;

import java.util.HashMap;
import java.util.Scanner;

public class Universitet {
	private HashMap<String, Student> studenter;
	private HashMap<String, Kurs> kurs;
	
	
	
	public void Kommandoløkke() {
		
		
		studenter = new HashMap<String, Student>();
		kurs = new HashMap<String, Kurs>();
		
		Scanner sc = new Scanner(System.in);
		String input = null;
		String input1 = null;
		boolean fortsett = true;
		
		System.out.println("------------------------------");
		while(fortsett) {
			System.out.println("Velkommen til Universitet sin Kommandolinje");
			System.out.println("S = Legg til ny Student");
			System.out.println("K = Legg til nytt kurs"); 
			System.out.println("P = Legger til Student til kurs og omvendt");
			System.out.println("V = Hvilke kurs har studenten");
			System.out.println("E = Hvilke studenter har kurset");
			System.out.println("Q = Avslutt");
			input = sc.nextLine();
			
			switch(input) {
			case "S": 
				System.out.println("Navn");
				input = sc.nextLine();
				S(input);
				break;
			case "K":
				System.out.println("Kurskode");
				input = sc.nextLine();
				System.out.println("Kursetittel");
				input1 = sc.nextLine();
				K(input,input1);
				break;
			case "P":
				System.out.println("Navn");
				input = sc.nextLine();
				System.out.println("Kurskode");
				input1 = sc.nextLine();
				P(input,input1);
				break;
			case "V":
				System.out.println("Skriv navn");
				input = sc.nextLine();
				V(input);
				break;
			case "E":
				System.out.println("Kurskode");
				input = sc.nextLine();
				E(input);
				break;
			case "Q":
				fortsett = false;;
				break;
			default:
				System.out.println("Ikke en gyldig key");
			}
			System.out.println("");
			System.out.println("------------------------------");
		}
	}

	public void S(String navn) {
		Student student = new Student(navn);
		if(!(studenter.containsKey(navn) && studenter.get(navn) != null)) {
			studenter.put(navn, student);
			System.out.println("Studenten " + navn + " lagt til");
		}
		
		
	}
	public void K(String kurskode, String kurstittel) {
		Kurs kurset = new Kurs(kurskode,kurstittel);
		if(!(kurs.containsKey(kurskode))) {
			kurs.put(kurskode, kurset);
		}
	}
	public void P(String navn, String kurskode) {
		
		   Student s = studenter.get(navn);
		   Kurs k = kurs.get(kurskode);
		   
		   s.settInnKurs(k);
		   k.settInnStudent(s);
		}
	public void V(String navn) {
		
		Student s = studenter.get(navn);
		if(s != null) {
		s.visKurs();
		} else {
			System.out.println("Finner ikke student");
		}
	}
	public void E(String kurskode) {
		
		Kurs k = kurs.get(kurskode);
		
		if(k != null) {
			k.visStudenter();
			} else {
				System.out.println("Finner ikke kurs");
			}
		
		}
	}
	
