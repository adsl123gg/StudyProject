package com.eason.test;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.Set;

public class GetSpecifyChatInAllCharSet {
	public static void main(String[] args) throws UnsupportedEncodingException {
		String string = "\\";
		byte[] bs ;
		
		Set<byte[]> bytes = new HashSet<>();
		Set<Integer> uniqByteValue = new HashSet<>();
		
		Set<String> names=Charset.availableCharsets().keySet();
		for (String charsetName : names) {
			try {
				bs = string.getBytes(charsetName);
				if (!uniqByteValue.contains(Byte.toUnsignedInt(bs[0]))) {
					uniqByteValue.add(Byte.toUnsignedInt(bs[0]));
					bytes.add(bs);
				}
			} catch (Exception e) {
				System.out.println("exception1");
			}
		}
		
		Set<String> correctCS = new HashSet<>();
		
		for (String charsetName : names) {
			for (byte[] bs2 : bytes) {
				try {
					if ("$".equals(new String(bs2, charsetName))) {
						System.out.println(charsetName);
						correctCS.add(charsetName);
						System.out.println(Byte.toUnsignedInt(bs2[0]) + " "+ new String(bs2, charsetName));
						System.out.println("===========");
					}
				} catch (Exception e) {
					System.out.println("exception2");
				}
			}
		}
		
//		for (String cs : correctCS) {
//			System.out.println(cs);
//		}
//		
//		for (Integer integer : uniqByteValue) {
//			System.out.println(integer);
//		}
		
	}

}
