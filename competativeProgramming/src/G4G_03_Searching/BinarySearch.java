package G4G_03_Searching;

public class BinarySearch {
	
	public static int binarySearch(int arr[], int n, int x) {
		int low =0;
		int high = n-1;
		
		while(low<=high) {
			int mid = (low+high)/2;
			if(arr[mid] == x) {
				return mid;
			}
			
			if(arr[mid] < x){
				return low = mid+1;
				}
			else {
				return high = mid-1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5,6,7,8};
		int n = arr.length;
		int x = 1;
		System.out.println(n);
		System.out.println(binarySearch(arr,n,x));

	}

}
