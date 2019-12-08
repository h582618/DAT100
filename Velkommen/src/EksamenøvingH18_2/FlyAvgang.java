package EksamenøvingH18_2;

public class FlyAvgang {
	public final static int LEDIG = 1;
	public final static int OPPTATT = 2;
	public final static int CHECKEDIN = 3;
	public final static int BOARDED = 4;

	private int[][] flyavgang;
	
	public FlyAvgang(int r, int p) {
		flyavgang = new int[r][p];
		for(int i = 0; i < flyavgang.length; i++) {
			for(int k = 0; k < flyavgang[i].length; k++) {
				flyavgang[i][k] = LEDIG;
			}
		}	
	}
	public void print() {
	
		for(int i = 0; i < flyavgang.length; i++) {
			for(int k = 0; k < flyavgang[i].length; k++) {
				if(flyavgang[i][k] == LEDIG) {
					System.out.print("O");
				} else {
					System.out.print("X");
				}
			}
			System.out.println(" " + (i+1));
		}
		
	}
	
	public void setStatus(int r, int p, int status) {
		flyavgang[r][p] = status;
	}
	public boolean reserver(int r, int p) {
		if(flyavgang[r][p] == LEDIG) {
			flyavgang[r][p] = OPPTATT;
			return true; 
			} else {
				return false;
			}
		
	}
	public String printcard(int r, int p, String navn) {
		
		String [] sete = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R"};
		
		String card = "Not checked in";
		
		if(flyavgang[r][p] == CHECKEDIN) {
			card = navn + "\n" + (r+1) + sete[p];
		}
		return card;
	}
	
	public boolean boardingcompleted() {
		boolean boarded = true;
		for(int i = 0; i < flyavgang.length; i++) {
			for(int k = 0; k < flyavgang[i].length; k++) {
				if(flyavgang[i][k] == OPPTATT || flyavgang[i][k] == CHECKEDIN) {
					boarded = false;
				}
			}
		}
		return boarded;
		
	}
}
