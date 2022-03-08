
public class Test {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		
		list.insertAtBegin(100);
		list.insertAtLast(101);
		list.insertAtBegin(102);
		list.insertAtLast(103);
		list.insertAtAPosition(111, 3);
		list.displayListAndSize(); // 102 100 101 103 
		list.deleteAtPosition(2);
		list.displayListAndSize();
	}

}
