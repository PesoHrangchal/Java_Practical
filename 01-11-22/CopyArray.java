package array;

public class CopyArray {//class
	public static void main(String args[]) {
		//declaring a source array
		char[] copyFrom= {'d','e','c','f','f','e','i','n'};
		//declaring a destination array
		char[] copyTo=new char[7];//new array
		System.arraycopy(copyFrom,2,copyTo,0,5);
		//print the destination array
		System.out.println(String.valueOf(copyTo));
	}
}
