package array;
//multidimensional array
public class Array2D {
	public static void main(String args[]) {
		//declaring & initializing 2D array
		int arr[][]= {{2,5,4},{6,4,2},{9,6,0}};
		for(int i=0;i<3;i++) {//for printing row
			for(int j=0;j<3;j++) {//foe printing column
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
