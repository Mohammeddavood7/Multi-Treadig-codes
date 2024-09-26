package com.april01.multithreadingmcqs;

public class MultiThread7 extends Thread
{	
	public static void main(String[] args) {
		MultiThread7 m1 = new MultiThread7();
		MultiThread7 m2 = new MultiThread7();
		MultiThread7 m3 = new MultiThread7();
		m1.start();
		m2.start();
		m3.start();
	}
	
public void run() {
		System.out.println(Thread.currentThread().getName());
	}
}

