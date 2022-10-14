package practical;
//create object without new keyword
class AnotherClass{//another class
	//data member of another class
	String name;
	int age;
}
public class Obj_Without_New {//class
	public static void main(String args[]) {//main method
		try {//creating object using new instance method
			AnotherClass o1=AnotherClass.class.newInstance();
			AnotherClass o2=AnotherClass.class.newInstance();
			AnotherClass o3=AnotherClass.class.newInstance();
			AnotherClass o4=AnotherClass.class.newInstance();
			AnotherClass o5=AnotherClass.class.newInstance();
			//initializing data members of object
			o1.name="a";
			o1.age=20;
			o2.name="b";
			o2.age=30;
			o3.name="c";
			o3.age=24;
			o4.name="d";
			o4.age=50;
			o5.name="e";
			o5.age=57;
			//printing statement
			System.out.println("Name="+o1.name+" age="+o1.age);
			System.out.println("Name="+o2.name+" age="+o2.age);
			System.out.println("Name="+o3.name+" age="+o3.age);
			System.out.println("Name="+o4.name+" age="+o4.age);
			System.out.println("Name="+o5.name+" age="+o5.age);
		}catch(Exception e) {
			//System.out.println(e);
		}
	}
}
