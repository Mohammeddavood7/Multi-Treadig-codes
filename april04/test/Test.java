package com.april04.test;

class Myclass1 extends Thread
{
	public void run()
	{
		for(int i =1 ;i<=3; i++)
		{
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("child1");
		}
		
	}
	
}

class Myclass2 extends Thread
{
	public void run()
	{
		for(int i =1 ;i<=3; i++)
		{
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("child2");
		}
		
	}
	
}

public class Test 
{
	public static void main(String[] args)
	{
		new Myclass1().start();
		new Myclass2().start();

		
	}

}




















