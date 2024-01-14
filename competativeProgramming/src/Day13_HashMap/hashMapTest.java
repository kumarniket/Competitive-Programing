package Day13_HashMap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class hashMapTest {

	public static void main(String[] args) {
		HashMap<String, List<String>> map = new HashMap<>();
		
		map.put("GCGV21", Arrays.asList("21","segment_Blue"));
		map.put("GCGC02", Arrays.asList("02","package_BasicBlue"));
		
		System.out.println(map.keySet());
		System.out.println(map.values());
		System.out.println("1");
		
		for(String i: map.keySet()) {
			System.out.println(i + "- " + map.get(i).get(0));
			System.out.println(i + "- " + map.get(i).get(1));
			
			
			
		}
		
	

	}

}
