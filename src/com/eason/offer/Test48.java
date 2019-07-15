package com.eason.offer;

public class Test48 {
	
	public static void main(String[] args) {
		String string = "arabcacfr";
		int num = longestNoRepestStr(string);
		System.out.println(num);
	}

	private static int longestNoRepestStr(String string) {
		int max = 1;
		int nowLen = 1;
		int start = 0;
		
		for (int i = 1; i < string.length(); i++) {
			if (repeat(string.substring(start, i), string.charAt(i))) {
				start = i;
				nowLen = 1;
			} else {
				nowLen ++;
				if (nowLen > max) {
					max = nowLen;
					System.out.println(string.substring(start, start + max));
				}
			}
		}
		
		return max;
	}

	private static boolean repeat(String substring, char charAt) {
		for (int i = 0; i < substring.length(); i++) {
			if (charAt == substring.charAt(i)) {
				return true;
			}
		}
		return false;
	}

}
