package com.eason.test;

public class IntegerTest {

	public static Integer change(Integer i) {
		i = 2;
		System.out.println(i);
		return i;
	}
	
	public static void change(int i) {
		i = 30;
		System.out.println(i);
	}
	
	public static String change(String string) {
		string = "bcd";
		System.out.println(string);
		return string;
	}
	
	public static void main(String[] args) {
		Integer integer = new Integer(2) ;
//		System.out.println(integer == change(integer));
		System.out.println(integer);
		
		System.out.println("++=========");
		int i = 3;
		change(i);
		System.out.println(i);
		
		System.out.println("++=========");
		
		String string = "abc";
		change(string);
		System.out.println(string);
		
		
		String b = new String("abc");
		String c = b.intern();
		
		System.out.println(string == b.intern());
		System.out.println(string == c);
		
		System.out.println("++=========");
		
	}
	
	public static String getLineNumber() {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        if (stackTrace != null && stackTrace.length > 1) {
            return stackTrace[1].getLineNumber() + "";
        } else {
            return "no line number";
        }

    }
	
	
}
