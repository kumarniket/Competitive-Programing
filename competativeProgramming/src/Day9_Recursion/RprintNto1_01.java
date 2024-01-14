package Day9_Recursion;

public class RprintNto1_01 {
	
	static void printNto1(int n) {
		if(n==0) {
			return;
		} else {
			System.out.println(n + " ");
			printNto1(n-1);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		printNto1(n);

	}

}
