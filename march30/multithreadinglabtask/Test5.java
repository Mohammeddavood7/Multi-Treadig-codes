package com.march30.multithreadinglabtask;


public class Test5 extends Thread {

    public static void main(String[] args) throws Exception {
    Test5 t = new Test5();
    t.start();
    t.method();
    }

    public void run() {
    System.out.println("run");
    }

    public void method() {
	hello();
    System.out.println("method");
}

public void hello()
	{
	hello1();
	System.out.println("PR");
	}

	public void hello1()
	{
	
	System.out.println("RR");
	}
}
