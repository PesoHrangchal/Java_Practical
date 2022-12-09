package collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEg {
	public static void main(String[] args) {
		List<String>al=new ArrayList<String>();//declaring ArrayList using List
		//method add(0---we can add element in the list
		al.add("Rose");
		al.add("Sunflower");
		al.add("Rose");
		al.add(0,"Lily");
		al.add(2,"Daisy");
		al.add("Marigold");
		al.add(6,"Tulip");
		al.add("Jasmine");
		al.add("Orchid");
		al.add("Lotus");
		al.add(5,"Lavender");
		//add element at the end of the list
		al.add("Pallabi");
		System.out.println(al);
		//define the no. of elements using size()
		System.err.println("Size of Array List:"+al.size());
		//specific element of given index using get()
		System.out.println("Element if index value is"+al.get(6));
		//remove any element from list using remove()
		al.remove(6);
		System.out.println(al);
		System.err.println("Size of Array List:"+al.size());
		}
}
