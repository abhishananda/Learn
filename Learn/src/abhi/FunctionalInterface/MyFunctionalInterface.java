package abhi.FunctionalInterface;

public class MyFunctionalInterface {

	public static void main(String[] args) {
		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Runnable function implemented");
			}
		}).start();		
		
	}

}
