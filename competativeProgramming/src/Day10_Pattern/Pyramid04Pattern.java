package Day10_Pattern;

public class Pyramid04Pattern {

	public static void main(String[] args) {
		
//		  *
//		 ***
//		*****
		int n = 5;
		
		int i=1;
		while(i<=n) {
			
			int j=1;
			while(j<=n-i) {
				System.out.print(" ");
				j++;
			}
			
			int k=1;
			while(k<=2*i-1) {
				System.out.print("*");
				k++;
			}
			System.out.println();
			i++;
		}

	}

}
