package com.bridgelabz;
public interface InterNode <k> {
	 k getKey();
	    void setKey(k key);

	    InterNode getNext();
	    void setNext(InterNode next);
}

