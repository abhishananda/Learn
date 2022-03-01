package abhi.MultiThreading;

public class MyThread implements Runnable {

	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("MyThread " + i);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println(e);
			}
		}

	}

	public static void main(String[] args) {

		MyThread t1 = new MyThread();

		Thread MyThread = new Thread(t1);

		// object of another thread

		MyAnotherThread t2 = new MyAnotherThread();

		// MyThread.start();
		// t2.start();
		System.out.println(t1.getClass().getName());

		System.out.println(MyThread.getName());
		System.out.println(t2.getName());

		System.out.println(t2.getClass().getName());

	}

}
