package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListSortEg {
	public static void main(String args[]) {
		List<String> al=new ArrayList<String>();
		al.add("Rose");
		al.add("Sunflower");
		al.add("Lily");
		al.add("Daisy");
		al.add("Marigold");
		al.add("Tulip");
		al.add("Jasmine");
		al.add("Orchid");
		al.add("Lotus");
		al.add("Lavender");
		System.out.println("Sorted list:");
		Collections.sort(al);
		for(String a:al) {
			System.out.println(a);
		}
		List<Integer> al1=new ArrayList<Integer>();
		al1.add(20);
		al1.add(46);
		al1.add(18);
		al1.add(8);
		al1.add(36);
		al1.add(56);
		al1.add(75);
		al1.add(6);
		System.out.println("Reversed list:");
		Collections.reverse(al1);
		for(int a:al1) {
			System.out.println(a);
		}
		System.out.println("Sorted Integer list:");
		Collections.sort(al1);
		for(int a:al1) {
			System.out.println(a);
		}
		
	}
}
