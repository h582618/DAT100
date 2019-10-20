package Uke38;

public class Oppgave3 {

	public static void main (String[] args) {


		double temp1 [] = {15.6,17.8,19.0,20.5,18.3,16.7,15.3};
		double temptotal=0.0;	
		Double maks = 0.0;
		
		
		System.out.println("Analsye av temperaturer"); 
		for(int i=0; i < 15; i++) {
			System.out.print("*");
		}
		System.out.println(" ");
		int dag = 1;
// gsnitt og dager print	
		for(int k = 0; k <temp1.length; k++) {
		System.out.println(dag+". dag: " + temp1[k]);
		dag++;
		temptotal = temptotal + temp1[k]; 
		}
		Double gsnitt = temptotal/(dag-1);

		
//		maks 
		for(int c = 0; c < temp1.length; c++) {
			if(temp1[c] > maks) {
				maks = temp1[c]; 	
			}
		}
		
		
		System.out.print("Gjennomsnitts temperateuren var ");
		System.out.printf("%1$.2f",gsnitt);
		System.out.println(" grader");
		System.out.print("Maksimum for denne uken var " + maks);
	}
	
	
}
