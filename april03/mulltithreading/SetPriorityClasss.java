package com.april03.mulltithreading;

class Myclass extends Thread
{
	@Override
	public void run()
	{
		Thread thread = Thread.currentThread();
		System.out.println(thread.getName()+" : "+thread.getPriority());
	}
}

public class SetPriorityClasss 
{
	@SuppressWarnings("static-access")
	public static void main(String[] args)
	{
		Thread thread = Thread.currentThread();
		thread.setPriority(10);
		System.out.println(thread.getName()+" : "+thread.getPriority());
		
		Myclass myclass = new Myclass();
		myclass.setName("child-01");
		myclass.start();
		
		System.out.println(myclass.MIN_PRIORITY +" : " +myclass.NORM_PRIORITY +" : "+myclass.MAX_PRIORITY  );
		System.out.println(myclass.MIN_PRIORITY +myclass.NORM_PRIORITY +myclass.MAX_PRIORITY  );

		
	}

}
