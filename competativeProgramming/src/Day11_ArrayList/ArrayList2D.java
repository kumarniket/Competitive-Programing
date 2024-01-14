package Day11_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//taking row
		int Row = sc.nextInt();
		
		ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
		for(int i=0; i<Row; i++) {
		// taking column
		int Col = sc.nextInt();
		
		//Declaring and intialization an arrayliist for each row 
		ArrayList<Integer> temp = new ArrayList<>();
		
		for(int j=0; j<Col; j++) {
			temp.add(sc.nextInt());
		}
		arr.add(temp);
		
		}
		
		
		System.out.println(arr.get(1));
		for(int i=0; i<arr.size(); i++) {
			for(int p=0; p<=arr.get(i).size(); p++) {
				
			}
		}
		

	}

}


