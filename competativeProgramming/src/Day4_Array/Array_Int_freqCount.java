package Day4_Array;

public class Array_Int_freqCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 23452355;
		
		char ch[] = {'0','1','2','3','4','5','6','7','8','9'};
		
		String str = Integer.toString(n);
		int count=0;
		for(int i=0; i<ch.length; i++) {
			for(int j=0; j<str.length(); j++) {
				
				if(str.charAt(j) == ch[i]) {
					count++;
				}
			}
			if(count>0){
				
	            System.out.println(ch[i]+": "+count);
	            count = 0;
	        }
		}
		
		
		
		

	}

}
