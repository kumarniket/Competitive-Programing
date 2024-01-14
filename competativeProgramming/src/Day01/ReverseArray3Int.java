package Day01;

public class ReverseArray3Int {
	
	static void reverseArray (int arr[], int size) {
		
		int start = 0;
		int end = size-1;
		int temp;
		while(start < end) {
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
			
		}
	
	}
	static void arrayPrint (int arr[], int size) {
		for(int i=0; i<size; i++) {
			System.out.print(arr[i] + " ");
		
		}
		System.out.println();
		
	}

	public static void main(String[] args) {
		int arr[] = {100,200,30,400,5000,1000};
		int size = 6;
		System.out.println("old array: \n");
		arrayPrint(arr,size);
		reverseArray(arr, size);
		System.out.println("new array: \n");
		arrayPrint(arr,size);
		

	}

}
