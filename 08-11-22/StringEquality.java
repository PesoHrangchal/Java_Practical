package string;

import java.util.Scanner;

public class StringEquality {
	public static void main(String args[]) {
		String str1,str2;
		Scanner ab=new Scanner(System.in);
		System.out.println("Enter first String:");
		str1=ab.next();
		System.out.println("Enter second String:");
		str2=ab.next();
		//comparing two input string
		if(str1.equals(str2))
			System.out.print("Equal Strings");
			else
			System.out.print("Not Equal Strings");
				
		
	}
}
