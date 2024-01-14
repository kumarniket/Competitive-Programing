package G4G_03_Searching;

public class FloorInSortedArr {
	
	static int findFloor(long arr[], int n, long x)
    {
        int index=-1;
        for(int i=0; i<n; i++){
            index++;
            if(arr[n-1]<x){
                return n-1;
            }
            else if(arr[i] == x){
                
                return index;
                
            }
            
            
        }
        return -1;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long arr[] = {1,2,8,10,11,12,19};
		int len = 7;
		long x = 5;
		
		System.out.println(findFloor(arr,len,x));

	}

}
