package uke45;

public class KontoMain {

	public static void main(String[] args) {
		Konto s1 = new Konto("Matias","1208.13.04589",450);
		Konto s2 = new Konto("Matias2","1208.14.04589",1050);
		
		System.out.println(s1.toString());
		
		s1.InntakPenger(500000);
		
		System.out.println(s1.toString());
		
		s1.UttakPenger(50);
		
		System.out.println(s2.toString());
		
		
		Double Saldo = s1.SamletSaldo(s1.GetSaldo(),s2.GetSaldo());
		
		System.out.println("Samlet saldo " + Saldo);
		
	}

}
