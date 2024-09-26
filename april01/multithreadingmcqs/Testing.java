package com.april01.multithreadingmcqs;

class Test2 extends Thread
{
	@Override
	public void run()
    {
		System.out.println("Run");
		super.run();
	}
	
	@Override
	public synchronized void start() 
    {
		System.out.println("Start");
		super.start();
	}
	
}
public class Testing
{
	public static void main(String[] args)
	{
		nit();
	}
	
	static public void nit() 
	{
		Test2 test = new Test2();
		test.start();
	}
}
































































