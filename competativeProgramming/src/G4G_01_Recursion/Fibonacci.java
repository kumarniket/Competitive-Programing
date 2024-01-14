package G4G_01_Recursion;

public class Fibonacci {

	static int fib(int i) {
		int k = i;
		if(k == 0) {
			return 0;
		}
		if(k == 1 || k == 2) {
			return 1;
		}
		
		return fib(k-1) + fib(k-2);
		
		
	}
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		int fib_series = 9;
		for(int i =0; i<fib_series; i++) {
			System.out.println(fib(i));
		}
		
		

	}

}
