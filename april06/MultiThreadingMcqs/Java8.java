package com.april06.MultiThreadingMcqs;

/*class NIT implements Runnable 
{
	@Override
	public void run() {
		for(int a=0;a<10;a++)
		{
			System.out.println("NareshIT1");
			try {
				 Thread.sleep(2000);
			} catch (InterruptedException e) {
				System.out.println("NIT Thread failed");
			}
		}
	}
}

class NIT1 implements Runnable
{
	@Override
	public void run() {
		for(int a =0;a<10;a++) 
		{
			System.out.println("NareshIT2");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println("NIT1 Thread failed");
			}
		}
		
	}
}

public class Java8 {
	public static void main(String[] args) {
		Runnable nit = new NIT();
		Runnable nit1 = new NIT1();
		
		Thread thread = new Thread(nit);
		Thread thread1 = new Thread(nit1);
		
		thread.start();
		thread1.start();
    }
}*/


/*public class Java8 extends Thread {
	public static void main(String[] args) {
		if(Thread.currentThread().isDaemon()) 
		{
			System.out.println("Daemon thread Running");
		}
		else
		{
			System.out.println("Normal Thread Running");
		}
		
		Java8 java = new Java8();
		Java8 java1 = new Java8(); //setDaemon
		Java8 java2 = new Java8();
		Java8 java3 = new Java8();
		
		java1.setDaemon(true);
		
		java.start();
		java1.start();
		java2.start();
		java3.start();
		
    }
}*/


/*public class Java8 extends Thread {
	
	@Override
	public void run() {
		if(Thread.currentThread().isDaemon()) 
		{
			System.out.println("Daemon thread Running");
		}
		else
			System.out.println("Normal Thread Running");
	}
	
	public static void main(String[] args) {
		
		
		Java8 java = new Java8();
		Java8 java1 = new Java8(); //setDaemon
		Java8 java2 = new Java8();
		Java8 java3 = new Java8();
		
		java1.setDaemon(true);
		
		java.start();
		java1.start();
		java2.start();
		java3.start();
		
    }
}*/

/*public class Java8 extends Thread {
	
	public synchronized void display()
	{
		for(int a=0;a<5;a++) 
		{
			System.out.println("display");
		}
		
		
		  notify();
	}
	
	public void display1() {
		for(int a=0;a<5;a++) 
		{
			System.out.println("display1");
		}
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		Java8 java = new Java8();
		java.start();
		java.display();
		synchronized(java)
		{
		  java.wait();
		}
		java.display1();
    }
}
*/

/*public class Java8 extends Thread {
	
	public void display() {
		for(int a=0;a<5;a++) 
		{
			System.out.println("display");
		}
	}
	
	public void display1() {
		for(int a=0;a<5;a++) 
		{
			System.out.println("display1");
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		Java8 java = new Java8();
		java.start();
		java.display();
		java.sleep(1000);
		java.display1();
    }
}*/

/*class NIT extends Thread
{
	public void display() throws InterruptedException {
		for(int a=0;a<5;a++) 
		{
			System.out.println("NIT Display");
			
			Thread.sleep(500);
		}
	}
}

class NIT1 extends Thread
{
	public void display1() throws InterruptedException {
		for(int a=0;a<5;a++) 
		{
			System.out.println("NIT Display1");
			
			Thread.sleep(1000);
		}
	}
}

public class Java8 {
	
	public static void main(String[] args) throws InterruptedException {
		NIT nit = new NIT();
		NIT1 nit1 = new NIT1();
		
		nit.start();
		nit1.start();
		
		nit.display();
		nit1.display1();
    }
}*/


/*class NIT extends Thread
{
	@Override
	public void run() {
		System.out.println(currentThread().getId());
		System.out.println(currentThread().getName());
	}
}

public class Java8 {
	
	public static void main(String[] args) throws InterruptedException {
		NIT nit = new NIT();
		NIT nit1 = new NIT();
		NIT nit2 = new NIT();
		nit.start();
		nit1.start();
		nit2.start();
    }
}*/

/*class NIT extends Thread
{
	@Override
	public void run() {
		System.out.println(currentThread().getName());
		System.out.println(currentThread().getPriority());
	}
}*/
/*
public class Java8 {
	
	public static void main(String[] args) throws InterruptedException {
		NIT nit = new NIT();
		NIT nit1 = new NIT();
		NIT nit2 = new NIT();
		
		nit.setPriority(Thread.NORM_PRIORITY);
		nit1.setPriority(Thread.NORM_PRIORITY);
		nit2.setPriority(Thread.NORM_PRIORITY);
		
		nit.start();
		nit1.start();
		nit2.start();
    }
}
*/



/*public class Java8 {
	
	public static void main(String[] args) throws InterruptedException {
		NIT nit = new NIT();
		NIT nit1 = new NIT();
		NIT nit2 = new NIT();
		NIT nit3 = new NIT();
		
		nit.start();
		nit.setPriority(Thread.NORM_PRIORITY);
		nit1.start();
		nit.setPriority(Thread.MIN_PRIORITY);
		nit2.start();
		nit.setPriority(Thread.MAX_PRIORITY);
		nit3.start();
		
    }
}*/


/*class NIT extends Thread
{
	@Override
	public void run() {
		System.out.println(currentThread().getName());
		System.out.println(currentThread().getPriority());
	}
}

public class Java8 {
	
	public static void main(String[] args) throws InterruptedException {
		NIT nit = new NIT();
		nit.run();
    }
}
*/

/*class NIT extends Thread
{
	@Override
	public void run() {
		System.out.println(currentThread().getId());
	}
}

public class Java8 {
	
	public static void main(String[] args) throws InterruptedException {
		for(int a = 0; a<10;a++) 
		{
		  Thread newThread = new Thread(new NIT());
		  newThread.start();
		}
    }
}
*/


/*class TestSync
{
	void display(int a) throws InterruptedException {
		synchronized (this) {
			System.out.println(a*5);
			Thread.sleep(500);
		}
	}
}

class NIT extends Thread
{
	TestSync test;
	@Override
	public void run() {
		try {
			test.display(Thread.MIN_PRIORITY);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public NIT(TestSync test) {
		this.test = test;
	}
}
class NIT1 extends Thread
{
	TestSync test;
	@Override
	public void run() {
		try {
			test.display(MIN_PRIORITY);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public NIT1(TestSync test) {
		this.test = test;
	}
}

public class Java8 {
	
	public static void main(String[] args) throws InterruptedException {
		TestSync test = new TestSync();
		NIT nit = new NIT(test);
		NIT1 nit1 = new NIT1(test);
		
		nit.start();
		nit1.start();
    }
}
*/



class TestSync
{
	public static synchronized void display(String name) {
		System.out.println("Congratulations Mr/Mrs "+name);
	}
}

class NIT extends Thread
{
	
	TestSync test;
	String name;
	@Override
	public void run() {
		test.display(name);
	}
	
	public NIT(TestSync test, String name) {
		this.test = test;
		this.name = name;
	}
}


public class Java8 {
	
	public static void main(String[] args) throws InterruptedException {
		TestSync test = new TestSync();
		NIT nit = new NIT(test,"Naresh");
		NIT nit1 = new NIT(test,"Ravi");
		nit.start();
		nit1.start();
    }
}













































































































