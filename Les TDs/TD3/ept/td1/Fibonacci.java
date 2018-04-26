package ept.td1;

public class Fibonacci {

	public static void main(String[] args) {
		int i = 0;
		while (fibonacci(i) <= 1000){
			System.out.println(fibonacci(i));
			i++;
		}
	}
	
	public static long fibonacci(int n) {
        if (n <= 1) return n;
        else return fibonacci(n-1) + fibonacci(n-2);
    }

}
