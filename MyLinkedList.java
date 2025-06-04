//Yahia Abouelnasr 40297607


package comp352_A2;

public class MyLinkedList <E> {
	private class Node {
		E data;
		Node prev;
		Node next;
		
		Node(E data) {
			this.data = data;
		}
		
	}
	
	private Node head;
	private Node tail;
	private int size;
	
	public MyLinkedList() {
		head = null;
		tail = null;
		size = 0;
	}
	
	public boolean add(E e) {
		Node newNode = new Node(e);
		if (tail == null) {
			head = tail = newNode;
		}
		else {
			tail.next = newNode;
			newNode.prev = tail;
			tail = newNode;
		}
		size++;
		return true;
	}
	
	
	public void add(int index, E element) {
		if (index < 0 || index > size) throw new IndexOutOfBoundsException();
		Node newNode = new Node(element);
		if (index == 0) {
			newNode.next = head;
			if (head != null) {
				head.prev = newNode;
			}
			head = newNode;
			if (tail == null ) {
				tail = newNode;
			}
			
		}
		else if (index == size ) {
			add(element);
			return;
		}
		else {
			Node current = getNode(index);
			newNode.next = current;
			newNode.prev = current.prev;
			current.prev.next = newNode;
			current.prev = newNode;
		}
		size++;
		
	}
	
	public void clear() {
		head = tail = null;
		size = 0;
	}
	
	public E remove(int index) {
		if (index < 0 || index >= size) throw new IndexOutOfBoundsException();
		Node current = getNode(index);
		 if (current.prev != null) {
			 current.prev.next = current.next;
		 }
	     if (current.next != null) {
	        current.next.prev = current.prev;
	     }
	     if (index == 0) {
	        head = current.next;
	     }
	     if (index == size - 1) {
	        tail = current.prev;
	      }
	     size--;
	     return current.data;			
		}
	
	public boolean remove(Object o) {
		Node current = head;
		if (o == null) {
			return false;
		}
		while (current != null) {
			if (current.data.equals(o)) {
				removeNode(current);
				return true;
			}
			current = current.next;
		}
		return false;
	}
	
	public void removeNode(Node node) {
		if (node.prev != null) {
			node.prev.next = node.next;
		}
		if (node.next != null) {
			node.next.prev = node.prev;
		}
		if (node == head) {
			head = node.next;
		}
		if (node == tail) {
			tail = node.prev;
		}
		size--;
		
	}
	
	public Node getNode(int index) {
		if (index < 0 || index >= size) throw new IndexOutOfBoundsException();
		Node current;
		
		if (index < size /2) {
			current = head;
			for (int i = 0; i < index; i++) {
				current = current.next;
			}
		}
		else {
			current = tail;
			for (int i = size -1; i > index; i--) {
				current = current.prev;
			}
		}
		return current;
		
	}
	
	public int size() {
		return size;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder("[");
		Node current = head;
		while (current != null) {
			sb.append(current.data);
			if (current.next != null) {
				sb.append( ", ");
			}
			current = current.next;
		}
		sb.append("]");
		return sb.toString();
	}
	
	
	
	}
	
	
	