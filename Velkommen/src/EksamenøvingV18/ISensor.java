package EksamenøvingV18;

public interface ISensor {
	public double leseav();

	public static void smartPanel(ISensor sensor, VarmePanel panel, double grense) {
		
		while(true) {
			
			double verdi = sensor.leseav();
			if(verdi < grense) {
				panel.on();
			}
			else if (verdi > grense) {
				panel.off();
			}
			vent(60);
		}
		
	}

	public static void vent(int secs)  {
		
		try {
			Thread.sleep(secs*1000);
		}
		catch (Exception e) {
			e.printStackTrace();		}
	}
}
