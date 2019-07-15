package com.eason.offer;

import java.util.ArrayList;

public class Test7 {

	public static void main(String[] args) {
		int[] preO = new int[]{1,2,4,7,3,5,6,8};
		int[] inO = new int[]{4,7,2,1,5,3,8,6};
		
		ArrayList<Integer> preList = new ArrayList<>();
		ArrayList<Integer> inList = new ArrayList<>();
		
		for (int i = 0; i < preO.length; i++) {
			preList.add(preO[i]);
		}
		
		int rootV = preList.get(0);
		int index = inList.indexOf(rootV);
		
		int left = build(preList, 1, 0+index, inList, 0, index-1);
	}

	private static int build(ArrayList<Integer> preList, int i, int j, ArrayList<Integer> inList, int k, int l) {
		
		return 0;
	}

	
	
}
