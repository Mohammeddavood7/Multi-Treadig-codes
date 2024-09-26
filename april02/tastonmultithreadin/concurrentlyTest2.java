package com.april02.tastonmultithreadin;



public class concurrentlyTest2 extends Thread
{
	    int a = 0;
		 public synchronized void run()
		 {
			 for(int i = 1; i<=10 ;i++)
			 {
				 a++;
				 System.out.println(a);
				 
			 }
			 System.out.println("..........");
		 }
	
	public static void main(String[] args)
	{
		concurrentlyTest2 ct2 = new concurrentlyTest2();
		Thread thread1 = new Thread(ct2);
		Thread thread2 = new Thread(ct2);
		Thread thread3 = new Thread(ct2);
		thread1.start();
		thread2.start();
		thread3.start();
		
		
		
	}

}
