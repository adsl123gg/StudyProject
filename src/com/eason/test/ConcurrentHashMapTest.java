package com.eason.test;

import java.lang.ref.WeakReference;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConcurrentHashMap<String, String> map = new ConcurrentHashMap<>();
		map.put("a", "b");
		
//		Entry<String, String> entry = null;
		WeakReference<Entry<String, String>> weakReference = null;
		for (Entry<String, String> e : map.entrySet()) {
//			entry = e;
			weakReference = new WeakReference<Entry<String,String>>(e);
		}
		
//		System.out.println(entry.getKey());
		map.remove("a");
		if (weakReference.get() != null) {
			System.out.println(weakReference.get().getKey());
		}else {
			System.out.println("gc clear");
		}
		
		
		
		System.gc();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		if (weakReference.get() != null) {
			System.out.println(weakReference.get().getKey());
		}else {
			System.out.println("gc clear");
		}
		
		String string = map.put("a", "b");
		System.out.println(string);
		string = map.remove("asdf");
		System.out.println(string);
		string = map.remove("a");
		System.out.println(string);
		
	}

}
