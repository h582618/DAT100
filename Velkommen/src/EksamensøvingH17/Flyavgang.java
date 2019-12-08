package EksamensøvingH17;

public class Flyavgang {
	private int nummer;
	private String destinasjon;
	private String tid;
	private char status;
	
	Flyavgang(int nummer, String destinasjon, String tid, char status){
		this.nummer = nummer;
		this.destinasjon = destinasjon;
		this.tid = tid;
		this.status = status;
	}
	
	public String toString() {
		
		String status1 = null;
		
		switch(status){
		case 'o' :
			status1 = "on-time";
			break;
		case 'g' :
			status1 = "go-to-gate";
			break;
		case 'b' :
			status1 = "boarding";
			break;
		case 'c':
		    status1 = "gate-closed";
		    break;
		default: 
			status1 = "-";
		}
		
		
		return nummer + " " + destinasjon +" " + tid + " " + status1 + "\n"; 
	}

	public int getNummer() {
		return nummer;
	}

	public void setNummer(int nummer) {
		this.nummer = nummer;
	}

	public String getDestinasjon() {
		return destinasjon;
	}

	public void setDestinasjon(String destinasjon) {
		this.destinasjon = destinasjon;
	}

	public String getTid() {
		return tid;
	}

	public void setTid(String tid) {
		this.tid = tid;
	}

	public char getStatus() {
		return status;
	}

	public void setStatus(char status) {
		this.status = status;
	}
}
