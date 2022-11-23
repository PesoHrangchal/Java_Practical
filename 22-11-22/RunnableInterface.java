package thread;

public class RunnableInterface implements Runnable{
	public void run() {
		System.out.println("I am Thread....thread is running");
	}
	public static void main(String[] args) {
		RunnableInterface r= new RunnableInterface();
		Thread t=new Thread(r);
		t.start();
	}
}
