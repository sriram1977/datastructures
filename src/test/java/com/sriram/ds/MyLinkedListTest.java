package com.sriram.ds;

import junit.framework.TestCase;

public class MyLinkedListTest extends TestCase {

	public MyLinkedListTest(String name) {
		super( name );
	}

	public void testMain() throws Exception {
		MyLinkedList.main(null);
	}	
	
	public void testaddFirst() throws Exception {
		MyLinkedList lList = new MyLinkedList();
		assertEquals(0, lList.size());
		lList.addFirst("Sriram");
		assertEquals(1, lList.size());
		lList.addFirst("Savitha");
		assertEquals(2, lList.size());
		//lList.get(0);
	}
	
	public void testaddLast() throws Exception {
		MyLinkedList lList = new MyLinkedList();
		assertEquals(0, lList.size());
		lList.addLast("Sriram");
		assertEquals(1, lList.size());
		lList.addLast("Sriram");
		assertEquals(2, lList.size());
	}
	
	public void testPrint() throws Exception {
		MyLinkedList lList = new MyLinkedList();
		lList.printList();
		lList.printReverseList();
		lList.addLast("Isha");
		lList.addFirst("Savitha");
		lList.printList();
		lList.printReverseList();
	}
	
	public void testadd() throws Exception {
		MyLinkedList lList = new MyLinkedList();
		assertEquals(0, lList.size());
		lList.add("Sriram");
		assertEquals(1, lList.size());
		lList.add("Sriram");
		assertEquals(2, lList.size());
		lList.addFirst("Sriram");
		assertEquals(3, lList.size());
		lList.addLast("Sriram");
		assertEquals(4, lList.size());
	}

}
