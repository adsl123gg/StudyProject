package com.eason.test;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class Iconv {
	
	public static void main(String[] args) throws UnsupportedEncodingException {
		String string = "{";
		System.out.println(Arrays.toString(string.getBytes("278")));
		System.out.println(new String(string.getBytes("278"),"037"));
		
		String b = "hello";
		System.out.println(new String(b.getBytes("utf8"), "1047"));
	}

}
