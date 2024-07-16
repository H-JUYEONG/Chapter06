package com.javaex.ex04;

public class UpperImpl implements Runnable {
	
	@Override
	public void run() {
		for (double i = 0; i < 30; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
