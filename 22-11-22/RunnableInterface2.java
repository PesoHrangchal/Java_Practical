package thread;
//Thread(Runnable obj, String name)
public class RunnableInterfaceEg2 implements Runnable{
	public void run() {
		System.out.println("Thread running");
	}
	public static void main(String args[]) {
		Runnable r1=new RunnableInterfaceEg2();
		Thread t=new Thread(r1,"String Name");
		t.start();
		String s=t.getName();
		System.out.println(s);
	}
}
