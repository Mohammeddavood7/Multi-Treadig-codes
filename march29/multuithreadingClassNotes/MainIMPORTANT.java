package com.march29.multuithreadingClassNotes;


//Extending Thread class
class Demo extends Thread 
{
	 public void run() 
	 {
	     System.out.println("Inside Demo Thread");
	 }
}

//Implementing Runnable interface
class Test implements Runnable 
{
	 public void run()
	 {
	     System.out.println("Inside Test Thread");
	 }
}

//Extending a class and implementing interfaces
class MyClass extends Demo implements Runnable 
{
	@Override
	 public void run()
	 {
	     System.out.println("Inside MyClass Thread");
	 }
}

public class MainIMPORTANT
{
	 public static void main(String[] args)
	 {
	     Demo demo = new Demo();
	     Test test = new Test();
	     MyClass myClass = new MyClass();
	
	     demo.start(); // starts a new thread from Demo class
	     new Thread(test).start(); // starts a new thread from Test class
	     myClass.start(); // starts a new thread from MyClass class
	 }
}




