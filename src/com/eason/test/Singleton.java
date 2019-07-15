package com.eason.test;

public class Singleton {
	public static void main(String[] args) {
		System.out.println(Singleton.get());
	}
	
	private static Singleton singleton = new Singleton();
	
	private Singleton() {
	}
	
	public static Singleton get() {
//		if (singleton == null) {
//			synchronized (Singleton.class) {
//				if (singleton == null) {
//					singleton = new Singleton();
//				}
//			}
//		}
		
		return singleton;
	}
}
