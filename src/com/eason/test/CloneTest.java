package com.eason.test;

import com.eason.offer.Node;

public class CloneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node node = new Node(30);
		Node left = new Node(1);
		Node right = new Node(2);
		
		node.left = left;
		node.right = right;
		
		try {
			Node newNode = (Node) node.clone();
			
			System.out.println(node);
			System.out.println(newNode);
			
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
