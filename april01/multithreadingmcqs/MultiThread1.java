package com.april01.multithreadingmcqs;

class Test extends Thread
{
	int a;
	@Override
	public void run() 
	{
		a++;
	}
}
public class MultiThread1
{
	public static void main(String[] args) 
	{
		Test test = new Test();
		test.run();
		
		System.out.println(test.a); //1
		test.start();
		
		System.out.println(test.a); //1
		System.out.println(test.isAlive()); //true
		System.out.println(test.getName());	//thread-0	
	}
}
