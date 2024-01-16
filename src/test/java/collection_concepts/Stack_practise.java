package collection_concepts;

import java.util.Stack;

public class Stack_practise {

	public static void main(String[] args) {
		
		Stack<Integer> stk =new Stack<Integer>();
		stk.push(78);  // adding element to statck
		stk.push(89);
		stk.push(68);
		stk.add(93);
		stk.push(88);
		stk.push(67);
		
		System.out.println(stk);
		
		stk.pop(); // remove last element from stack
		
		System.out.println(stk);
		
		stk.remove(0); // normal remove using element at 0th position 
		
		System.out.println(stk);
		
		System.out.println("Size is : "+stk.size());
		
		int topelement=stk.peek(); // top element value 
		
		System.out.println("Top element is : "+topelement); 
		
		for(Integer n:stk)
		{
			System.out.println(n);
		}
		
		



	}

}
