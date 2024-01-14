package G4G_02_Array;

public class ArrayRotationByD {
	
	private static void ArrayRotate(int[] arr,int n,int d) {
		// TODO Auto-generated method stub
		int[] temp = new int[d];
		
		for(int i=0; i<d; i++) {
			temp[i] = arr[i];
		}
		
		for(int i=d; i<n; i++) {
			arr[i-d] = arr[i];
		}
		
		for(int i=0; i<d; i++) {
			arr[n-d+i] = temp[i];
		}
		
		for(int i=0; i<n; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5,6,7,8};
		int n = arr.length;
		int d = 2;
		
		ArrayRotate(arr,n,d);

	}



}
