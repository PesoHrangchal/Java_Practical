package practical;
interface Multiple{
	static int add(int a) {
		return a+a;
	}
	static void display() {}
		//default void show()	}
}
	class demo123 implements Multiple{
		public void display() {
			System.out.println("hi");
		}
	}
public class Multi_inheritance {
	public static void main(String args[]) {
		Multiple obj=new demo123();
		Multiple.display();
		System.out.println(Multiple.add(5));
	}
}
