package Day7_G4g_Mat;

public class iterativePower12 {
	public static int power(int x, int n) {
		int res = 1;
		while(n>0) {
			if(n%2 != 0) {
				res = res * x;
				//System.out.println("res value every step: " + res);
			}
			x = x * x;
			//System.out.println("X value every step: " + x);
			n = n/2;
			//System.out.println("n value every step: " + n);
		}
		return res;
	}

	public static void main(String[] args) {
		int v = power(3,3);
	    System.out.println("Power using iterative solution: " + v);

	}

}
