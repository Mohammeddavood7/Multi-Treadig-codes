package com.april01.multithreadingmcqs;

public class MultiThread6 implements Runnable
{
	Thread thread;
	public MultiThread6() 
	{
		thread = new Thread(this,"NareshIT");
		thread.setPriority(6);
		thread.start();
	}
	
	public void run() 
	{
		System.out.println(thread);
		
	}
	
	public static void main(String[] args)
	{
		new MultiThread6();
	}
	
}
