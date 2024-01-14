package Day12_Stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class balancedParenthesis {
	
	static boolean isMatching(char a, char b) {
		
		return ( a=='(' && b==')' || a=='{' && b=='}' || a=='[' && b==']');
	}
	
	static boolean isBalanced(String str) {
		
		Deque<Character> stack = new ArrayDeque<>();
		
		for(int i=0; i<str.length(); i++) {
			
			//taking character from string one by one 
			Character x = str.charAt(i);
			
			if(x == '(' || x == '{' || x =='[') {
				stack.push(x);
				 
			} else {
				
				if(stack.isEmpty() == true) {
					return false;
				} 
				else if(isMatching(stack.peek(), x) == false) {
					return false;
				} else {
					stack.pop();
				}
			} 
		}
		
		
		return (stack.isEmpty()==true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="(((})))";

	    System.out.println(isBalanced(s));

	}

}
