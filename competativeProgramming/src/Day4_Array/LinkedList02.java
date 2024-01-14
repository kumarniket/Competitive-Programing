package Day4_Array;
import java.util.*;

public class LinkedList02 {

	public static void main(String[] args) {
		
		LinkedList<String> ll = new LinkedList<String>();
		
		ll.add("Hello");
		ll.add("Man");
		ll.add("Do");
		ll.add("Coding");
		
		System.out.println(ll);
		
		System.out.println(ll.get(2));
		
		System.out.println();
		
		for(String i: ll) {
			System.out.println(i);
		}

	}

}
