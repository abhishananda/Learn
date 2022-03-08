
public class Test {

	public static void main(String[] args) {
		LinkedStack list = new LinkedStack();
		list.push(10);
		list.push(20);
		list.push(30);
		list.push(40);
		list.push(50);
		list.push(70);
		list.display();
		System.out.println(list.pop());
		//System.out.println();

		list.display();
		
//		list.push(60);
//		System.out.println();
//		list.display();
	}

}
