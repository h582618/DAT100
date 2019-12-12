package EksamensøvingH17;

public class ResultatMain {

	public static void main(String [] args) {
		Resultat [] tab = new Resultat[10];
		
		tab[0] = new Spyd("Matias", 'M',77.0);
		tab[1] = new HundreMeter("Martine", 'K',10.40);
		tab[2] = new HundreMeter("Fatima", 'K',9.);
		
		double beste = 0.0;
		Resultat best = null;
		for(int i = 0; i < tab.length; i++) {
			if(tab[i] != null && tab[i].poeng() > beste) {
				beste=tab[i].poeng();
				best = tab[i];
			}
		}
		System.out.println(best.toString());
		
	}
}
