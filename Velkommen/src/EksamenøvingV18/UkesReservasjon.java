package EksamenøvingV18;

public class UkesReservasjon extends Reservasjon {

	private boolean[] dager;
	
	public UkesReservasjon(Rom rom, Person person) {
		super(rom,person);
		dager = new boolean[7];
	}
	
	public boolean[] getDager() {
		return dager;
	}

	public void setDager(boolean[] dager) {
		this.dager = dager;
	}

	private String tilDag(int i) {
		
		String dag = null;
		
		switch(i) {
		case 0:
			dag = "Mandag";
		break;
		case 1:
			dag = "Tirsdag";
		break;
		case 2:
			dag = "Onsdag";
		break;
		case 3:
			dag = "Torsdag";
		break;
		case 4:
			dag = "Fredag";
		break;
		case 5:
			dag = "Lørdag";
		break;
		case 6:
			dag = "Søndag";
		break;
		default:
			dag ="Ugyldig";
		
	}
		return dag;
}
	public static UkesReservasjon nyReservasjon(String navn, char bygg, int nummer, boolean[] dager) {
		Person p1 = new Person(navn);
		Rom r1 = new Rom(bygg, nummer);
		
		UkesReservasjon r = new UkesReservasjon(r1,p1);
		r.setDager(dager);
		return r;
	}
	
	@Override
	public String toString() {
		
		String res = null;
		
		for(int i = 0; i < dager.length; i++) {
			if(dager[i]) {
				res += tilDag(i);
			}
		}
		
		
		return super.toString() + "\n" + res +"\n";
	}
}

