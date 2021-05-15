package myList;

public class myDoublyLinkedList {
	
	static listNode head;
	
	public int size() {
		int i=0;
		listNode temp=head;
		while(temp!=null) {
			i++;
			temp=temp.next;
		}
		
		return i;
	}
	
	public boolean isEmpty() {
		if(head==null) {
			return true;
		}
		return false;
	}
	
	public boolean contains(int data) {
		listNode temp = head;
		
		while(temp!=null) {
			if(temp.data==data) return true;
			temp=temp.next;
		}
		
		return false;
	}
	
//	public void set(int index, int data) {
//		listNode toAdd = new listNode(data);
//		listNode temp=head;
//		while(--index>0)temp=temp.next;
//		listNode n = temp.next.next;
//		temp.next=toAdd;
//		toAdd.next=n;
//	}
	
	public void add(int data) {
		
		listNode toAdd = new listNode(data);
		listNode temp = head;
		toAdd.next=null;
		if(head==null) {
			toAdd.past=null;
			head=toAdd;
			return;
		}
		
		while(temp.next!=null) temp=temp.next;
		temp.next=toAdd;
		toAdd.past=temp;
	}
	
	public void clear() {
		head=null;
	}
	
	public int get(int index) {
		listNode temp = head;
		while(index-->0)temp=temp.next;
		return temp.data;
	}
	
	public void print() {
		listNode temp=head;
		while(temp!=null) {
			System.out.print(temp.data + " ");
			temp=temp.next;
		}
	}
	public void printReverse() {
		listNode temp=head,last=null;
		while(temp!=null) {
			last=temp;
			temp=temp.next;
			
		}
		while(last!=null) {
			System.out.print(last.data + " ");
			last=last.past;
		}
		
	}

}
