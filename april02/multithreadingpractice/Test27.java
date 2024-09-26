package com.april02.multithreadingpractice;

//public class MultiThread implements Runnable
//{
//
//	public static void main(String[] args) throws InterruptedException 
//        {
//		Thread thread = new Thread(new MultiThread());
//		thread.start();   
//		System.out.println("nit ");
//		thread.join(); 
//		System.out.println("google ");
//	}
//
//	@Override
//	public void run() 
//        {
//		System.out.println("NareshIT");
//	}
//}




//class Test11 extends Thread
//{
//	@Override
//	public void run()
//        {
//		System.out.println("Run");
//		super.run();
//	}
//	@Override
//	public synchronized void start() 
//        {
//		System.out.println("Start");
//		super.start();
//	}	
//}
//public class MultiThread
//{
//	public static void main(String[] args) {
//		nit();
//	}
//	
//	static public void nit() 
//       {
//		Test11 test = new Test11();
//		test.start();
//	}
//}


//class Test extends Thread
//{
//	int a;
//	public void run() {
//		a++;
//	}
//}
//public class MultiThread
//{
//	public static void main(String[] args)
//	{
//		//1000x
//		Test test1 = new Test();
//		test1.run();
//		test1.start();  //Thread - 0
//		
//		//2000x
//		Test test2 = new Test();
//		
//		test2.start(); //Thread - 1
//		System.out.println();
//		
//		
//		
//		
//		System.out.println(test1.a);  
//		System.out.println(test1.getName());		
//		
//		System.out.println(test1.a);  
//		System.out.println(test1.isAlive());
//		System.out.println(test1.getName());		
//		
//	}
//}



//public class MultiThread extends Thread
//{
//	public void run() 
//	{
//		System.out.println(Thread.currentThread().getId()); 
//	}
//	
//	public static void main(String[] args)
//	{
//		
//		for(int i=0;i<10;i++)
//		{
//			MultiThread nit = new MultiThread();
//			nit.start();
//		}
//	}
//}



//public class MultiThread extends Thread
//{
//	public void run() {
//		System.out.print(Thread.currentThread().getId()+" ");
//	}
//	
////	@Override
////	public void start() {
////		System.out.print(Thread.currentThread().getName()+" ");
////	}
//	
//	public static void main(String[] args) 
//	{
//		
//		for(int i=0;i<10;i++)
//		{
//			MultiThread nit = new MultiThread();
//			nit.start();
//		}
//	}
//}



//public class MultiThread extends Thread
//{
//	public void run() {
//		System.out.print(Thread.currentThread().getId()+" ");
//	}
//	
//	@Override
//	public void start() {
//		System.out.print(Thread.currentThread().getName()+" ");
//	}
//	
//	public static void main(String[] args) {
//		MultiThread nit = new MultiThread();
//		for(int i=0;i<10;i++)
//		{
//			nit.run();
//		}
//	}
//}

//public class MultiThread implements Runnable
//{
//	Thread thread;
//	public MultiThread() {
//		thread = new Thread(this);
//		thread.start();
//	}
//	public void run() {
//		System.out.println(thread); //tostring
//		
//	}	
//	public static void main(String[] args) 
//	{
//		new MultiThread();
//	}
//}



//public class MultiThread implements Runnable
//{
//	Thread thread;
//	public MultiThread()
//	{
//		thread = new Thread(this,"NareshIT");
//		thread.setPriority(11); // 1 - 10
//		thread.start();
//	}
//	public void run()
//	{
//		System.out.println(thread);
//		
//	}
//	public static void main(String[] args) 
//	{
//		new MultiThread();
//	}
//}


//public class MultiThread extends Thread
//{	
//	public static void main(String[] args)
//	{
//		MultiThread m1 = new MultiThread();
//		MultiThread m2 = new MultiThread();
//		MultiThread m3 = new MultiThread();
//		
//		
//		
//		
//		m1.start(); //thread - 0
//		m2.start(); //thread - 1
//		m3.start(); //thread - 2
//		
//		
//		m1.setName("child1");
//		m2.setName("child2");
//		m3.setName("child3");
//	}
//	
//    public void run() 
//	{                                             
//			System.out.println(Thread.currentThread().getName());
//	}
//}


//public class MultiThread extends Thread
//{	
//	public static void main(String[] args) 
//	{
//		MultiThread m1 = new MultiThread();
//		MultiThread m2 = new MultiThread();
//		MultiThread m3 = new MultiThread();
//		m1.start(); 
//		m2.start();
//		m3.start();
//		
//		for(int i=0;i<5;i++) 
//		{
//			
//			System.out.println(Thread.currentThread().getName());
//		}
//	}
//	public void run() 
//	{
//			System.out.println(Thread.currentThread().getName());
//	}
//}


//class Test implements Runnable
//{
//	@Override
//	public void run() 
//	{
//		Thread thread = Thread.currentThread();
//		System.out.println(thread.getName());  
//	}
//}
//public class MultiThread
//{
//	public static void main(String[] args)
//	{
//		Test nit = new Test();
//		nit.run();
////		Thread t = new Thread(nit);
////		t.start();
//	}
//}




//class Test implements Runnable
//{
//	@SuppressWarnings("deprecation")
//	@Override
//	public void run() {
//		Thread thread = Thread.currentThread();
//		thread.stop(); //stop
//		System.out.println(thread.getState());
//	}
//}
//public class MultiThread
//{
//	public static void main(String[] args) {
//		Test nit = new Test();
//		nit.run();
//	}
//}


//class Test implements Runnable
//{
//	public void run() {
//		Thread thread = Thread.currentThread();
//		Thread nit = thread.currentThread();
//		System.out.println(nit.getName());		
//	}
//}
//public class MultiThread
//{
//	public static void main(String[] args) {
//		Test nit = new Test();
//		Thread thread = new Thread(nit);
//	}
//}


//class Test implements Runnable
//{
//	public void run() {
//		Thread thread = Thread.currentThread();
//		Thread nit = thread.currentThread();
//		System.out.println(nit.getName());			
//	}
//}
//
//public class MultiThread
//{
//	public static void main(String[] args) {
//		Test nit = new Test();
//		Thread thread = new Thread(nit);
//		thread.start();
//	}
//}

//class Test implements Runnable
//{
//	@SuppressWarnings("static-access")
//	public void run() {
//		Thread thread = Thread.currentThread();
//		Thread nit = thread.currentThread();
//		System.out.println(nit.getName());
//				
//	}
//}
//public class MultiThread
//{
//	public static void main(String[] args) {
//		Test nit = new Test();
//		Thread thread = new Thread(nit);
//		thread.setName("NareshIT");
//		thread.start();
//	}
//}


//public class MultiThread 
//{
//	public static void main(String[] args)
//	{
//		Thread nit = new Thread();
//		                      //1                      10                  5
//		System.out.println(nit.MIN_PRIORITY+" "+nit.MAX_PRIORITY+" "+nit.NORM_PRIORITY);
//	}
//
//}


//public class MultiThread 
//{
//	public static void main(String[] args) 
//	{
//		Thread nit = new Thread();
//		System.out.println(nit.MIN_PRIORITY+nit.MAX_PRIORITY+nit.NORM_PRIORITY);
//	}
//}


//class Test implements Runnable
//{
//	public void run()
//	{
//		for(int i=0; i<2; i++)
//		System.out.println(Thread.currentThread().getName()+" ");
//		
//	}
//	
//}
//
//public class Test20
//{
//	public static void main(String[] args) 
//	{
//		Test t = new Test();
//		Thread t1 = new Thread(); //nothing
//		Thread t2 = new Thread(t,"J2EE");
//		Thread t3 = new Thread(t,"J2ME");
//		
//		t1.start();
//		
//		t2.start();
//		t3.start();
//
//	}
//}


//public class Test27 extends Thread
//{
//	public static void main(String[] args) 
//	{
//		try
//		{
//			Thread t1= new Thread(new Test27 (),"Rahul");
//			Thread t2= new Thread(new Test27(),"Ravi");
//			t1.start();
//			t1.start();
//			
//			t2.start();
//		}
//		catch (Exception e)
//		{
//			e.printStackTrace();
//		}
//	}
//	public void run() 
//	{
//		for(int i=0; i<2; i++)
//		{
//			try
//			{
//				Thread.sleep(500);
//			}
//			catch (Exception e)
//			{
//				System.out.println("e2");
//			}
//			System.out.println(Thread.currentThread().getName()+" ");
//
//		}
//	}
//}































