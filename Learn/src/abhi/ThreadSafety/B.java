package abhi.ThreadSafety;

public class B extends Thread {
	A a = new A();
	public void run() {
		a.sum(10);
	}

}
