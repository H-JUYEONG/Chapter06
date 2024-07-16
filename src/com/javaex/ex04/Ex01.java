package com.javaex.ex04;

public class Ex01 {

	public static void main(String[] args) {
		
		/*
		Runnable rAble01 = new DigitRunnableImpl();
		Runnable rAble02 = new DigitRunnableImpl();
		Runnable rAble03 = new DigitRunnableImpl();
		
		Thread t01 = new Thread(rAble01);
		Thread t02 = new Thread(rAble02);
		Thread t03 = new Thread(rAble03);
		
		t01.start();
		t02.start();
		t03.start();
		*/
		
		Thread thread1 = new Thread(new DigitRunnableImpl());
		Thread thread2 = new Thread(new LowerRunnableImpl());
		Thread thread3 = new Thread(new UpperRunnableImpl());
		
		thread1.start();
		thread2.start();
		thread3.start();

	}

}
