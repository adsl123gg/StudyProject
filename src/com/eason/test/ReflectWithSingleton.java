package com.eason.test;

public class ReflectWithSingleton implements Cloneable{
//	private static ReflectWithSingleton singleton;
	private static ReflectWithSingleton singleton = new ReflectWithSingleton();
	
	private ReflectWithSingleton() throws RuntimeException {
		if (singleton != null) {
//			System.out.println("ReflectWithSingleton exists");
			throw new RuntimeException("ReflectWithSingleton exists");
		}else {
			System.out.println("create new ReflectWithSingleton");
		}
	}
	
	private void init(String name) {
		System.out.println("init " + name);
	}
	
	public static ReflectWithSingleton get() {
//		if (singleton == null) {
//			synchronized (Singleton.class) {
//				if (singleton == null) {
//					System.out.println("construct Singleton");
//					singleton = new ReflectWithSingleton();
//				}
//			}
//		}
		return singleton;
	}
	
}
