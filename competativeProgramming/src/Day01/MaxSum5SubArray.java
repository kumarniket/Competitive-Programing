package Day01;

public class MaxSum5SubArray {
	
	public static int maxSubArray(int arr[]) {
		int currSum = 0;
		int maxSum = 0;
		if(arr.length == 1){
            return arr[0];
    } else {
		
		for(int i=0; i<arr.length; i++) {
			currSum = currSum + arr[i];
			
			if(currSum > maxSum) {
				maxSum = currSum;
			}
			if(currSum < 0) {
				currSum = 0;
			}
		}
				
		
		return maxSum;
    }
		
	}

	public static void main(String[] args) {
		
		int arr[] = {5,4,-1,7,8};
		int result = maxSubArray(arr);
		System.out.println(result);
		
		

	}

}
