package com.bridgelabz;

public class MyLinkedList <k> implements  InterNode<k> {
	 private k key;
	    private InterNode<k> next;

	    public MyLinkedList(k key) {
	        this.key =key;
	        this.next=null;
	    }

	    @Override
	    public k getKey() {
	        return key;
	    }

	    @Override
	    public void setKey(k key) {
	        this.key=key;
	    }

	    public InterNode <k> getNext() {
	        return next;
	    }

	    @Override
	    public void setNext(InterNode next) {
	        this.next=(MyLinkedList <k>) next;
	    }
	

}
