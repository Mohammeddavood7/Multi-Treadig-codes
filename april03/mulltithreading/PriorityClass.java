package com.april03.mulltithreading;

public class PriorityClass
{
	public static void main(String[] args)
	{
		
		Thread thread = Thread.currentThread();
		System.out.println(thread.getPriority());
		
		 Thread thread1 = new Thread();
		 thread1.start();
		 System.out.println(thread1.getPriority());
		
	}

}
