package com.march30.multithreadinglabtask;

public class Test6 
{
	public static void main(String[] args) 
	{
		Runnable r = new Runnable() {
 public void run() {
 System.out.print("Cat");
 }
 };
 Thread t = new Thread(r) {
 public void run() {
 System.out.print("Dog");
 }
 };
 t.start();
		
	}
}
