package Day01;

import java.util.*;
public class RepeatingMissing6Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {4,3,6,2,1,1};
		
		Map <Integer, Boolean> numberMap = new HashMap<>();
		
		int lenArray = arr.length;
		
		//Repeating array
		
		for(Integer i: arr) {
			if(numberMap.get(i)==null) {
				numberMap.put(i, true);
			} else {
				System.out.println("Repating: " + i);
			}
		}
		
		//Missing Array
		for(int i=1; i<=lenArray; i++) {
			if(numberMap.get(i)==null) {
				System.out.println("Missing: " + i);
			}
		}
		

	}

}
