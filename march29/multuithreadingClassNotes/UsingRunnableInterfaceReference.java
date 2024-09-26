package com.march29.multuithreadingClassNotes;

public class UsingRunnableInterfaceReference
{
	public static void main(String[] args)
	{
		Runnable run = new Runnable()
		{

			@Override
			public void run()
			{
				System.out.println("threading is running");
				
				
			}
		};
		
         Thread t1 = new Thread(run);
         t1.start();
         
		
	}

}
