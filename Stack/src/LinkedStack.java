//import java.util.EmptyStackException;
import static java.lang.System.exit;

import java.util.EmptyStackException;

public class LinkedStack {
	int size;
	Node top;
		
	public LinkedStack() {
		super();
		this.size = 0;
		this.top = null;
	}
	
	public void push(int data) {
		Node temp = new Node(data);
		temp.next=top;
		top=temp;
		size++;
	}
	
	public int pop() {
		if(top==null)
			throw new EmptyStackException();
		int result = top.data;
		top=top.next;
		size--;
		return result;
	}
	public int peek() {
		if(!isEmptyStack()) {
			System.out.println(" peek : "+top.data);
			return 1;
		}
		else {
			System.out.println("Stack is empty.");
			return -1;
		}
	}

	public boolean isEmptyStack() {
		return top == null;
	}
	
	public void display() {
		if(top==null) {
			System.out.println("\nStack underflow");
			exit(1);
		}
		else {
			Node temp=top;
			while(temp!=null) {
				System.out.printf("%d->", temp.data);
				temp=temp.next;
			}
			System.out.println("Size = "+size);
		}
		//System.out.println("Size = "+size);
	}
}
