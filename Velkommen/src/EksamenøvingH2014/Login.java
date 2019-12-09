package EksamenøvingH2014;

import java.util.Arrays;
import java.util.Arrays.*;
public class Login {

	private boolean [][] monster = {
			{true,false,false},
			{true,true,true},
			{false,false,true}};
			
	public boolean erMed(int r, int k) {
		return monster[r][k];
	}
	
	public void skrivUt() {
		
		for(int i = 0; i < monster.length; i++) {
			for(int j = 0; j < monster[i].length; j++) {
				if(erMed(i,j)){
					System.out.print("*");
				} else {
					System.out.println(" ");
				}
			}
			System.out.println("");
		}
	}
	
	public boolean sjekkMonster(boolean [][] mnstr) {

		
		return(Arrays.equals(mnstr, monster));
	}
	

}
