package string;
//append() insert() delete() reverse()-mutable class(String Builder & Buffer)
public class MutableExampleString {
	public static void my() {
		//String Buffer
		StringBuffer s=new StringBuffer("Hello");//object of string buffer class
		s.append("World");
		System.out.println("String is: "+s);//Hello World
		s.insert(2, "Riya");//(int off set,string s)
		System.out.println("Insert is: "+s);//HeRiyallo World
		System.out.println("Capacity is: "+s.capacity());
		//String Builder
		StringBuilder s1=new StringBuilder("World");//s1=World
		s1.replace(1, 3, "java");
		System.out.println("replace is:"+s1);//Wjavald
		s1.delete(1,3);
		System.out.println("delete is:"+s1);//Wvald
		s1.reverse();
		System.out.println("reverse is:"+s1);//dlavW
	}
	public static void main(String... args) {
		my();
	}
}
