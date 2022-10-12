//2). refer with parent class method

package practical;

class shape1{//parent class
	void print() {//parent class method
	System.out.println("Print Circle");	
	}
}
class Size1 extends shape1{//child class
	void print() {//same method of parent class (child class method)
		System.out.println("Print Triangle");}
		void display() {//new method of child class
			System.out.println("Print nothing");}
		void show() {//final method
		super.print();// refer immediate method
		display();
		print();
	}
}
	
class SuperMethod {
	public static void main(String[] args) {
		Size1 obj = new Size1();
		obj.show();
	}
}
