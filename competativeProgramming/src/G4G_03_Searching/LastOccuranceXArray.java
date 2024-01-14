package G4G_03_Searching;

public class LastOccuranceXArray {
	
	public static int LastOccuXArr(int arr[], int n, int x) {
		int start=0;
		int end=n-1;
		int res= -1;
		
		while(start<=end) {
			int mid = (start+end) /2;
			if(arr[mid] == x) {
				res = mid;
				//going to after mid to check 
				start = mid+1;
			}
			else if(arr[mid] > x) {
				end = mid-1;
			} 
			else {
				start= mid +1;
			}
			
		}
		
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {2,4,6,8,10,10,10,10,30};
		int n = arr.length;
		int x = 10;
		System.out.println(LastOccuXArr(arr,n,x));

	}

}
