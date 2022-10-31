package array;

public class ArrayExample {
	public static void main(String args[]) {
		//declaration
		String[] name= {"Peso","Jacob","Atif","Baby"};
		//for loop
		for(int i=0;i<name.length;i++) {
			System.out.println(name[i]);
		}
		System.out.println();
		//declaration
		int []phone= {123,345,567,2467,5643,22332,5443};
		//for each loop
		for(int n:phone) {
			System.out.println(n);
		}
	}
}
