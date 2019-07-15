package com.eason.test;

public class ThreadTest implements Runnable{

	public static void main(String[] args) {
		ThreadTest test = new ThreadTest();
		Thread one = new Thread(test);
		one.setName("thread0");
		Thread two = new Thread(test);
		two.setName("thread1");
		
		one.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		two.start();

	}

	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		if (name.contains("0")) {
			firstMethod(name);
		}else {
			secondMethod(name, true);
		}
		
	}

	private void secondMethod(String name, boolean flag) {
		while (flag) {
			System.out.println(name + "in secondMethod");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	private void firstMethod(String name) {
		while (true) {
			System.out.println(name + "in firstMethod");
			try {
				synchronized (name) {
					Thread.sleep(10000);
					secondMethod(name, false);
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
