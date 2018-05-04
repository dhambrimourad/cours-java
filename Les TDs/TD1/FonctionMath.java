package ept.td2;

public class FonctionMath {

	public static int factorielle(int n) {
		if (n == 0) {
            return 1;
        } else {
            return (n * factorielle(n - 1));
        }
	}
	
	public static int somme(int n) {
		if (n == 0) {
            return 0;
        } else {
            return n + somme(n - 1);
        }
	}
	
	public static double racineCarre(double n) {
		if (n <= 0) {
            return 0;
        } else {
            return Math.sqrt(n);
        }
	}
	
	public static void main(String[] args) {
		for (int i=0;i<100;i++){
			System.out.println(racineCarre(somme(i)));
		}
		
		
	}

}
