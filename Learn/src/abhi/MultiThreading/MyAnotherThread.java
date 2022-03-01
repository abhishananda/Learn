package abhi.MultiThreading;

public class MyAnotherThread extends Thread {

	public void run() {

		for (int i = 10; i >= 1; i--) {
			System.out.println("MyAnotherThread " + i);

			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println(e);
			}
		}

	}

	public static void main(String[] args) {

		MyAnotherThread anotherThread = new MyAnotherThread();

		anotherThread.start();

	}

}
