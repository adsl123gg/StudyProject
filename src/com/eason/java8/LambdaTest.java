package com.eason.java8;

import java.util.Arrays;

public class LambdaTest {

	public static void main(String[] args) {
		String b = "|";
		Arrays.asList("a","b").forEach(a -> System.out.println(a+b));
		
		System.out.println(System.getProperty("java.specification.version"));
		
		System.out.println("myJWTConfig1".compareTo("myJWTConfig"));
	}
}
