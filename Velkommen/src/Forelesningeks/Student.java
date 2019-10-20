package Forelesningeks;

public class Student {
		
//	data egenskaper, studentnr, etternavn
	
	int studentnr;
	int alder;
	String fornavn;
	String etternavn;

	
//	Spesialkonstruktør
	public Student(int studentnr, String fornavn, String etternavn, int alder) {
		this.studentnr = studentnr; //This gjør at man henter variabelen fra utenfor metoden
		this.fornavn = fornavn; //hvis man ikke skriver "this" henter den variabelen fra metoden.
		this.etternavn = etternavn;
		this.alder = alder;
	}
	
	public int getStudentnr() {
		return studentnr;
	}
	
	public String getFornavn() {
		return fornavn;
	}
	public String getEtternavn() {
		return etternavn;
	}
	
	public void setStudentnr(int studentnr ) {
		this.studentnr = studentnr;
	}
	
	public void setFornavn(String fornavn) {
		this.fornavn = fornavn;
	}
	
	public void setEtternavn(String etternavn) {
		this.etternavn = etternavn;
	}
//	objektmetoder skrivUt 
	public void skrivUt() {
		System.out.println(studentnr);
		System.out.println(fornavn);
		System.out.println(etternavn);
	}

	public String fulltNavn() {
		
		return etternavn + " , " + fornavn + " , Alder " + alder;
	}
	public void endreEtternavn(String nytt) {
		etternavn = nytt;
	}
	public boolean erLik(Student annen) {
		if (annen == null) {
			return false;
		}
		return studentnr == annen.studentnr;
	}
}
