package Day11_ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListAdd01 {

	public static void main(String[] args) {
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
			arr.add(5);
			arr.add(5);
			arr.add(3);
//			arr.add(4);
//			arr.add(5);
//			arr.add(6);
		ArrayList<Integer> arrNew = new ArrayList<Integer>();
		
		System.out.println(arr);
		
		Iterator<Integer> it = arr.iterator();
		while(it.hasNext()) {
			
			System.out.print(it.next() + " ");
		}
		System.out.println();
		
		
		for(int i=0; i<arr.size()-1; i++) {
			
			int maxAdj = Math.max(arr.get(i), arr.get(i+1));
			
			arrNew.add(maxAdj);

			}
		
		
		
		System.out.println();
		System.out.println(arrNew);

	}

}
