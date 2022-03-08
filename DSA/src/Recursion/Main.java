package Recursion;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		message();
		
	}

	static void message() {
		System.out.println("hello world");
		message1();
	}
	static void message1() {
		System.out.println("hello world 1");
		message2();
	}
	static void message2() {
		System.out.println("hello world 2");
		message3();
	}
	static void message3() {
		System.out.println("hello world 3");
		message4();
	}
	static void message4() {
		System.out.println("hello world 4");
	}
	
}
