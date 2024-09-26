package com.april01.multithreadingmcqs;

class Test1 implements Runnable
{
	@SuppressWarnings("deprecation")
	@Override
	public void run() {
		Thread thread = Thread.currentThread();
		thread.stop();
		System.out.println(thread.getState());
	}
}
public class MultiThread10
{
	public static void main(String[] args) {
		Test1 nit = new Test1();
		nit.run();
	}
}
