package com.eason.test;

public class ArrayTest {

    public static void main(String[] args){  
        Const[] con = new Const[5];  
        for(Const a:con) {
            a = new Const();  
        }
        
        String aString = "hello";
        String bString = "hello";
        System.out.println(aString == bString);
        
    }  

}
