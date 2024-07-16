package com.javaex.ex03;

public class Ex01 {

	public static void main(String[] args) {

		// 숫자출력 출장
		// Runnable dr = new DigitRunnableImpl(); // 실행코드가 있다.

		Thread thread = new Thread(new DigitRunnableImpl());
		thread.start(); // 출장기능 있음, 해야할 일이 있다.

		// 문자출력
		for (char ch = 'A'; ch < 'Z'; ch++) {
			System.out.println(ch);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
