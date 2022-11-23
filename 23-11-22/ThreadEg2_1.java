package thread;

public class ThreadEg2_1 {
	public void run() {
		System.out.println("Soumya");
	}
	public static void main(String args[]) {
		Thread t=new Thread("Pallabi");
		Thread t1=new Thread();
		t.start();
		t1.start();
		t1.setName("Anudip");
		System.out.println("Thread 0:"+t.getName());
		System.out.println("Thread 1:"+t1.getName());
	}
}
