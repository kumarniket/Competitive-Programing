package G4G_04_Sorting;

public class selection02Sort {
	
	static void selectionSortAlgo(int arr[], int n) {
		//thita(n^2) -- TS
		
		for(int i=0; i<n; i++) {
			int min_index = i;
			
			for(int j=i+1; j<n; j++) {
				if(arr[j] < arr[min_index]) {
					min_index = j;
				}
			}
			int tem = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = tem;
		}
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,8,4,10,18,12,19};
		int len = 7;
		
		selectionSortAlgo(arr, len);
		
		for(int i=0; i<len; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
