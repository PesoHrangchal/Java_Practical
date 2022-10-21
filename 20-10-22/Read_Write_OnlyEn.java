package practical;
//we can read only(only getter method)
//we can write only(only setter method)
public class Read_Write_OnlyEn {
	//private String name="pallabi";//private data member
	private String name;
	public void setName(String name) {
		this.name=name;
		/*public string getName()
		{
			return name
		}*/
		}
	public static void main(String args[]) {
		Read_Write_OnlyEn obj=new Read_Write_OnlyEn();
		//obj.setName("Peso");//we can't change the value of the name
		//System.out.println("Name:"+obj.getName());//we cannot get the value, there is no get method
		System.out.println(obj.name);
	}
}
