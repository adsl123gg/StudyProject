package com.eason.test;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class ChineseCharIn935 {

	public static void main(String[] args) throws UnsupportedEncodingException {
		String string = "记录成功";
		
		byte[] bs = string.getBytes("935");
		System.out.println(Arrays.toString(bs));
		System.out.println(new String(bs, "037"));
	}
}
