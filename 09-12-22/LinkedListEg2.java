package collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListEg2 {
	public static void main(String args[]) {
		LinkedList<String> ll=new LinkedList<String>();
		ll.add("Misbah");
		ll.add("Abhisek");
		ll.add("Atif");
		ll.add("Niladri");
		ll.add("Soumya");
		ll.add("Sourav");
		System.out.println("List 1 elements: "+ll);
		LinkedList<String> ll2=new LinkedList<String>();
		ll2.add("Peso");
		ll2.add("Shifa");
		ll2.add("Elijah");
		System.out.println("List 2 elements: "+ll2);
		//adding new elements to List 1
		ll.addAll(ll2);
		System.out.println("After adding new elements: "+ll);
		//removing specific element from list 1
		ll.remove("Niladri");
		System.err.println("After removing:"+ll);
		//removing specific element from list 1 on the basis of position
		ll.remove(1);
		System.err.println("After removing on the basis of position:"+ll);
		//remove all elements of list 2
		ll.removeAll(ll2);
		System.err.println("After removing all elements from list 2"+ll);
		//removing 1st element from list
		ll.removeFirst();
		System.err.println("After removing first elements"+ll);
		//removing last element from list
		ll.removeLast();
		System.err.println("After removing last elements"+ll);
		//adding new elements to list 1
		ll.add("pallabi");
		ll.add("Anudip");
		ll.add("Java");
		ll.add("Pallabi");
		ll.add("Collection");
		System.out.println("Updated list elements: "+ll);
		//remove first occurrence of element
		ll.removeFirstOccurrence("Pallabi");
		System.out.println("After removing 1st occurrence: "+ll);
		//remove last occurrence of element
		ll.removeLastOccurrence("Pallabi");
		System.out.println("After removing last occurrence: "+ll);
		//Traversing the list in reverse order
		Iterator<String> i=ll.descendingIterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		//removing all elements
		ll.clear();
		Iterator<String>itr=ll.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println(ll);
	}
}
