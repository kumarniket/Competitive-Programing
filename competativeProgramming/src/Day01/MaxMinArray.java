package Day01;

public class MaxMinArray {
	
	static class Pair {
		int Max;
		int Min;
	}
	
	static Pair getMinMax (int arr[], int n) {
		Pair pair = new Pair();
		int i;
		
		if(n == 1) {
			pair.Max = arr[0];
			pair.Min = arr[0];
			return pair;	
		}
		
		if(arr[0]>arr[1]) {
			pair.Max = arr[0];
			pair.Min = arr[1];
			
		} else {
			pair.Max = arr[1];
			pair.Min = arr[0];
		}
		
		for(i=2; i<n; i++) {
			if(arr[i]>pair.Max) {
				pair.Max = arr[i];
			}
			else if (arr[i]<pair.Min) {
				pair.Min = arr[i];
			}
		}
		return pair;
	}
	

	public static void main(String[] args) {
		int arr[] = {100,200,30,400,5000,1000};
		int arrSize = 6;
		
		Pair pair = getMinMax(arr, arrSize);
		System.out.println("Max value : "+ pair.Max);
		System.out.println("Min value : "+ pair.Min);
		
		

	}

}
