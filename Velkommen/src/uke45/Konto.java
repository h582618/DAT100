package uke45;

public class Konto {
	
	private String navn;
	private String kontonr;
	private double saldo;
	
	private static String bank = "DNB";
	
	
	
	public Konto(String navn, String kontonr, double saldo) {
		this.navn = navn;
		this.kontonr = kontonr;
		this.saldo = saldo;
		
	}
	public double GetSaldo() {
		return saldo;
	}
	public void InntakPenger(int penger) {
		this.saldo = saldo + penger;
	}
	public void UttakPenger(int penger) {
		this.saldo = saldo - penger;
	}
	public String toString() {
		return "Bank: " + bank + ", Navn: " + navn +", Konto nr: " + kontonr + ", Saldo: " + saldo + " NOK";
	}
	public double SamletSaldo(Double Saldo, Double Saldo1) {
	
	return Saldo + Saldo1; 
	}

}
