package SkoleprøveDat100;

public class ToDoElement {
	private String Beskrivelse;
	private int Nummer;
	private int Prioritet;
	
public ToDoElement(String Beskrivelse, int Nummer, int prioritet) {
	this.Beskrivelse = Beskrivelse;
	this.Nummer = Nummer;
	this.Prioritet = prioritet;
}

public String getBeskrivelse(){
	return this.Beskrivelse;
}
public void setBeskrivelse(String beskrivelse) {
	this.Beskrivelse = beskrivelse;
}

public int getNummer() {
	return this.Nummer;
}
public void setNummer(int nummer) {
	this.Nummer = nummer;
}
public int getPrioritet() {
	return this.Prioritet;
}
public void setPrioritet(int prioritet) {
	this.Prioritet = prioritet;
}

public String toString() {
	
	System.out.println(this.Beskrivelse + "\n" + "Nummer   : " + this.Nummer + "\n" + "Prioritet: " + this.Prioritet);
	
	return this.Beskrivelse + "\n" + "Nummer : " + this.Nummer + "\n" + "Prioritet: " + this.Prioritet;
}


}


