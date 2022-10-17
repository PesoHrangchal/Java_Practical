package practical;

public class VarargsEg {
	static void show(String...text) {
		System.out.println("Show method invoked");
		for(String s:text) {
			System.out.println(s);
		}
	}
	public static void main(String args[]) {
		show();//zero argument
		show("Hi");//one arguments
		show("I","Love","Coding");//three arguments
	}
}
