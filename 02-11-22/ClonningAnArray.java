package array;

public class ClonningAnArray {
	public static void main(String args[]) {
		int[] arr= {44,4,5,6};//declaring and initializing
		System.out.println("Print the actual array");
		for(int i:arr)//for each loop for print
			System.out.println(i);//print
		System.out.println("Print the clonned array");
		int carr[]=arr.clone();//creating clone
		for(int i:carr)//for each loop for cloning array
			System.out.println(i);
		System.out.println("Both are equal or not?");
		System.out.println(arr==carr);//checking
	}
}
