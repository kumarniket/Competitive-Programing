package Day4_Array;

public class ArrayDiff03value {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int arr[] = {2,4,6,10,3,1,9};
        int diff=0;

        for(int i=0; i<arr.length-1; i++){
            if((arr[i+1]-arr[i]) > diff){
                diff = arr[i+1] - arr[i];            }

        }
        System.out.println("Differnece of Add array " + diff);

	}

}
