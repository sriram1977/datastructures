package com.sriram.ds;

public class MyLinkedList implements Cloneable, java.io.Serializable{

	private static final long serialVersionUID = 1L;

	private transient int size = 0;
	private transient MyNode<String> first;
	private transient MyNode<String> last;

	public int size() {
		return size;
	}
	
	private void linkFirst(String e) {
		MyNode<String> f = first;
		first = new MyNode<String>(null,e,f);
		if(f==null) {
			last=first;
		}else {
			f.prev=first;
		}
		size++;		
	}
	
	public void printList() {
		MyNode<String> current=first;
		System.out.println("");
		System.out.print("null");
		for(int i=0;i<size;i++) {
			System.out.print("->");
			System.out.print(current.item);
			current=current.next;
		}
		if(size>0)
			System.out.print("->null");
	}
	
	public void printReverseList() {
		MyNode<String> current=last;
		System.out.println("");
		System.out.print("null");
		for(int i=0;i<size;i++) {
			System.out.print("->");
			System.out.print(current.item);
			current=current.prev;
		}
		if(size>0)
			System.out.print("->null");
	}


	private void linkLast(String e) {
		MyNode<String> l = last;
		last = new MyNode<String>(last,e,null);
		if(l==null) {
			first=last;
		}else {
			l.next=last;
		}
		size++;		
	}
	
	public void addFirst(String e) {
		linkFirst(e);
	}

	public void addLast(String e) {
		linkLast(e);
	}
	
	public boolean add(String e) {
		addLast(e);
		return true;
	}
	
	public String get(int index) {
		return null;
	}


	private static class MyNode<String> {
		private String item;
		private MyNode<String> next;
		private MyNode<String> prev;

		MyNode(MyNode<String> prev, String element, MyNode<String> next) {
            this.item = element;
            this.next = next;
            this.prev = prev;
        }
    }
	
	
	public static void main(String argv[]) {
		MyLinkedList lList = new MyLinkedList();
		lList.printList();
		lList.addFirst("Sriram");
		lList.addFirst("Savitha");
		lList.addLast("Isha");
		lList.addFirst("Kalyani");
		lList.printList();
		lList.printReverseList();
	}
}
