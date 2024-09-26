package com.march30.multithreadinglabtask;

class MyThread1 extends Thread
{
	String myName;

	MyThread1(String name)
	{
		myName = name;
	}

	public void run()
	{
		for(int i=0; i<10;i++)
		{
			System.out.println(myName);
		}
	}
}
public class Test8
{
	public static void main(String args[])
	{
		try
		{
			MyThread1 mt1 = new MyThread1("mt1");
			MyThread1 mt2 = new MyThread1("mt2");
			mt1.start();
			mt1.join();
			mt2.start();
		}
		catch(InterruptedException ex)
		{
		}
	}
}
