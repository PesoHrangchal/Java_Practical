package practical;
//runtime polymorphism---method overriding
class Runtimepoly{
	int value=50;//data member
	void show()//parent class method
	{
		System.out.println("Show anything");
	}
}
public class TestRuntimePoly extends Runtimepoly {//child class
	int value=70;
	void show() {//method override
		System.out.println("Show nothing");
	}
	public static void main(String args[]) {
		Runtimepoly obj=new TestRuntimePoly();
		obj.show();
		System.out.println(obj.value);
		}
}
