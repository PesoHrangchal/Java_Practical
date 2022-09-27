package practical;

public class ParameterizedCon {
	int age;
	String name;
	//parameterized construction have arguments/parameters
	ParameterizedCon(int a,String n){
		age=a;
		name=n;
	}
	void show() {
		System.out.println(age+" "+name);
	}
	public static void main(String args[]) {
		ParameterizedCon P=new ParameterizedCon(50,"Karan");
		ParameterizedCon P1=new ParameterizedCon(22,"Rohit");
		P.show();
		P1.show();
	}
}
