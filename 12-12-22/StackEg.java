package collection;

import java.util.Stack;

public class StackEg {
	public static void main(String args[]) {
		//creating stack class
		Stack<Integer>s=new Stack<>();
		//checking stack empty or not
		boolean result=s.isEmpty();
		System.out.println("Is the stack empty? "+result);
		//adding element using push() method
		s.push(45);
		s.push(56);
		s.push(98);
		s.push(23);
		s.push(12);//1
		s.push(75);//0
		System.out.println("Stack elements: "+s);//result
		Integer digit=s.peek();//access element from the top of the stack
		System.err.println("Top element="+digit);
		System.out.println("Stack elements after peek: "+s);
		Integer digit2=s.pop();
		System.err.println("Poped element="+digit2);
		System.out.println("Stack elements after pop: "+s);
		int digit1=s.search(23);//search any element
		System.out.println("Search element: "+digit1);
		int x=s.size();
		System.out.println("Stack size: "+x);//find the size of stack
		result=s.empty();//checking empty or not
		System.out.println("Is stack empty? "+result);
	}
}
