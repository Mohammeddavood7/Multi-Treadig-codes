package com.april02.tastonmultithreadin;

class Test1 
{
    int a = 0;
	public synchronized void display()
	{
		for(int i = 1; i<=10 ;i++)
		{
			a++;
			System.out.println(a);
		}
		System.out.println("............................");
	}
	

}

public class concurrentlyTest1
{
	public static void main(String[] args)
	{
		Test1 t1 = new Test1();
		Runnable r1 = () ->
		{
		    t1.display();
		};
		
		Thread thread1 = new Thread(r1);
		Thread thread2 = new Thread(r1);
		
		thread1.start();
		thread2.start();
		
		
	}
}