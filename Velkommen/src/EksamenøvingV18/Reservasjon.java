package EksamenøvingV18;

public class Reservasjon {
	private Rom rom;
	private Person person;

	public Reservasjon(Rom rom, Person person) {
		this.rom = rom;
		this.person = person;
	}
	public Rom getRom() {
		return rom;
	}
	public void setRom(Rom rom) {
		this.rom = rom;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerrson(Person person) {
		this.person = person;
	}
	public String toString() {
		
		return rom.toString() + " " +  person.toString();
		
		
	}
}
