package Day7_G4g_Mat;
import java.math.BigInteger;
import java.util.*;


public class factBitInt {
	
	public static BigInteger bibn(int n){
        BigInteger a = new BigInteger("0");
        BigInteger b = new BigInteger("1");
        BigInteger c = new BigInteger("1");
        for(int i=2; i<=n; i++){
            c = a.add(b);
            a = b;
            b = c;
            
        }
        return b;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     
	     int p = 6;
	    System.out.println(bibn(p));

	}

}
