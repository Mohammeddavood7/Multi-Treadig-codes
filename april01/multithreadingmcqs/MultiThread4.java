package com.april01.multithreadingmcqs;

public class MultiThread4 extends Thread
{
	public void run() {
		System.out.print(Thread.currentThread().getId()+" ");
	}
	
	@Override
	public void start() {
		System.out.print(Thread.currentThread().getName()+" ");
	}
	
	public static void main(String[] args) {
		MultiThread4 nit = new MultiThread4();
		for(int i=0;i<10;i++)
		{
			nit.start();
		}
	}
}
