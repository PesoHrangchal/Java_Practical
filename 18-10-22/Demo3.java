package practical;
//Example of interface
public interface Test {//interface
	void show();//method of interface
}
class Demo4 implements Test{// 1st child class
	public void show() {//method of class
		System.out.println("Hello");
	}
}
class Demo3 implements Test{// 2nd child class
	public void show() {//method of class
		System.out.println("Welcome to the Company");
	}
	public static void main(String args[]) {
		Demo3 obj=new Demo3();
		obj.show();
	}
}
