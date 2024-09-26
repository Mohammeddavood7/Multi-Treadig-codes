package com.march29.multuithreadingClassNotes;

public class ThreadWithLambda
{
	

	public static void main(String[] args) throws InterruptedException
	{
		new Thread(()-> 
		{
			for(int i=1; i<=100; i=i+2)
			{
			String name = Thread.currentThread().getName();
				System.out.println(i+" by "+name);
			}
	
		},"Thread1").start();
	
	Thread.sleep(1000);
	System.out.println("............");
	
		new Thread(()-> 
		{
			for(int i=2; i<=100; i=i+2)
			{
			String name = Thread.currentThread().getName();
				System.out.println(i+" by "+name);
			}	
	
		},"Thread2").start();
  }
}