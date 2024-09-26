package com.april01.multithreadingmcqs;

public class MultiThread5 implements Runnable
{
	Thread thread;
	public MultiThread5() {
		thread = new Thread(this);
		thread.start();
	}
	public void run() {
		System.out.println(thread);
		
	}	
	public static void main(String[] args) {
		new MultiThread5();
	}
}
