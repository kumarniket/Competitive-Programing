package Day7_G4g_Mat;

public class computingPower11 {
	
	public static int power(int x, int n) {
		
		int temp = (int) Math.pow(x, n/2);
		temp = temp * temp;
		if (n==0) {
			return 1;
		}
		
		if(n%2 == 0) {
			return temp;
		}
		else {
			return temp *  x;
		}
		

	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int res = power(3,3);
		System.out.println(res);

	}

}
