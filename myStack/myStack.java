package myStack;

import myList.myLinkedList;

public class myStack {
	
	private myLinkedList ll = new myLinkedList();
	
	public void push (int e) {
		ll.add(e);
	}
	
	public int pop() throws Exception  {
		if(ll.isEmpty()) {
			throw new Exception ("Poping from empty Stack is not allowed");
		}
		int x = ll.get(ll.size()-1);
		return x;
	}
	
	public int peek() {
		return ll.get(ll.size()-1);
	}

}
