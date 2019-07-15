package com.eason.test;

public class StaticCodeSequence{
    
    static{
    	A=2;
    }
    
    public static int A=1;
    
    static class Sub extends StaticCodeSequence{
    public static int B=A;
    }
    
    public static void main(String[] args) {
		System.out.println(Sub.B);
	}
}
