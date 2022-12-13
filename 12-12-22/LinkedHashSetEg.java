package collection;

import java.util.LinkedHashSet;

public class LinkedHashSetEg {
	public static void main(String args[]) {
		//creating hashset and adding elements
		LinkedHashSet<String> lhs=new LinkedHashSet<String>();
		lhs.add("Two");
		lhs.add("One");
		lhs.add("Three");
		lhs.add("Four");
		lhs.add("Five");
		System.out.println("Original List:"+lhs);
		//removing specific element from list
		System.out.println(lhs.remove("Two"));
		System.out.println("Updated List:"+lhs);
		//six is not present
		//return false
		System.out.println(lhs.remove("Six"));
	}
}
