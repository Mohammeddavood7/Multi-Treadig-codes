package com.april02.tastonmultithreadin;


class Test3
{
	static int a=0;
	public synchronized void display1(int value)
	{
		for(;a<value;)
		System.out.println(++a+" "+Thread.currentThread().getName());
	}
}

public class concurrentlyTest3
{
	public static void main(String[] args) throws InterruptedException 
	{
		Test3 t1 = new Test3();
		Runnable r1  = () ->
		{
			t1.display1(100);
		};
		
		Thread th1 = new Thread(r1,"child1");
		th1.start();
		
		Thread th2 = new Thread(r1,"child2");
		th2.start();
		
	}

}
