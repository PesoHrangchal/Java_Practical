package practical;

import java.util.Scanner;

class encap_d{//fully encapsulated
	//private data member
	private String Student_name;
	private int Studentuser_id;
	private int password;
	int total,percentage;
	public String get_name() {//using getter get name
		return Student_name;
	}
	public int get_stu_id() {
		return Studentuser_id;
	}
	public int get_pass() {
		return password;
	}
	public void set_name(String stu) {
		Student_name=stu;
	}
	public void set_stu_id(int stuid)//using setter method
	{
		Studentuser_id=stuid;
	}
	public void set_pass(int stu) {
		password=stu;
	}
	//calc is a method to calculate total marks
	public void calc(int sub1,int sub2,int sub3,int sub4,int sub5) {
		total=sub1+sub2+sub3+sub4+sub5;
		percentage=total/5;//finding percentage
		if(percentage>=35&&percentage<45) {
			System.out.println("D Grade");
		}else if(percentage>=45&&percentage<55) {
			System.out.println("C Grade");
		}else if(percentage>=60&&percentage<75) {
			System.out.println("B Grade");
		}else if(percentage>=75&&percentage<85) {
			System.out.println("A Grade");
		}else if(percentage>=85&&percentage<100) {
			System.out.println("0 Grade");
		}else {
			System.out.println("Fail/Absent");
		}
	}
}
public class Encasulation {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		String stuname;
		int stuid,password;
		int sub1,sub2,sub3,sub4,sub5;
		//user input using scanner
		System.out.println("Enter your name:");
		stuname=sc.nextLine();
		System.out.println("Enter your User_Id:");
		stuid=sc.nextInt();
		System.out.println("Enter your password:");
		password=sc.nextInt();
		System.out.println("Enter mark of sub1:");
		sub1=sc.nextInt();
		System.out.println("Enter mark of sub2:");
		sub2=sc.nextInt();
		System.out.println("Enter mark of sub3:");
		sub3=sc.nextInt();
		System.out.println("Enter mark of sub4:");
		sub4=sc.nextInt();
		System.out.println("Enter mark of sub5:");
		sub5=sc.nextInt();
		encap_d obj=new encap_d();
		obj.set_name(stuname);
		obj.set_pass(password);
		obj.set_stu_id(stuid);
		
		System.out.println("Name:"+obj.get_name());
		System.out.println("ID:"+obj.get_stu_id());
		System.out.println("Password:"+obj.get_pass());
		obj.calc(sub1, sub2, sub3, sub4, sub5);
		System.out.println("Percentage:"+obj.percentage);
		
		
		
	}
}
