package Day7_G4g_Mat;

public class NthGP15 {
	
	public static void termOfGP(int A,int B,int N)
    {
		if(N==1){
            System.out.println(A);
        }
        double r = (double)B/A;
        double res1=(A*Math.pow(r,N-1));
        System.out.println(res1);
    }

	public static void main(String[] args) {
		termOfGP(84,87,3);
		
	}

}
