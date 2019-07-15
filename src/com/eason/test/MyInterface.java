package com.eason.test;

public interface MyInterface {

	default void add() {
		System.out.println("add");
	}
	
	static void getPoint() {
		System.out.println("getPoint");
	}
}
