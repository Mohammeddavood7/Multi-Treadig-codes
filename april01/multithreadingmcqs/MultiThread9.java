package com.april01.multithreadingmcqs;

class Test111 implements Runnable
{
	@Override
	public void run() {
		Thread thread = Thread.currentThread();
		System.out.println(thread.getState());
	}
}
public class MultiThread9
{
	public static void main(String[] args) {
		Test111 nit = new Test111();
		nit.run();
	}
}
