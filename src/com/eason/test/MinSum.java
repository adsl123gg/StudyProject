package com.eason.test;

public class MinSum {

	public static void main(String[] args) {
		int[] a = new int[]{2,3,0,-2,-4,10,-12, -2};
		
		int min = a[0];
		int minHere = min;
		for (int i = 1; i < a.length; i++) {
			if (minHere > 0) {
				minHere = a[i];
			}else {
				minHere += a[i];
			}
			
			if (minHere < min) {
				min = minHere;
			}
		}
		
		System.out.println(min);
		
	}

}
