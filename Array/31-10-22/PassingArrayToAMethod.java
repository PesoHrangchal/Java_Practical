package array;
//to find max value in array
public class PassingArrayToAMethod {
	//creating a method which pass an array as a parameter
	static void maximumNo(int arr[]) {//method name maximumNo
		int max=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(max<arr[i]) 
			max=arr[i];
		}
			System.out.println(max);
	}
	public static void main(String[] args) {
		//declaring & initializing array
		int a[]= {5,6,7,8,3,4};
		maximumNo(a);//passing array to a method max
	}
}
