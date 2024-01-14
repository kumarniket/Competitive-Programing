package JavaFrescoMiniProj;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import javax.imageio.IIOException;

import com.sun.net.httpserver.Authenticator.Result;

public class Array2Davg {
	
	public static String[] calculateGrade(int[][] students_marks) {
        int row = students_marks.length;
        
        String[] retVal = new String[row];
        
        for(int i=0; i<row; i++){
            int sum =0;
            int avg;
            int count=0;
            
            for(int j=0; j<students_marks[i].length; j++){
                sum = sum + students_marks[i][j];
                count++;
            }
            
            avg = sum/count;
            if(avg>=90){
                retVal[i]="A+";
            } else if(avg<90 && avg>=80){
                retVal[i]="A";
            } else if(avg<80 && avg>=70){
                retVal[i]="B";
            }
            else if(avg<70 && avg>=60){
                retVal[i]="C";
            }
            else if(avg<60 && avg>=50){
                retVal[i]="D";
            } else {
                retVal[i]="F";
            }
            
            
        }
        return retVal;

    }

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int students_marksRows = Integer.parseInt(sc.next().trim());
        int students_marksColumns = Integer.parseInt(sc.next().trim());
		
		
		int[][] students_marks = new int[students_marksRows][students_marksColumns];
		for(int i = 0; i < students_marksRows; i++)
        {
			for(int j = 0; j < students_marksColumns; j++)
			{
				students_marks[i][j] = Integer.parseInt(sc.next().trim());				
			}
        }

        String[] result = calculateGrade(students_marks);
		
		for(int i = 0; i < result.length; i++)
        {
			System.out.println(result[i]);
            bufferedWriter.write(result[i]+"\n");
        }       
        bufferedWriter.close();
    }
}




