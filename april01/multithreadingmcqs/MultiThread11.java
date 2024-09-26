package com.april01.multithreadingmcqs;

class Test22 implements Runnable
{
	public void run() {
		Thread thread = Thread.currentThread();
		Thread nit = thread.currentThread();
		System.out.println(nit.getName());		
	}
}
public class MultiThread11
{
	public static void main(String[] args) {
		Test22 nit = new Test22();
		Thread thread = new Thread(nit);
		thread.start();
	}
}
