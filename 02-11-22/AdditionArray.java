package array;
//two matrices addition
public class AdditionArray {
	public static void main(String args[]) {
		//create matrix
		int a[][]= {{1,2,3},{4,8,6}};
		int b[][]= {{7,8,1},{6,0,5}};
		//create another matrix for storing result
		int c[][]=new int[2][3];
		//logic and printing
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				c[i][j]=a[i][j]+b[i][j];
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}
}
