package practical;
//understanding type -- 1. variable type--int a=50
	//2. reference type
	//class bank
	//psvm(String []args)
	//bank obj;
	//object type---bank obj=new bank()
/*public class Binding {
	private void display() {//static binding
		System.out.println("Samjhe??");
	}
	public static void main(String args[]) {
		Binding obj=new Binding();
		obj.display();
	}
}*/
class TestBinding{
	void show() {//dinamic binding
		System.out.println("ab samjhe??");
	}
}
class Binding extends TestBinding{
	void show() {
		System.out.println("override");
	}
	public static void main(String[] args) {
		TestBinding obj=new Binding();
		obj.show();
	}
}