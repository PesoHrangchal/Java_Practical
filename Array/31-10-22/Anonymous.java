package array;

public class Anonymous {
	static void print(int arr[]) {//static method to receive anonymous array
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		System.out.println();
		//using for each loop
		for(int a:arr) {
			System.out.println(a);
		}
	}
		public static void main(String args[]) {
			print(new int[] {10,20,30,40,50,60,70,80});//passing anonymous array to method print
		}
}
