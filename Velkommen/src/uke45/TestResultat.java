package uke45;

public class TestResultat {

	public static void main(String[] args) {
		Resultat s1 = new Resultat(14,85);
		
		Resultat s2 = new Resultat(15,65);
		
		ResultatSamling a = new ResultatSamling(10);
		
//		a.settInn(s1);
		
		System.out.println(a.settInn(s1));
		
		System.out.println(a.settInn(s1));
		
		System.out.println(a.settInn(s2));

	}

}
