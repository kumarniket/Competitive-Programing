package Day7_G4g_Mat;

public class IsPrime16 {

	public static boolean isPrime(int N) {
		// code here
		if (N == 1) {
			return false;
		}
		if (N == 2 || N == 3) {
			return true;
		}
		if (N % 2 == 0 || N % 3 == 0) {
			return false;
		}
		int i;
		for (i = 5; i * i <= N; i = i + 5) {
			if (N % i == 0) {
				return false;
			} else {
				return true;
			}
		}
		return false;

	}

	public static void main(String[] args) {
		IsPrime16 obj = new IsPrime16();
		int N =6;
		if (obj.isPrime(N)) {
			System.out.println("Yes");

		}
		else {
			System.out.println("No");
		}

	}

}
