package G4G_01_Recursion;

public class CheckingPalindrom {
	
	static boolean isPalindrom(String str, int start, int end) {
		
		if(start>=end) {
			return true;
		}
		
		return((str.charAt(start) == str.charAt(end)) && (isPalindrom(str, start+1, end-1)));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "abcyba";
		 int start = 0;
		 int str_len = str.length();
		 int end = str_len - 1;
		 
		 System.out.println(isPalindrom(str, start, end));

	}

}
