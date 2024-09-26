package com.march28.MultiThreadingJoin;

class MyJoin extends Thread
{
	@Override
	public void run()
	{
		for(int  i = 1; i <= 5; i++)
		{
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			System.out.println("i by value: "+i);
		}
	}
}
public class DemoOnJoin
{
	public static void main(String[] args)
	{
		System.out.println("main thread is started..");
		Thread.currentThread().getName();
		
		MyJoin mj1 = new MyJoin();
		mj1.start();
		mj1.interrupt();
		MyJoin mj2 = new MyJoin();
		mj2.start();
	}

}
