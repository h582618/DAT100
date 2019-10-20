package Uke39;

public class Oppgave1_1 {

	public static void main(String[] args) {
		boolean[][] aud = 
			{ 
			  { false, false, false, false}, // rad 0
			  { false, false, true,  false}, // rad 1
			  { true,  false, true,  true }, // rad 2
			  { true,  true,  true,  true }, // rad 3
		};
		 
		
		
//	1a	
       
		
		String b = HvorErLedigPlass(aud);
		
        System.out.println(b);
		LedigeProsent(aud);
//		
//		int l = 0;
//		int o = 0;
//			for(int i = 0; i < aud.length; i++) {
//				boolean[] rad = aud[i]; 
//				
//				for(int b = 0; b < rad.length; b++) {
//					boolean plass = rad[b];
//					
//					if(plass) {
//						l++;
//					} 
//					else {
//						o++;
//					}
//					}
//				}
//			System.out.println("Det er " + l + " ledige plasser i auditoriet");
//			// 1b	
//			double totalt = l+o;
//			
//		
//			
//			System.out.println((o/totalt)*100+"% av plassene er opptatt");

			// 1c
//			Begynner på rad 0
			
//			Bruker stopper for å stoppe loopene når en ledig plass er funnet
			
			
//			
//			int radteller = 0;
//			int plassteller = 0;
//			
//			boolean funnet = false;
//			
//		for(int i = 0; i < aud.length && !funnet; i++) {
//			boolean[] rad = aud[i];
//			radteller++;
//			
//			plassteller = 0;
//			
//			for(int b = 0; b < rad.length && !funnet; b++) {
//				boolean plass = rad[b];
//				plassteller ++;
//				if(plass) {
//					funnet = true;
//				}
//			}
//		}
//	
//		System.out.println("Det er ledig på rad " + radteller + " plass " + plassteller);
//	Begynenr på rad 4	
		
//		int radteller = 0;
//		int plassteller = 0;
//		int stopper1 = 0;
//		
//		boolean funnet= false;
//		
//	for(int i = aud.length-1; i > stopper1; i--) {
//		boolean[] rad = aud[i];
//		radteller++;
//		
//		int stopper2 = 0;
//		plassteller = 0;
//		
//		for(int b = rad.length-1; b > stopper2; b--) {
//			boolean plass = rad[b];
//			plassteller ++;
//			if(plass) {
//				stopper1 = i;
//				stopper2 = b;
//			}
//		}
//	}

//	System.out.println("Det er ledig på rad " + radteller + " plass " + plassteller);
		
	}
 
//	
//	public static 
//		}
//	return b;

	public static void LedigeProsent(boolean aud[][]) {
		
	
	int l = 0;
	int o = 0;
	
		for(int i = 0; i < aud.length; i++) {
			boolean[] rad = aud[i]; 
			
			for(int b = 0; b < rad.length; b++) {
				boolean plass = rad[b];
				
				if(plass) {
					l++;
				} 
				else {
					o++;
				}
				}
			}
		System.out.println("Det er " + l + " ledige plasser i auditoriet");
		// 1b	
		double totalt = l+o;
		
	
		
		System.out.println((o/totalt)*100+"% av plassene er opptatt");

	}
//	1d
	public static String HvorErLedigPlass(boolean aud[][]) {
		int antallplasser=0;
		int antallrader=0;
		boolean funnet = false;
	
		for(int i = 0; i <aud.length && !funnet; i++) {
			boolean rad[] = aud[i]; 
			antallrader++;
			antallplasser = 0;
			for(int b = 0; b < rad.length && !funnet; b++) {
				antallplasser++;
				boolean plass = rad[b];
				if(plass) {
					funnet = true;
				}
			
			}
		}
		
	String k = ("Det er ledig på rad " + antallrader + " plass " + antallplasser);

	
	return k;	
	
	}
	
	public static String LedigPlass1(boolean aud[][]) {
	
		boolean plass = true;
		
		
		return k;
	}
	
	
}
