package NettresurserOppg;

import java.util.ArrayList;

public class Student {
	private String navn;
	private ArrayList<Kurs> kurs = new ArrayList<Kurs>();

	public Student(String navn ) {
		this.navn = navn;
	}

public void settInnKurs(Kurs k) {
	
	if(k != null && !kurs.contains(k)) {
	  kurs.add(k);
	  System.out.println("Kurs " + k + " lagt til");
      }
}
public void visKurs() {
	

	for(Kurs e : kurs) {
		System.out.println(e.toString());
	}
}
public String toString() {
	
	return navn;
}
}