package G4G_01_Recursion;

public class SumDigit {
	
	static int SumOfDigit(int i) {
		if(i<=0) {
			return 0;
		}
		return (i + SumOfDigit(i-1));
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int k = 5;
		System.out.println(SumOfDigit(k));

	}


}
