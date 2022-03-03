package com.blz;

public class LinkedListMain {

	public static void main(String[] args) {
		System.out.println("Welcome To Linked list !!!!");
		LinkedList1 linkedList = new LinkedList1();
		linkedList.addLast(56);
		linkedList.addLast(30);
		linkedList.addLast(40);
		linkedList.addLast(70);
		linkedList.display();
		linkedList.getSize();
		linkedList.deleteElement(40);
		linkedList.display();
		linkedList.getSize();

	}
}
