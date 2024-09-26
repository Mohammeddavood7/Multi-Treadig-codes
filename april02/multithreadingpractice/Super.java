package com.april02.multithreadingpractice;

class Parent
{
	public void m1()
	{
		System.out.println("m1()");
	}

}

class Child extends Parent
{
	@Override
	public void m1()
	{
		System.out.println("child");
	}
}

public class Super
{
	public static void main(String[] args)
	{
		Child c = new Child();
		c.m1();
	
	}
}

















