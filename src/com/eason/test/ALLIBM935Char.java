package com.eason.test;

import java.io.UnsupportedEncodingException;

public class ALLIBM935Char {

	public static void main(String[] args) {
		byte[] bs = new byte[1];
		
		for (int i = 0; i < 256; i++) {
			bs[0] = (byte)i;
			try {
				System.out.println(i + " == "+ new String(bs, "935"));
			} catch (UnsupportedEncodingException e) {
				System.out.println(i + " is error");
			}
		}
		
	}
}
