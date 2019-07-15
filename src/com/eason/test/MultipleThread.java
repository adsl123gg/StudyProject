package com.eason.test;

import java.util.ArrayList;

public class MultipleThread implements Runnable{

	int tickets = 100;
	Object lock = new Object();
	
	public static void main(String[] args) throws InterruptedException {
		int N = 10;
		MultipleThread multipleThread = new MultipleThread();
		Thread thread = null;
		ArrayList<Thread> lists = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			thread = new Thread(multipleThread);
			thread.setName("thread-" + i);
			lists.add(thread);
		}
		for(Thread t: lists) {
			t.start();
//			t.join();
		}
		
//		System.out.println("final");
		
	}

	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		while (true) {
			synchronized (lock) {
				try {
					if (tickets <= 0) {   
						break;
					}
					
					if (tickets <= 50 && !name.equals("thread-7")) {
						lock.wait();
					}
					
					if (tickets == 20) {
						lock.notifyAll();
					}
					
				}catch (Exception e) {
					e.printStackTrace();
				}
				
				tickets--;
				System.out.println(name +" tickets is " + tickets);
			}
			
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		System.out.println(name+" stop");
	}

}
