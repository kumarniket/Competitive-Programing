package G4G_02_Array;

public class LargestElement {
	
	public static int LargestEle(int arr[]) {
		int res = 0;
		
		for(int i=1; i<arr.length; i++) {
			if(arr[i]>arr[res]) {
				res = i;
			}
		}
		
		return arr[res];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,3,10,5,6,7,8};
		int result = LargestEle(arr);
		System.out.println(result);
		

	}

}
