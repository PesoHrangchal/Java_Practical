//3)-----refer immediate parent class constructor


package practical;
class Shape2{//parent class
	//constructor of parent class
		Shape2(){
			System.out.println("Hello");
		}
	}
class Size2 extends Shape2 {//child class
	//constructor of the child class
	Size2(){
		//invoke immediate parent class constructors line no.7
	super();
	System.out.println("hi");
	}

}
class SuperConstructor {
	public static void main(String[] args) {
		Size2 obj = new Size2();
	}
}
