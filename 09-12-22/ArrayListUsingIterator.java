package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListUsingIterator {
	public static void main(String args[]) {
		List<String>al=new ArrayList<String>();//declaring ArrayList using List
		//method add(0---we can add element in the list
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
		System.out.println("traversing using for loop");
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
		System.out.println();
		System.out.println("traversing using for each loop");
		for(String a:al) {
			System.out.println(a);
		}
		System.out.println();
		System.out.println("traversing using for iterator");
		Iterator<String>itr=al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
