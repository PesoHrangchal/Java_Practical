//Final Keyword----Cannot change the value of the final variable
// final variable, final class, final method


package practical;

public class FinalVariable {
	final int value = 50;//final variable
	
	void display() {
		System.out.println(value);
	}
public static void main(String[] args) {
	FinalVariable fv = new FinalVariable();
	fv.display();
}
}
