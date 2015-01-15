package labDay1;

import javax.xml.soap.Node;

public class QueueInt {

	private Node head;
	private Node tail;

	// Private class for Node
	public class Node {
		public int value;
		public Node next;

		public Node(int value) {
			this.value = value;
			next = null;
		}
	}

	// function for adding a number in Queue
	public void push(int value) {
		if (head == null) {
			head = new Node(value);
			tail = head;
			return;
		}
		Node newNode = new Node(value);

		tail.next = newNode;
		tail = newNode;
	}

	// function for removing a number from stack, FIFO method
	public int pop() {
		if (head == null)
			throw new IllegalArgumentException("Stacki is empty");
		if(head == tail)
			tail = null;
		Node current = head;
		head = head.next;
		return current.value;

	}

	public int peek(){
		if(head==null)
			throw new IllegalArgumentException("Steac is empty") ;
		return tail.value;
	}
	
	
	// get size of stack
	public int getSize() {
		if (head == null)
			return 0;
		return getSize(head, 0);
	}

	// getSize recursion
	private int getSize(Node current, int counter) {
		if (current == null)
			return counter;
		return getSize(current.next, counter + 1);
	}

	// for caching is this value in stack
	public boolean contains(int value) {
		if (head.value == value)
			return true;
		return contains(head, value);
	}

	// recursion for contains methode
	public boolean contains(Node current, int value) {
		if (current == null)
			return false;
		if (current.value == value)
			return true;
		return contains(current.next, value);

	}
}
