package EksamensøvingH17;

public class FlyavgangMain {

	public static void main(String[] args) {
	
		
		Flyavgang k1 = new Flyavgang(45, "Bergen" , "15:20", 'o');
		Flyavgang k2 = new Flyavgang(25, "Oslo" , "22:00", 'b');
		Flyavgang k3 = new Flyavgang(10, "Amsterdam" , "17:40", 'g');
		Flyavgang k4 = new Flyavgang(3, "Ibiza" , "09:10", 'c');
		
		Flyavganger f1 = new Flyavganger(10);
		
		f1.settinn(k1);
		f1.settinn(k2);
		f1.settinn(k3);
		f1.settinn(k4);
		System.out.println(f1.antall());
		
		System.out.println(f1.erNull(5));
		
	
		
		f1.visinfo();
		
		f1.setStatus(10, 'c');
		
		System.out.println("");
		
		f1.visinfo();
	
	
	}
	

}
