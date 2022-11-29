package synchronization;

public class Deadlock {
	public static void main(String[] args) {
		final String Source1="Shifa";
		final String Source2="Nisha";
		Thread t1=new Thread() {
			public void run() {
				synchronized(Source1) {
					System.out.println("t1 lock Scource1:");
					try {
						Thread.sleep(200);
					}catch(Exception e) {
					}
					synchronized(Source2) {
						System.out.println("t2 lock Scource2:");
					}
					}
				}
		};
		Thread t2=new Thread(){
			public void run() {
				synchronized(Source2) {
					System.out.println("t1 lock Scource2:");
					try {
						Thread.sleep(200);
					}catch(Exception e) {
					}
					synchronized(Source1) {
						System.out.println("t2 lock Scource1:");
					}
					}
				}
		};
		t1.start();
		t2.start();
	}
}
