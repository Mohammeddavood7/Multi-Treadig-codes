package com.april03.mulltithreading;

public class ThreadPrior1 extends Thread
{
	
	@Override
	public void run()   
	{	
		int count = 0;
		
		for(int i=1; i<=100; i++)
		{
			System.out.println(Thread.currentThread().getName()+" : "+i);
		    count += i;	
		    
		}
		
		System.out.println("Thread name is:"+Thread.currentThread().getName());
		System.out.println();
		System.out.println("Thread priority is:"+Thread.currentThread().getPriority()+" : count :"+count);
	}	
	
	public static void main(String args[])
	{
		ThreadPrior1 m1 = new ThreadPrior1();
		ThreadPrior1 m2 = new ThreadPrior1();
		
		m1.setPriority(Thread.MIN_PRIORITY);//1
		m2.setPriority(Thread.MAX_PRIORITY);//10	
		
		m1.setName("Last");
		m2.setName("First");	
		
		m1.start();
		m2.start();
		
	}
} 











