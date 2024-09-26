package com.march28.MultiThreadingJoin;

public class DemoDeadLock
{
	public static void main(String[] args) throws InterruptedException
	{
		
		System.out.println("main thread is started..");
		
		for(int i = 1; i <= 5; i++)
		{
			System.out.println("i values is: "+i);
			Thread.currentThread().join();
		}
		
		System.out.println("main thread is ended...");
		
	}

}
