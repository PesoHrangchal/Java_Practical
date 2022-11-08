package string;
//char[]works as java string
 public class StringExample2 {
	 public void show() {
		 char[] arr= {'j','a','v','a'};//char type array
		 String s=new String(arr);
		 System.out.println("Value is :"+s);
		 System.out.println(arr);
	 }
	 public void myFunction() {
		 String m1="pallabi";
		 String m2=new String(m1);
		 System.out.println(m2);
		 System.out.println(m1.startsWith("p"));
		 System.out.println(m1.endsWith("p"));
		 System.out.println(m1.charAt(0)=='p');
		 System.out.println(m1.charAt(0)=='a');
	 }
	 public static void main(String ...args) {
		 StringExample2 s=new StringExample2();
		 s.show();
		 s.myFunction();
	 }
}
