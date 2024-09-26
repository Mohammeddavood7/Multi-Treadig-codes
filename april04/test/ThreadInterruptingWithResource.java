package com.april04.test;

class MyClass03 implements Runnable
{

	@Override
	public void run() 
	{
		try 
		{
			while(!Thread.currentThread().isInterrupted())
			{
					Thread.sleep(500);
					System.out.println("thread invoked");
			}
		}
			
		catch (InterruptedException e) 
		{
		  System.err.println("Thread is interrupted");
		}
		finally
		{
		   System.out.println("resource is closed");
		}
			
		
		
		
		
	}
	
}

public class ThreadInterruptingWithResource
{
	public static void main(String[] args) 
	{
		MyClass03 myClass03 = new MyClass03();
		Thread thread1 = new Thread(myClass03,"child1");
		thread1.start();
		
	   try 
	   {
		 Thread.sleep(3000);
	   }
	   catch (InterruptedException e) 
	   {
		 e.printStackTrace();
	   }
	   
	   thread1.interrupt();
		
		
	}

}














































