//Final Keyword----
//Final class-- cannot extend the final class
package demo;

final class FinalClass{}
class test extends FinalClass{//can't extend final class
	void show()
	{
		System.out.println("Nothing");
		}
	public static void main(String[] args) {
		test t= new test();
				t.show();
	}
}
