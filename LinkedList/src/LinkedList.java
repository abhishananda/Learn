
public class LinkedList {
	private Node head;
	private int size=0;
	
	public LinkedList() {
		 size =0;
	}
	
	public void displayListAndSize() {
		Node n;
		if(head==null) {
			System.out.println("List is Empty");
		}
		else {
			n=head;
			while(n!=null) {
				System.out.print(" "+n.getData());
				n=n.getNext();
			}
		}
		System.out.println();
		System.out.println(" Size = "+size);
	}
	
	//insert a node at Beginning of the List 
	public void insertAtBegin(int data) {
		
		Node newNode = new Node();
		
		newNode.setData(data);
		newNode.setNext(head);
		head=newNode;
		size++;
	}
	
	
	
	//insert a node node at last
	public void insertAtLast(int data) {
		
		Node newNode = new Node();
		
		newNode.setData(data);
		Node temp;
		temp=head;
		
		if(head==null)
			head=newNode;
		else {
			while(temp.getNext()!=null) {
				temp=temp.getNext();
			}
			temp.setNext(newNode);
		}
		size++;
	}
	
	//insert a node at a position 
	public void insertAtAPosition(int data, int position) {
		Node newNode = new Node();
		newNode.setData(data);
		
		if(position==1)
			insertAtBegin(data);
		
		if(position==size+1)
			insertAtLast(data);
		if(position>1&& position<=size){
			Node temp=head;
			for(int i=1;i<position-1;i++) {
				temp=temp.getNext();
			}
			newNode.setNext(temp.getNext());
			temp.setNext(newNode);
			size++;
		}
	}
	
	// delete at position
	
	public void deleteAtPosition(int posi) {
		if(posi==1)
			deleteAtFirst();
		else if(posi==size)
			deleteAtLast();
		else {
			Node temp = head;
			for(int i=1;i<posi-1;i++) {
				temp=temp.getNext();
			}
			temp.setNext(temp.getNext().getNext());
		size--;
		}
	}
	
	public void deleteAtFirst() {
		if(size==1)
			head=null;
		else
			head=head.getNext();
		size--;
	}
	
	public void deleteAtLast() {
		Node temp=head;
		for(int i = 1 ; i<size-1 ; i++) {
			temp=temp.getNext();
		}
		temp.setNext(null);
		size--;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
