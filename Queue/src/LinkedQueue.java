
public class LinkedQueue {
	int size;
	Node rear,front;
	
	public LinkedQueue() {
		
	}
	//Parameterized Constructor 
	public LinkedQueue(int size, Node rear, Node front) {
		this.size = 0;
		front=null;
		rear=null;
	}
	
	public void enqueue(int data) {
		Node newNode=new Node(data);
		
		if(isEmpty()) {
			front=newNode;
		}
		else
			rear.setNext(newNode);
		rear=newNode;
		size++;
	}

	public int dequeue() {
		if(front==null)
			System.out.println("Empty Queue");
		int result = front.data;
		front=front.next;
		size--;
		return result;
	}
	
	public int front() {
		int result=front.data;
		return result;
	}
	
	public boolean isEmpty() {
		return size==0;
	}
	
	public int size() {
		return size;
	}
	
	public String toString() {
		String result = "";
		Node current=front;
		while(current!=null) {
			result=result.toString()+"\n";
			current=current.next;
		}
		return result;
	}
	
	public void display() {
		if(isEmpty())
			System.out.println("Empty Queue");
		else {
			Node temp=front;
			while(temp!=null) {
				System.out.printf("%d->", temp.data);
				temp=temp.next;
			}
		}
		System.out.println();
	}
}
