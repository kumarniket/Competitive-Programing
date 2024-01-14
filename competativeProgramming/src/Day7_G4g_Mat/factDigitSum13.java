package Day7_G4g_Mat;

public class factDigitSum13 {
	
	static int fact(int n) {
		
		
		if(n==0) {
			return 1;
		}
		
		return n*fact(n-1);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int k = 19;
        
        int res = fact(k);
        
        System.out.println(res);
        
        int temp = res;
        int sum = 0;
        while(temp != 0){
            int ld = temp % 10;
            sum = sum + ld;
            temp = temp/10;
        }
        System.out.println(sum);

	}

}
