package Day01;
import java.util.*;

public class DuplicatContains4Array {

	public static void main(String[] args) {
		
		int[] nums = {1,2,3,4,1};
		
		Set<Integer> mySet = new LinkedHashSet<Integer>();
		for(int x: nums) {
			mySet.add(x);
		}
		Iterator itr = mySet.iterator();
		
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		System.out.println();
		System.out.println(nums.length);
		System.out.println(mySet.size());
		int numsSize = nums.length;
		int mySetSize = mySet.size();
		if(numsSize == mySetSize) {
			System.out.println("false");
		} else {
			System.out.println("true");
		}
			
		
	}

}
