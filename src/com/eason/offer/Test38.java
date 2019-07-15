package com.eason.offer;

import java.util.ArrayList;

public class Test38 {

	public static void main(String[] args) {
		String string = "abc";
		
		for (String s : get(string)) {
			System.out.println(s);
		}
	}
	
	private static ArrayList<String> get(String tmp) {
		ArrayList<String> list = new ArrayList<>();
		
		if (tmp.length() > 2) {
			for (int i = 0; i < tmp.length(); i++) {
				StringBuffer sbBuffer = new StringBuffer(tmp);
				String tt = sbBuffer.replace(i, i+1, "").toString();
				ArrayList<String> ll = get(tt);
				
				for (String s : ll) {
					list.add(tmp.charAt(i)+s);
				}
				
			}
		}else {
			list.add(tmp);
			list.add(tmp.charAt(1)+""+tmp.charAt(0));
		}
		return list;
	}

}