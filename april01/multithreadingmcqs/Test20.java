package com.april01.multithreadingmcqs;

//public class MultiThread13 
//{
//	public static void main(String[] args) {
//		Thread nit = new Thread();
//		System.out.println(nit.MIN_PRIORITY+" "+nit.MAX_PRIORITY+" "+nit.NORM_PRIORITY);
//	}
//}


//public class MultiThread13 
//{
//	public static void main(String[] args) {
//		Thread nit = new Thread();
//		System.out.println(nit.MIN_PRIORITY+nit.MAX_PRIORITY+nit.NORM_PRIORITY);
//	}
//}


class Test333 implements Runnable
{
	public void run()
	{
		
			for(int i=0; i<2; i++)
			{
			    System.out.println(Thread.currentThread().getName()+" ");
	        }
	      System.out.println();
     }
}
public class Test20
{
	public static void main(String[] args) 
	{
		Test333 t = new Test333();
		Thread t1 = new Thread();
		Thread t2 = new Thread(t,"J2EE");
		Thread t3 = new Thread(t,"J2ME");
		t1.start();t2.start();t3.start();

	}
}

