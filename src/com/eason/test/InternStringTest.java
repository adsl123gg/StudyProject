package com.eason.test;

public class InternStringTest {

	public static void main(String[] args) {

		String s1 = "hello";
		String s2 = "hello";
		System.out.println(s1== s2);
		
		String s3 = new String("hello");
		System.out.println(s3 ==s2);
		String s4 = s1.intern();
		System.out.println(s4 == s2);
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		 
	}

}
