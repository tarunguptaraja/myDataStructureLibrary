package myList;


public class myLinkedList {
	
	static listNode head;
	
	public int size() {
		int i=0;
		listNode temp=head;
		while(temp!=null) {
			temp=temp.next;
			i++;
		}
		return i;
	}
	
	
	public boolean isEmpty() {
		if(head==null)return true;
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
	
	
	public void add(int data) {
		listNode toAdd = new listNode(data);
		
		if(head==null) {
			head=toAdd;
			return;
		}
		
		listNode temp = head;
		while(temp.next!=null)temp=temp.next;
		
		temp.next=toAdd;
	}
	
	public void clear() {
		head=null;
	}
	
	public int get(int index) {
		listNode temp = head;
		while(index-->0)temp=temp.next;
		return temp.data;
	}
	
	public void set(int index, int data) {
		listNode toAdd = new listNode(data);
		listNode temp=head;
		while(--index>0)temp=temp.next;
		listNode n = temp.next.next;
		temp.next=toAdd;
		toAdd.next=n;
	}
	
	public void add(int position, int data) {
		listNode toAdd = new listNode(data);
		listNode temp=head;
		while(--position>0)temp=temp.next;
		listNode n = temp.next;
		temp.next=toAdd;
		toAdd.next=n;
	}
	
	public void remove(int index) {
		listNode temp=head;
		while(--index>0)temp=temp.next;
		temp.next=temp.next.next;
	}
	
	public int indexOf(int data) {
		int i=0;
		listNode temp = head;
		
		while(temp!=null) {
			if(temp.data==data)return i;
			i++;
			temp=temp.next;
		}
		return -1;
	}
	
	
	public void print() {
		listNode temp = head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		
	}
	
	public void reverse() {
		listNode temp = head,past=null,next=null;
		
		while(temp!=null) {
			next=temp.next;
			temp.next=past;
			past=temp;
			temp=next;
		}
		head=past;
	}	
}
