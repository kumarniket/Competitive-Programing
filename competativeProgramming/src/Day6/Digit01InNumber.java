package Day6;

public class Digit01InNumber {

	public static void main(String[] args) {
		
		int n = 22010;
		
		int count = 0;
		 while(n!=0) {
			 n = n/10;
			 count ++;
		 }
		 System.out.println("Total no of digit in given number: " + count);

	}

}
