package com.march30.multithreadinglabtask;

class MyThread2 implements Runnable
{
	String str;
	MyThread2(String str)
	{
		this.str=str;
	}
	public void run()
	{
		for(int i=1; i<=10; i++)
		{
			System.out.println(str+ " : "+i);
			try
			{
				Thread.sleep(100);
			}
			catch (Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}
public class Test9
{
	public static void main(String [] args)
	{
	MyThread2 obj1 = new MyThread2("Cut the Ticket");
	MyThread2 obj2 = new MyThread2(" Show the Seat");

		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);

		t1.start();
		t2.start();

	}
}
