package com.april01.multithreadingmcqs;

public class MultiThread3 extends Thread
{
	public void run() {
		System.out.print(Thread.currentThread().getId()+" ");
	}
	public static void main(String[] args) {
		for(int i=0;i<10;i++)
		{
			MultiThread3 nit = new MultiThread3();
			nit.start();
		}
	}
}

