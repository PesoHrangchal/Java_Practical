package collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList1 {
		public static void main(String args[]) {
			LinkedList<String> ll=new LinkedList<String>();
			ll.add("Misbah");
			ll.add("Abhisek");
			ll.add("Atif");
			ll.add("Niladri");
			ll.add("Soumya");
			ll.add("Sourav");
			System.out.println(ll);
			Iterator<String>itr=ll.iterator();
			while(itr.hasNext()) {
				System.out.println(itr.next());
			}
			//adding an element at the specific position
			ll.add(2,"Nisha");//add(int index,element)
			System.err.println("After adding:"+""+ll);
			LinkedList<String> ll2=new LinkedList<String>();
			ll2.add("Peso");
			ll2.add("Shifa");
			ll2.add("Elijah");
			System.out.println("List 2 elements:"+""+ll2);
			//adding all 2nd list element to the 1st list
			ll.addAll(ll2);
			System.err.println("After adding all elements of 2nd list:"+""+ll);
			//adding all 2nd list elements to the 1st list at specific position
			ll.addAll(2,ll2);
			System.err.println("After adding all elements of 2nd list at specific position:"+""+ll);
			//adding element at the 1st position
			ll2.addFirst("Pallabi");
			System.out.println("After adding element at 1st:"+""+ll2);
			//adding element at the last position
			ll2.addLast("Subhajit");
			System.out.println("After adding element at last:"+""+ll2);
			
			
}}
