package EksamenøvingV18;

class VarmePanel implements IKontrol {
	boolean status;
	IAktuator iaktuator;

	public VarmePanel(IAktuator aktuator) {
		this.iaktuator = aktuator;
		this.status = false;
	}
	public void on() {
		if(!status) {
			iaktuator.aktiver();
			status = true;
		}
		
	}
	public void off() {
		if(status) {
			iaktuator.deaktiver();
			status = false;
		}
	}
	public boolean getStatus() {
	    return this.status;
	}
}
