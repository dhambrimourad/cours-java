package ept.td1;

public class TestFactoriel {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++)
			System.out.println(factorielle(i));
	}

	public static long factorielle(int n) {
		if (n == 0) {
            return 1;
        } else {
            return (n * factorielle(n - 1));
        }
    }
	
}
