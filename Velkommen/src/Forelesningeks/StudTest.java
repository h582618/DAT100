package Uke39;

public class StudTest {

	public static void main(String[] args) {

		Student s = new Student(12345,"Matias","Vedeler",23);
		Student s2 = new Student(9999, "Kari", "Olsen",15);
		
		
		s.setStudentnr(9999);
		s.setFornavn("Harald");
		
		s.skrivUt();

		
//		s.studentnr=12345;
//		s.fornavn = "Ole";j
		
		System.out.println(s.studentnr);
		System.out.println(s.fornavn);
		
		System.out.println();
//		s.skrivut();
		s2.skrivUt();
		System.out.println(s2.fulltNavn());
		s2.endreEtternavn("Vedeler");
		System.out.println(s2.fulltNavn());
		System.out.println(s2.getFornavn());
		
		
		System.out.println(s.erLik(s2));
	}

}
