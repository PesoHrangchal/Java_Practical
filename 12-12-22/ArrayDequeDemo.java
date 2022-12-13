package collection;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeDemo {
		public static void main(String args[]) {
			//creating and adding
			Deque<String> dq=new ArrayDeque<>();
			dq.add("Atif");
			dq.add("Rohan");
			dq.offerFirst("Reuben");
			System.out.println("After first offer:"+dq);
			dq.add("Peso");
			dq.offerLast("Sunny");
			System.out.println("After last offer:"+dq);
			//traversing
			for(String s:dq) {
				System.out.println(s);
			}
			//dq.peek() and dq.peekFirst same as peek()
			System.out.println("peek:"+dq.peekLast());
			System.out.println("After peek last");
			for(String s1:dq) {
				System.out.println(s1);
			}
			//dq.poll() and dq.pollFirst same as poll()
			System.out.println("poll:"+dq.pollLast());
			System.out.println("After poll Last:");
			for(String s2:dq) {
				System.out.println(s2);
			}
		}
	}
