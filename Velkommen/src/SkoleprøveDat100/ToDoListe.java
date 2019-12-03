package SkoleprøveDat100;

public class ToDoListe {
	private ToDoElement [] todoTab ;
	private int antall;
	
	public ToDoListe(int maksAntall) {
	
	 todoTab = new ToDoElement[maksAntall];
	 antall = 0;
	 
	}
	
	public void leggTil(ToDoElement tde) {
	  
		if(todoTab.length >= antall ) {
			todoTab[antall] = tde;
			antall++;
		}
		else {
			System.out.println("Kan ikke legge til, Tabellen er full");
		}
	}
	public ToDoElement finnViktig() {
		int viktigste = todoTab[0].getPrioritet();
		ToDoElement prio = todoTab[0];

		for(int i = 1; i < antall; i++) {
			if(viktigste > todoTab[i].getPrioritet()) {
				viktigste = todoTab[i].getPrioritet();
				prio = todoTab[i];
			}
		}
		return prio;
	}
}

