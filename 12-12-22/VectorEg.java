package collection;
import java.util.Vector;
public class VectorEg {
	public static void main(String args[]) {
		//creating vector
		Vector<String>vc=new Vector<String>(4);
		//adding elements to vector
		vc.add("Dog");
		vc.add("Cat");
		vc.add(0,"Tiger");
		vc.add("Lion");
		//checking size and capacity
		System.out.println("Size:"+vc.size());
		System.out.println("Capacity:"+vc.capacity());
		//checking cat is present or not
		System.out.println(vc);
		if(vc.contains("Cat")) {
			System.out.println("Element present");
		}else
			System.out.println("Element not present");
		//getting first element
		System.out.println("1st element:"+vc.firstElement());
		//getting last element
		System.out.println("Last element:"+vc.lastElement());
		//checking index of specific element
		System.out.println("Index of Cat:"+vc.indexOf("Cat"));
	}
}
