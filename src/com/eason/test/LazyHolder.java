package com.eason.test;

public class LazyHolder {
	
	private static class Holder {
		static final Object object = new Object();
	}
	
	private LazyHolder() {}
	
	public static Object getObject() {
		return Holder.object;
	}

}
