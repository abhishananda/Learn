package abhi.MultiThreading;

public class ThreadOP {

	public static void main(String[] args) {
		System.out.println("Program started..");

		int x = 10 + 30;
		System.out.println("sum is " + x);

		Thread t = Thread.currentThread();
		String tname = t.getName();
		System.out.println("Current running thread : " + tname);

		t.setName("MyThread");

		System.out.println(t.getName());
		System.out.println(t.getId());

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// going to start userThread

		System.out.println("Program end..");

		UserThread user = new UserThread();
		user.start();
	}

}
