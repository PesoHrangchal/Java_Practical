package thread;

public class Demonthreadeg extends Thread{
	public void run() {
		System.out.println("name:"+Thread.currentThread().getName());
		System.out.println("Demon:"+Thread.currentThread().isDaemon());
		if(Thread.currentThread().isDaemon()) {
			System.out.println("i am a demon thread");
		}else {
			System.out.println("i am user thread");
		}
	}
	public static void main(String args[]) {
		Demonthreadeg t1=new Demonthreadeg();
		Demonthreadeg t2=new Demonthreadeg();
		t1.start();
		t1.setDaemon(true);
		t2.start();
	}
}
