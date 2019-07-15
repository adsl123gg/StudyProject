package com.eason.offer;

public class Test46 {
	
	public static void main(String[] args) {
		String string = "12258";
		
		int num = calFromTop(string);
		System.out.println(num);
		
		num  = calFromBot(string);
		System.out.println(num);
	}
	
	private static int calFromBot(String string) {
		if (string == null || string.length() == 0) {
			return 0;
		}
		if (string.length() ==1 ) {
			return 1;
		}
		
		int a = 1; 
		int b = 1;
		int t = 0;
		String tmp = string.substring(string.length() -2);
		if (tmp.compareTo("26") < 0) {
			a = 2;
		}
		
		if (string.length() == 2) {
			return a;
		}
		
		for (int i = string.length() - 3; i >=0; i--) {
			if (string.substring(i, i+2).compareTo("26") < 0) {
				t = a;
				a = a + b;
				b = t;
			} else {
				b = a;
			}
		}
		
		return a;
	}

	private static int calFromTop(String string) {
		if (string.length() == 2) {
			if (string.compareTo("26") < 0) {
				return 2;
			}else {
				return 1;
			}
		} else if (string.length() ==1) {
			return 1;
		} else {
			String tmp = string.substring(0, 2);
			if (tmp.compareTo("26") < 0) {
				return calFromTop(string.substring(1)) + calFromTop(string.substring(2));
			}else {
				return calFromTop(string.substring(1));
			}
			
		}
	}

}
