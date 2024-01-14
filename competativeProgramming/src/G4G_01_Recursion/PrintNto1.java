package G4G_01_Recursion;

public class PrintNto1 {

	static void PrintNto1Recursion(int n){
		if(n<=0) {
			return;
		}
		else {
			System.out.println(n + " ");
			PrintNto1Recursion(n-1);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PrintNto1Recursion(5);
		

	}

}
