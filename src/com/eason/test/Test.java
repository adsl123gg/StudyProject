package com.eason.test;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import java.util.BitSet;
import java.util.HashMap;
import java.util.List;

public class Test {

	public static void main(String[] args) throws UnsupportedEncodingException {
		byte[] bs = new byte[] {123, 34, 101, 114, 114, 111, 114, 34, 58, 34, 105, 110,
				118, 97, 108, 105, 100, 95, 99, 108, 105, 101, 110, 116, 34, 125};
		String string = new String(bs);
		System.out.println(string);
		System.out.println(bs.length);
		 
		string = "dHlwZTNwcm9maWxlOnBhc3N3MHJk";
		try {
			System.out.println(decodeAndConvert(string, "869"));
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		List<String> list = Arrays.asList("a","b");
		System.out.println(list.size());
		new BigInteger("12");
		new BitSet(12);
	}
	
	private static String decodeAndConvert(String secret, String codepage) throws UnsupportedEncodingException {
        if (secret != null && secret.length() > 0) {
        	byte[] bytes = Base64.getDecoder().decode(secret.getBytes(StandardCharsets.ISO_8859_1));
//            byte[] bytes = Base64Coder.base64Decode(secret.getBytes(StandardCharsets.ISO_8859_1));
            if (bytes != null) {
                secret = new String(bytes, codepage).trim();
            } else {
               System.out.println("error");
            }

        }
        return secret;
    }
}
