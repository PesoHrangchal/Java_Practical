package collection;

import java.util.LinkedList;

public class LinkedListMethod {
	public static void main(String args[]) {
		LinkedList<String> ll=new LinkedList<String>();
		ll.add("Misbah");
		ll.add("Abhisek");
		ll.add("Atif");
		ll.add("Niladri");
		ll.add("Soumya");
		ll.add("Sourav");
		System.err.println("List 1 element: "+ll);
		//retrieving the first element by default peek() method
		System.out.println(ll.peek());
		//Retrieving the first element of list
		System.out.println(ll.peekFirst());
		//Retrieving the last element of list
		System.out.println(ll.peekLast());
		//retrieve and remove 1st element by using default poll() method
		System.out.println(ll.poll());
		System.out.println("New List 1 element: "+ll);
		//retrieve and remove 1st element
		System.out.println(ll.pollFirst());
		System.out.println("New List 1 element: "+ll);
		//retrieve and remove last element
		System.out.println(ll.pollLast());
		System.out.println("New List 1 element: "+ll);
		//retrieve and remove 1st element by default using pop() method
		System.out.println(ll.pop());
		System.out.println("New List 1 element: "+ll);
		}
}
