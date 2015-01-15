package labDay1;

import javax.xml.soap.Node;

public class StackInt {
	private Node head;
	
	//Constructor
	public StackInt(){
		head =null;
	}
	
	// Private class for Node
	private class Node{
		public int value;
		public Node next;
		
		public Node(int value){
			this.value = value;
			next = null;
		}
	}

	// function for adding a number in stack
	public void push(int value){
		Node newNode=new Node(value);
		newNode.next = head;
		head = newNode;
	}
	
	// function for removing a number from stack, LIFO method 
	public int pop(){
		if(head==null)
			throw new IllegalArgumentException("Steac is empty") ;
		Node current = head;
		head = head.next;
		int value=current.value;
		current = null;
		return value;
	}
	
	public int peek(){
		if(head==null)
			throw new IllegalArgumentException("Steac is empty") ;
		return head.value;
	}
	// get size of stack
	public int getSize(){
		if(head == null)
			return 0;
		return getSize(head, 0);
	}
	// getSize recursion
	private int getSize(Node current, int counter){
		if(current == null)
			return counter;
		return getSize(current.next, counter +1);
	}
	
	// for caching is this value in stack
	public boolean contains(int value){
		if( head.value == value)
			return true;
			return contains(head, value);
	}
	
	// recursion for contains methode
	public boolean contains(Node current, int value){
		if(current == null)
			return false;
		if(current.value == value)
			return true;
		return contains(current.next, value);
		
	}

//	@Override
//	public String toString() {
//		Node current = head;
//		String str = "{"; 
//		for(int i = 0; i<getSize(); i++){
//			str += current.value;
//			head = head.next;
//		}
//	
//		return str;
//	}
	
	
}
