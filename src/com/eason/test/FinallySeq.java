package com.eason.test;

public class FinallySeq {

	public static void main(String[] args) {
		new FinallySeq().change(3);
	}
	
	public int change(int i) {
		try {
			i++;
			System.out.println("change func, i is "+i);
			throw new Exception();
		} catch (Exception e) {
			System.out.println("Exception occured");
		} finally {
			System.out.println("finally");
		}
		
		System.out.println("return i");
		return i;
	}
}
