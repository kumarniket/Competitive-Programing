package G4G_01_Recursion;

public class Print1toNRecursion {

	static void print1toN(int initial, int n) {
		
		if(initial <= n) {
			System.out.println(initial + " ");
			print1toN(initial + 1, n);
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		print1toN(1,5);

	}

}
