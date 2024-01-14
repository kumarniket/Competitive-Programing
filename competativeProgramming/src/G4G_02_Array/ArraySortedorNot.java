package G4G_02_Array;

public class ArraySortedorNot {
	
	public static boolean ArraySortedChecking(int arr[]) {

//		for(int i=0; i<arr.length; i++) {
//			for(int j=i+1; j<arr.length; j++) {
//				if(arr[i]>arr[j]) {
//					return false;
//				}
//			}
//		} return true;
		
		for(int i=1; i<arr.length; i++) {
			if(arr[i]<arr[i-1]) {
				return false;
			}
		} return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,3,4,5,6,11,7,8};
		boolean result = ArraySortedChecking(arr);
		if(result == true) {
			System.out.println("Array is sorted !!");
		} else {
			System.out.println("Array is not sorted!!");
		}
		

	}

}
