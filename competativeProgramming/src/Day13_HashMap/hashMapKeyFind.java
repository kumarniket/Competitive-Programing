package Day13_HashMap;
import java.util.*;
import java.util.Scanner;

public class hashMapKeyFind {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int test_case = sc.nextInt();
		HashMap<Integer, String> hashMap = new HashMap<>();
		
		for(int i=0; i<test_case; i++) {
			int key = sc.nextInt();
			String value = sc.next();
			
			hashMap.put(key, value);
		}
		
		int key_check = sc.nextInt();
		
		
		
		for(Map.Entry<Integer, String> e : hashMap.entrySet()) {
			
			System.out.println(e.getKey() + "->" + e.getValue());
			
		}
		System.out.println(hashMap.getOrDefault(key_check, "-1"));
            
		
		

	}

}


/*  
 * Scanner scanner = new Scanner(System.in);
        HashMap<Integer,String> hash = new HashMap<>();
        int n = scanner.nextInt(); 
        scanner.nextLine();
        while(n>0){
            String str =scanner.nextLine();
            String s[] = str.split(" ");
            hash.put(Integer.parseInt(s[0]), s[1]);
            n--;
        }
        int k = scanner.nextInt();
        if(hash.containsKey(k)){
            System.out.println(hash.get(k));
        }
        else{
            System.out.println("-1");
        }
        */
 