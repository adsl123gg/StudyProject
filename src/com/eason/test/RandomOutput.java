package com.eason.test;

import java.util.Random;

public class RandomOutput {

	
	public static void main(String[] args) {
		for (int i = 0; i < 20; i++) {
			new RandomOutput().randomOutput();
			System.out.println();
		}
	}
	
	public void randomOutput() {
		//random output 0~30
		int N = 30;
		Random random = new Random();
		//split the N to left and right part
		int start = random.nextInt(N);
		//ensure start isn't 0
		while (start == 0) {
			start = random.nextInt(N);
		}
		
		//determine print left part or right part first, 0 is print left first, 1 is print right first
		int leftOrRight = random.nextInt(2);
		//determine print left and right part order, 0 is sequential output, 1 is inverse Sequence Output
		int order = random.nextInt(2);
		if (leftOrRight == 0) {
			if (order == 0) {
				printLeftInOrder(start);
				printRightInOrder(N, start);
			}else {
				printLeftInReverseOrder(start);
				printRightInReverseOrder(N, start);
			}
		}else {
			if (order == 0) {
				printRightInOrder(N, start);
				printLeftInOrder(start);
			}else {
				printRightInReverseOrder(N, start);
				printLeftInReverseOrder(start);
			}
		}
	}

	private void printRightInReverseOrder(int N, int start) {
		for (int i = N; i >= start; i--) {
			System.out.print(i);
			System.out.print(" ");
		}
	}

	private void printLeftInReverseOrder(int start) {
		for (int i = start -1; i >= 0; i--) {
			System.out.print(i);
			System.out.print(" ");
		}
	}

	private void printRightInOrder(int N, int start) {
		for (int i = start; i <= N; i++) {
			System.out.print(i);
			System.out.print(" ");
		}
	}

	private void printLeftInOrder(int start) {
		for (int i = 0; i < start; i++) {
			System.out.print(i);
			System.out.print(" ");
		}
	}

}
