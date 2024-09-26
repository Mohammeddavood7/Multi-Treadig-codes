package com.april01.multithreadingmcqs;

public class MutliThread8 extends Thread
{	
	public static void main(String[] args) {
		MutliThread8 m1 = new MutliThread8();
		MutliThread8 m2 = new MutliThread8();
		MutliThread8 m3 = new MutliThread8();
		m1.start();
		m2.start();
		m3.start();
		
		for(int i=0;i<5;i++) 
		{
			m2.yield();
			System.out.println(Thread.currentThread().getName());
		}
	}
public void run() {
		System.out.println(Thread.currentThread().getName());
	}
}
