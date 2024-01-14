package Day4_Array;
import java.util.*;

public class ArrayList01 {

	public static void main(String[] args) {
		
		ArrayList<Integer> alist = new ArrayList<Integer>();
		
		alist.add(20);
		alist.add(40);
		alist.add(60);
		alist.add(35);
		alist.add(25);
		
		System.out.println("printed by Index call");
		System.out.println(alist.get(3));
		
		System.out.println("printed by for loop iteration");
		for(int i=0; i<alist.size(); i++) {
			System.out.print(alist.get(i) + " ");
		}
		System.out.println();
		
		System.out.println("print by using 2nd for loop");
		for(Integer i: alist) {
			System.out.print(i + " ");
		}
		

	}

}
