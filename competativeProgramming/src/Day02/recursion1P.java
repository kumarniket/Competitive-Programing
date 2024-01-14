package Day02;

//print number from 5 to 1
public class recursion1P {
	
	public static void printNumber(int N) {
		if(N==0)
			return;
		System.out.println(N);
		printNumber(N-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//recursion1P rp = new recursion1P();
		int n = 6;
		printNumber(n);

	}

}
