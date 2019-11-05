package uke45;



public class TestResultat {

	public static void main(String[] args) {
		Resultat s1 = new Resultat(14,85);
		
		Resultat s2 = new Resultat(15,65);
		
		ResultatSamling a = new ResultatSamling(4);
		
		System.out.println(s1.SkrivUt());
		
		a.settInn(s1);
		a.settInn(s2);
		a.settInn(new Resultat(23,66));
		
		System.out.println(a.settInn(new Resultat(25,66)));

		System.out.println(a.finn(25));
		
		System.out.println(a.finnPos(23));
		
		
//		Resultat etResultat = a.finn(23);
		if(a.finn(23) != null) {
			a.finn(23).setPoengsum(90);
		}
		
		System.out.println(a.gSnitt());
	
		a.skrivUt();
	
		

	}

}
