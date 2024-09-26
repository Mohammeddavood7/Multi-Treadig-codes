package com.april01.synchronizationonmutlithreading;

class Test999 extends Thread
{
	@Override
     public  void run()
     {
		synchronized(this)
		{
		 Thread thread = Thread.currentThread();
		 System.out.println(thread.getName());
		 System.out.println();
		}
     }

    public static void main(String [] arg)
    {
    	Test999 t1 = new Test999();
    	Test999 t2 = new Test999();
    	Test999 t3 = new Test999();
    	
    	t1.start(); t2.start(); t3.start();
	
    }
}
