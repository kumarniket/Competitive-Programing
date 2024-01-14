package Day01;

import java.util.*;

public class matrix2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the rows: ");
		int rows = sc.nextInt();
		System.out.println("Enter the cols: ");
		int cols = sc.nextInt();
		
		int[][] matrix2d = new int[rows][cols];
		
		//taking input
		System.out.println("Printing the input ");
		for(int i=0; i<rows; i++) {
			for(int j=0; j<cols; j++) {
				matrix2d[i][j] = sc.nextInt();
			}
		}
		
		//printing output
		System.out.println("Printing the output ");
		for(int i=0; i<rows; i++) {
			for(int j=0; j<cols; j++) {
				System.out.print(matrix2d[i][j]+" ");
			}
			System.out.println();
		}
		

	}

}
