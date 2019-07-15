package com.eason.offer;

public class Node extends Object{

	int value;
	public Node left;
	public Node right;
	
	public Node(int v) {
		this.value = v;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return new Node(value);
	}
}
