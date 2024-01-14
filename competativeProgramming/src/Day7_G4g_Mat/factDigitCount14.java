package Day7_G4g_Mat;

public class factDigitCount14 {
	static long fact(int n) {

		if (n == 0) {
			return 1;
		}

		return n * fact(n - 1);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k = 42;

		long res = fact(k);

		System.out.println(res);

		long temp = res;
		long digitCount = 0;
		while (temp != 0) {
			long ld = temp % 10;
			digitCount ++;
			temp = temp / 10;
		}
		System.out.println(digitCount);

	}

}
