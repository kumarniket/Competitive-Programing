package Day3;
import java.util.*;

public class String4DuplicatWord {

	public static void main(String[] args) {
		
		String input = "i am from from patna - india india";
		
		String[] inputarra = input.split(" ");
		
		Set<String> mySet = new LinkedHashSet<String>();
		
		for(String x: inputarra) {
			mySet.add(x);
		}
		//collection framework to 
		Iterator<String> itr = mySet.iterator();
		
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
	}

}
