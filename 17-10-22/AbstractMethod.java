package practical;
abstract class Testabs{//abstract class
	abstract void display();//abstract method
}
class Demo1 extends Testabs{
	void display() {//non abstract method with same name
		System.out.println("Demo1 method invoked");
	}
}
class Demo2 extends Testabs{
	void display() {
		System.out.println("Demo2 method invoked");
	}
}
class AbstractMethod{
	public static void main(String args[]) {
		Testabs obj=new Demo1();
		Testabs obj1=new Demo2();
		obj.display();
		obj1.display();
	}
}