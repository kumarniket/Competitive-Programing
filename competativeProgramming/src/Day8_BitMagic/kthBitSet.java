package Day8_BitMagic;

public class kthBitSet {
	
	public static void BitSetWithPosition(int n) {
		System.out.println(Integer.toBinaryString(n));
		System.out.println(n&1); //last bit of binary
		
		
		
		if((n&1)!=0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int N = 10;
		BitSetWithPosition(N);
	}

}
