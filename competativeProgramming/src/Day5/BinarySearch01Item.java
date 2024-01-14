package Day5;


// find the item in given array using binary search 

public class BinarySearch01Item {

	public static void main(String[] args) {
		
		int arr[] = {2,3,4,5,6,8,10,12,13,14};
		int item = 14;
		
		int li = 0;
		int hi = arr.length - 1;
		int mid = (li + hi) / 2;
		
		while(li<=hi) {
			
			if(arr[mid] == item) {
				System.out.println("Element is at " + mid + " at index");
				break;
			} 
			else if(arr[mid] < item) {
				li = mid + 1;
				
			}
			else {
				hi = mid - 1;
			}
			mid = (li + hi)/2;
			
		}
		if(li>hi) {
			System.out.println("Element not Found");
		}

	}

}
