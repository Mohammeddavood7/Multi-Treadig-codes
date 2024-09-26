package com.march27.multithreadingg;

public class ThreadUsingLambda
{
	public static void main(String[] args) 
	{
		Thread t1 = new Thread(() -> {String name = Thread.currentThread().getName(); System.out.println(name);});
		t1.setName("child1");
		t1.run();
		
		
		
	}

}
