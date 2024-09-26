package com.april01.multithreadingmcqs;

public class MultiThread2 extends Thread
{
	public void run() {
		System.out.println(Thread.currentThread().getId());
	}
	public static void main(String[] args) {
		MultiThread2 nit = new MultiThread2();
		for(int i=0;i<10;i++)
		{
			nit.start();
		}
	}
}

