package Day9_Recursion;

public class Rprint1toN_02 {
	
	static void print1toN(int n) {
		if(n==0) {
			return;
		}
		print1toN(n-1);
		System.out.println(n + " ");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		print1toN(n);

	}

}
