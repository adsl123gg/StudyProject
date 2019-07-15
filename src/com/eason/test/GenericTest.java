package com.eason.test;

import java.util.HashMap;
import java.util.Map;

public class GenericTest<T> {

	public static void main(String[] args) {
		GenericTest<String> genericString = new GenericTest<>();
		
		genericString.echoType("12");
		genericString.echoType(12);
		
		genericString.toStr("12");
//		genericString.toStr(12);
		
	}
	
	//泛型方法
	public <T> void echoType(T t) {
		System.out.println(t.getClass());
	}
	
	//非泛型方法
	public void toStr(T t) {
		System.out.println(t.toString());
	}
	
	private Map<Class<?>, Object> map = new HashMap<>();
	public <T> void putToMap(Class<T> type, T instanse) {
		map.put(type, type.cast(instanse));
	}	
}
