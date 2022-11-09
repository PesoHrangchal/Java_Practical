package string;

import java.util.StringTokenizer;

//Simple way to break a string, pakage:java.util.StringTokenizer
public class StringTokenizerEg {
	public static void show() {//show method
		StringTokenizer St1=new StringTokenizer("Anudip Foundation Skill and Career Development Center");
		while(St1.hasMoreTokens()) {//boolean method, it checks if there is more token available or not
			System.out.print(St1.nextToken(" "));//string method, it returns the next token from StringTokenizer object
			StringTokenizer St2=new StringTokenizer("Shillong is called, the Scotland of the East");
			while(St2.hasMoreTokens()) {
				System.out.println();
				System.out.println(St2.nextToken(","));
		}}}
	public static void main(String args[]) {
		show();
	}
}
