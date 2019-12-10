package NettresurserOppg;

import java.util.ArrayList;

public class Kurs {

	private String kurskode;
	private String kurstittel;
	
	private ArrayList<Student> studenter = new ArrayList<Student>();
	
	public Kurs(String kurskode, String kurstittel) {
		this.kurskode = kurskode;
		this.kurstittel = kurstittel;
	}
	
	public void settInnStudent(Student s) {
		
		if(s != null && !studenter.contains(s)) {
		  studenter.add(s);
	      }
	}
	public void visStudenter() {
		for(Student e : studenter) {
			
			System.out.println(e.toString());
		}
	}
	public String toString() {
		return kurskode +" " + kurstittel;
	}
}
