package Day14_Collection;

import java.util.Set;
import java.util.TreeSet;

public class floorSortedArrayTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<Integer> trset = new TreeSet<>(Set.of(19,20,34,5,36,99,38));
		System.out.println(trset);
		Integer v = trset.floor(37);
		System.out.println(v);
		

	}

}
