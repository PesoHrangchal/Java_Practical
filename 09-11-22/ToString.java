package string;
//represent any object to String, we can return value of object instead of hashcode.
public class ToString {
	int RollNo;
	String Name, Address;
	ToString(int rollno, String name, String address){
		this.RollNo=rollno;
		this.Name=name;
		this.Address=address;
	}
	public String toString() {//return object into string
		return RollNo+ " "+Name+" "+Address;
	}
	public static void main(String...args) {
		ToString S1=new ToString(123,"peso","shillong");
		ToString S2=new ToString(124,"atif","shillong");
		System.out.println(S1);
		System.out.println(S2);
	}
}
