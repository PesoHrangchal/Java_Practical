package string;

import java.util.Scanner;

public class StringTest {
public void show() {//method
	Scanner s=new Scanner(System.in);
	System.out.println("Enter String:");//user input
	String A=s.next();
	System.out.println("Enter another String:");
	String B=s.next();
	
	System.out.println(A.length()+B.length());//1st string length+(concat)2nd String
	System.out.println((A.compareTo(B)>0)?"Yes":"No");//compare to ()
	System.out.println(A.substring(0,4).toUpperCase()+A.substring(2)+" "+B.substring(0,1).toLowerCase()+B.substring(1));
}//Substring Java
public static void main(String ...args) {
	StringTest t=new StringTest();
	t.show();
}
}
