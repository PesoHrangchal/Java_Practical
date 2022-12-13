package collection;

import java.util.EmptyStackException;
import java.util.Stack;

public class StackEg2 {
	public static void main(String []args) {
		Stack<Integer>s=new Stack<>();//creating array
		System.out.println("Stack:"+s);
		//pushing elements
		pushelement(s,15);
		pushelement(s,45);
		pushelement(s,20);
		pushelement(s,30);
		//popping elements
		popelememt(s);
		popelememt(s);
		//checking empty stack, if yes throw exception
		try {
			popelememt(s);
		}catch(EmptyStackException e) {
			System.out.println("Stack empty");
		}
	}
//push operation
	private static void popelememt(Stack<Integer> s) {
		//invoke push() method
		s.push(new Integer(a));
		System.out.println("push:"+a);
		System.out.println("Stack:"+s);//modified stack
		
	}
//pop operation
	private static void pushelement(Stack<Integer> s, int i) {
		// invoke pop() method
		Integer i=(Integer)s.pop();
		System.out.println("push:"+i);
		System.out.println("Stack:"+s);//modified stack
	}
}
