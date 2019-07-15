package com.eason.offer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Test45 {

	public static void main(String[] args) {
		String a = "1";
		String b = "12234";
		
		ArrayList<String> list = new ArrayList<>();
		list.add("3");
//		list.add("32");
//		list.add("321");
		list.add("123");
		
		list.sort(new Comparator<String>() {
			@Override
			public int compare(String a, String b) {
				String t = a + b;
				String tt = b + a;
				if (t.compareTo(tt) > 0) {
					return 1;
				}
				
				return -1;
			}
			
		});
		
		for (String string : list) {
			System.out.println(string);
		}
	}

}
