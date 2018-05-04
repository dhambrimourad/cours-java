package ept.td1;

import java.util.Random;

public class ChoisirEntier { 
	public static void main(String[ ] args) {
		int tab[] = new int[10];
		
		for (int i=0;i<10;i++){
			Random random = new Random();
			int m = random.nextInt();
			tab[i] = m;
		}
		
		for (int i=0;i<10;i++){
			if (tab[i] >= 10)
				System.out.println("m = " + tab[i]);
		}
	}
}
