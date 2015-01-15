package com.lab3;

import java.util.Iterator;

public class LinkedList<T> implements Iterable<T>{

	private Node head;

	public LinkedList() {
		head = null;
	}

	public void add(T value) {
		Node newNode = new Node(value);
		if (head == null) {
			head = newNode;
			return;
		}
		Node current = head;
		while (current.next != null) {
			current = current.next;
		}
		current.next = newNode;
	}

	public int getSize() {
		int count = 0;
		for (Node current = head; current != null; current = current.next) {
			count++;
		}
		return count;
	}

	public void removeAt(int index) {

		if (index < 0 || index >= getSize()) {
			throw new IndexOutOfBoundsException("Necu....NEMERE !!!");
		}

		if (index == 0) {
			head = head.next;
			return;
		}
		int counter = 1;
		Node current = head.next;
		Node previous = head;

		while (counter != index) {
			current = current.next;
			previous = previous.next;
			counter++;
		}

		previous.next = current.next;
		current.next = null;

	}

	public void addAt(int index, T value) {
		Node newValue = new Node(value);
		if (index < 0 || index > getSize()) {
			throw new IndexOutOfBoundsException("Index nije u fazonu !!!");
		}

		if (index == 0) {
			newValue.next = head;
			head = newValue;
			return;
		}
		if (index == getSize()) {
			add(value);
			return;
		}

		int counter = 1;
		Node previous = head;

		while (counter != index) {
			previous = previous.next;
			counter++;
		}

		newValue.next = previous.next;
		previous.next = newValue;

	}

	public boolean contains(T value) {
		Node current = head;
		while ( current != null) {
			if (current.value.equals(value))
				return true;
current = current.next;
		}
		
		return false;

	}

	
	public String toString() {
		String str = "";
		Node current = head;
		str += "[";
		while (current != null) {

			str += current.value;
			current = current.next;
			str += ", ";

		}
		str += "]";
		return str;

	}

	/**
	 * 
	 * @author sanelagrcic Privatna clasa Node
	 * @param <T>
	 */
	private class Node<T> {
		public T value;
		public Node next;

		// constructor
		public Node(T value) {

			this.value = value;
			next = null;
		}
	}

	@Override
	public Iterator<T> iterator() {
		return new Biterator<T>(head);
	
	}
	
	private class Biterator<T> implements Iterator<T>{
		private Node<T> current;
		
		public Biterator(Node start){
			current  = start;
		}
		
		
		@Override
		public boolean hasNext() {
			return current.next != null;
		}

		@Override
		public T next() {
			T valu = current.valu;
			current = current.next;
			return value;
		}
		
		
	}
}
