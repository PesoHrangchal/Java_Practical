package practical;
interface Multiple_in1{//1st parent interface
	void show();
}
interface Multiple_in2{//2nd parent interface
	//void display();
	void show();
}
public class Multiple_Inheritance implements Multiple_in1,Multiple_in2{
	public void show() {
		System.out.println("hi");
	}
	/*public void display() {
		System.out.println("hello");
	}*/
	public static void main(String args[]) {
		Multiple_Inheritance obj=new Multiple_Inheritance();
		obj.show();
		//obj.display();
	}
}
