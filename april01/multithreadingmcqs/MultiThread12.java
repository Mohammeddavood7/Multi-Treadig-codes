package com.april01.multithreadingmcqs;

class Test222 implements Runnable
{
	public void run() {
		Thread thread = Thread.currentThread();
		Thread nit = thread.currentThread();
		System.out.println(nit.getName());
				
	}
}
public class MultiThread12
{
	public static void main(String[] args) {
		Test222 nit = new Test222();
		Thread thread = new Thread(nit);
		thread.setName("NareshIT");
		thread.start();
	}
}
