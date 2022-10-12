package practical;
public class FinalMethod {
	//create a final method 
	public final void display() {
		System.out.println("This is a final method.");
	}
/*
  class Main extends FinalMethod{
 try to over ride final method
 public final void display() {
 System.out.println("The final method is overridden");
}
*/
public static void main(String[]args) {
	FinalMethod obj = new FinalMethod();
	obj.display();
}
}
