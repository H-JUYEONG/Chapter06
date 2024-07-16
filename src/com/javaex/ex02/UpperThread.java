package com.javaex.ex02;

public class UpperThread extends Thread {

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
