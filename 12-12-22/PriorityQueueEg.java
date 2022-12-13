package collection;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueEg {
	public static void main(String args[]) {
		PriorityQueue<String>queue=new PriorityQueue<String>();
		queue.add("Akash");
		queue.add("Sayan");
		queue.add("Peso");
		queue.add("John");
		queue.add("Tommy");
		queue.add("Jonathan");
		queue.add("Hasan");
		System.out.println("head:"+queue.element());
		System.out.println("Queue:"+queue);
		System.out.println("head:"+queue.peek());
		System.out.println("Queue:"+queue);
		System.out.println("Iterating the elements");
		Iterator<String> itr=queue.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("head:"+queue.poll());
		System.out.println("Queue:"+queue);
		System.out.println("head:"+queue.remove());
		System.out.println("Queue:"+queue);
		System.out.println("After removing");
		Iterator<String>itr2=queue.iterator();
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}
	}
}
