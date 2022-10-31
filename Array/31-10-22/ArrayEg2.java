package array;

public class ArrayEg2 {
	public static void main(String args[]) {
		int a[]=new int[5];
		a[0]=3;
		a[1]=5;
		a[2]=2;
		a[3]=43;
		a[4]=46;
		//traversing an array
		for(int i=0;i<a.length;i++) {//length is one of the property of an array
			System.out.println(a[i]);
		}
		/*for(int b:a) {
			System.out.println(b);
		}*/
	}
}
