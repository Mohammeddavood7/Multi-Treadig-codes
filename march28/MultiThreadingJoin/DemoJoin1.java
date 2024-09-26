package com.march28.MultiThreadingJoin;


class MyJoin1 extends Thread
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
public class DemoJoin1
{
	public static void main(String[] args) throws InterruptedException
	{
		System.out.println("main thread is started...");
		Thread.currentThread().getName();
		
		MyJoin1 mj1 = new MyJoin1();
		mj1.start();
		mj1.join();
		
		MyJoin1 mj2 = new MyJoin1();
		mj2.start();
		mj2.join();
		System.out.println("main thread is ended...");
	}

}
