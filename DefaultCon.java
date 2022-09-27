package practical;
//display default value
//display default constructor
public class DefaultCon {
	int age;
	String name;
	void show() {//method to display age and name
		System.out.println(age+" "+name);
	}
	public static void main(String args[]) {
		//first object creation
		DefaultCon d=new DefaultCon();
		//second object creation
		DefaultCon d1=new DefaultCon();
		d.show();
		d1.show();
	}
}
