package G4G_03_Searching;

public class Medium2Array {
	
	public static void medium2Array(int arr[], int n, int brr[], int m) {
		int len = n+m;
        int i;
        int m1=0; int m2=0;
        int[] temp = new int[len];
        for(i=0; i<n; i++){
            temp[i] = arr[i];
        }
        for(int j=0; j<m; j++){
            temp[i+j] = brr[j];  
        }
		
        for(int k=0; k<len; k++) {
			System.out.print(temp[k] + " ");
			
		}
        System.out.println();

        for(int k=0; k<len; k++) {
        	if(len%2 != 0) {
        		m1 = (len+1)/2;
        		System.out.println(temp[m1]);
        		break;
        	} else {
        		m2 = ((len/2) + m1)/2;
        		System.out.println(temp[m2]);
        		break;
        	}
        }
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5};
		int n = arr.length;
		int[] brr = {6,7,8,9,10};
		int m = arr.length;
		
		medium2Array(arr, n, brr, m);
		
		

	}

}
