package com.eason.test;

import java.lang.ref.WeakReference;

public class WeakRefer {

	public static void main(String[] args) {
		String string = new String("abc");
		WeakReference<String> reference = new WeakReference<String>(string);
		
		System.out.println(reference.get());
		
		string = null;
		
		System.gc();
		
		System.out.println(reference.get());
	}
	
}
