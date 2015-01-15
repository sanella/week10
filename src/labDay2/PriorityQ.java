package labDay2;

public class PriorityQ {
	private Node head;
	private Node tail;

	// Private class for Node
	private class Node {
		public int value;
		public Node next;
		public int priority;

		public Node(int value, int priority) {
			this.value = value;
			this.priority = priority;
			next = null;
		}
	}

	// function for adding a number in Queue and sorting by priorty
	public void push(int value, int priority) {

		Node newNode = new Node(value, priority);
		//caching if stack is empty and adding first value on head
		if (head == null) {
			head = newNode;
			tail = head;
			return;

		}
		//if priorty of new number is bigger than head put
		//the number at fisrt place 
		if (newNode.priority > head.priority) {
			newNode.next = head;
			head = newNode;
			return;

		}
		//if priorty of new number is smaller than tail put
		//the number at tail
		if (newNode.priority < tail.priority) {
			tail.next = newNode;
			tail = newNode;
			return;

		}
		//if priority is somewhere in middle put the number in middle
		
		Node current = head;
		while (current.next != null) {
			if (newNode.priority > current.next.priority
			&& newNode.priority < current.priority || newNode.priority == current.priority) {
				newNode.next = current.next;
				current.next = newNode;
				return;
			}
			current = current.next;
		}

	}

	// function for removing a number from stack, FIFO method
	public int pop() {
		if (head == null)
			throw new IllegalArgumentException("Stack is empty");
		if (head == tail)
			tail = null;
		Node current = head;
		System.out.println("Pop: "+current.value+" "+current.priority);
		head = head.next;
		return current.value;

	}

	public int peek() {
		if (head == null)
			throw new IllegalArgumentException("Stack is empty");
		return head.value;
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
