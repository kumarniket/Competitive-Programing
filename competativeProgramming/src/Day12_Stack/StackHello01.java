package Day12_Stack;

import java.util.ArrayDeque;

public class StackHello01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDeque stack = new ArrayDeque<>();
		
		stack.push(10);
		stack.push(20);
		stack.push(8);
		stack.push(80);
		
		System.out.println(stack.size());
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.peek());
		System.out.println(stack.isEmpty());

	}

}
