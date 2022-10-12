package practical;


class Shape{
	String name="circle";
}
class Size extends Shape{
	String name="Triangle";
	void print() {
		System.out.println(name);
		System.out.println(super.name);

	}
}
public class SuperClass1 {
public static void main(String[] args) {
	Size s=new Size();
	s.print();
}
}
