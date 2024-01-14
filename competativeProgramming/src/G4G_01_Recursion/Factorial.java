package G4G_01_Recursion;

public class Factorial {
	
	static int fact(int i) {
		if(i==1 || i==0) {
			return i;
		}
		return (i * fact(i - 1));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 1;
		
		System.out.println(fact(num));

	}

}
