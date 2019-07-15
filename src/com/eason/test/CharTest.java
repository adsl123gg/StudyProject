package com.eason.test;

import java.util.Arrays;

public class CharTest {

	public static void main(String[] args) {
		String string = "中中";
		System.out.println(Arrays.toString(string.getBytes()));
		for (byte b : string.getBytes()) {
			System.out.println(Byte.toUnsignedInt(b));
		}
		System.out.println(string.getBytes().length);
	}
}
