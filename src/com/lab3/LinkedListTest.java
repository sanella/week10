package com.lab3;

public class LinkedListTest {

	public static void main(String[] args) {
		LinkedList<Integer> ll = new LinkedList<Integer>();
		ll.add(7);
		ll.add(8);
		ll.add(45);
		ll.addAt(2, 14);
		ll.removeAt(1);
		System.out.println(ll.contains(8));
		System.out.println(ll.toString());
		
		LinkedList<String> lls = new LinkedList<String>();
		lls.add("energetika");
		lls.add("Hell");
		lls.add("Sanchopansa");
		lls.addAt(2, "minimalizam");
		lls.removeAt(1);
		System.out.println(lls.contains("U"));
		System.out.println(lls.toString());
	}

}
