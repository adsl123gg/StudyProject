package com.eason.test;

import java.util.ArrayList;
import java.util.List;

public class ThreadLocalTest implements Runnable {
	
	int num = 100;

	ThreadLocal<String> threadLocal = new ThreadLocal<>();
	public static void main(String[] args) {
		int N = 10;
		
		List<Thread> list = new ArrayList<>();
		ThreadLocalTest test = new ThreadLocalTest();
		for (int i = 0; i < N; i++) {
			Thread thread = new Thread(test);
			list.add(thread);
		}
		
		
		for (Thread thread : list) {
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
			thread.setName(list.indexOf(thread)+"-thread");
			thread.start();
		}
	}

	@Override
	public void run() {
		threadLocal.set(System.currentTimeMillis()+" "+Thread.currentThread().getName());
		System.out.println(threadLocal.get());
		while (true) {
			if (num <= 0) {
				break;
			}
			
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			num --;
			System.out.println(Thread.currentThread().getName() + " num is: " + num);
			
		}
	}
	
}
