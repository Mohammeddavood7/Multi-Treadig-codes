package com.march29.multuithreadingClassNotes;

public class UsingRunnableInterfaceWithLAMBDA 
{
	public static void main(String[] args)
	{
		Thread thread = new Thread(() -> 
		{
			Thread t1 = Thread.currentThread();
			t1.setName("Child-01");
			for(int i = 1 ;i<=2;i++)
			{
			   System.out.println("thread name : "+t1.getName());
			}
	
	     }
		);
		thread.start();
		
	}

}
