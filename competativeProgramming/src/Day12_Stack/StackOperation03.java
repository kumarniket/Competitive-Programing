package Day12_Stack;

import java.util.Scanner;
import java.util.Stack;

public class StackOperation03 {
	
	 public static void insert(Stack<Integer> st, int x)
	    {
	        st.push(x);
	    }
	    
	    //Function to remove top element from stack.
	    public static void remove(Stack<Integer> st)
	    {
	        st.pop();
	    }
	    
	    //Function to print the top element of stack.
	    public static void headOf_Stack(Stack<Integer> st)
	    {
	        // Your code here
	        System.out.println(st.peek());
	    }
	    
	    //Function to search an element in the stack.
	    public static boolean find(Stack<Integer> st, int val)
	    {
	        // Your code here
	        return st.contains(val);
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

				Scanner sc = new Scanner(System.in);
				int t = sc.nextInt();
				
				while(t-- > 0)
				{
				    //laring stack of integers
				    Stack <Integer> st = new Stack<Integer>();
				    
				    int q = sc.nextInt();
				    
				    // Working with queries
				    while(q-- > 0)
				    {
				       
				        char ch = sc.next().charAt(0);
				        
				        //Creating an object of class Geeks
				        StackOperation03 obj = new StackOperation03();
				       if(ch == 'i')
				      {
				         int x = sc.nextInt();
				         
				         //calling insert method of class geeks
				         obj.insert(st, x);
				      }
				    
				      if(ch == 'r')
				      {
				          //calling remove method of class geeks
				          obj.remove(st);
				      }
				      
				      if(ch == 'h')
				      {
				          //calling headOf_Stack method of class geeks
				          obj.headOf_Stack(st);
				      }
				      if(ch == 'f')
				      {
				          int x = sc.nextInt();
				          
				          //Printing Yes if the value x
				          //is in the Stack else No
				          if(obj.find(st, x))
				          System.out.println("Yes");
				          else 
				          System.out.println("No");
				      }
				    }
				 }
			
		
		// } Driver Code Ends

	}

}
