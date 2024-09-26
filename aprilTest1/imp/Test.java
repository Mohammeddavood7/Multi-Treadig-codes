package com.aprilTest1.imp;

//public class Test implements Runnable {
//	public void run() {
//	 System.out.println("run.");
//	}
//
//	public static void main(String[] args) {
//            System.out.print("Main Start ");
//		Test t1 = new Test();
//		Thread thread1 = new Thread(t1);
//		thread1.start();
//	}
//}
//
//class Test
//{
//   public static void main(String []argv)
//   {
//      Thread t = Thread.currentThread();
//      System.out.println(t.getName());
//      t.setName("First Thread");
//      System.out.println(t.getName());
//
//}}



//class Reentrant {
//	public synchronized void m() {
//		n();
//		System.out.println("this is m() method");
//	}
//
//	public synchronized void n() {
//		System.out.println("this is n() method");
//	}
//}
//
//public class Test {
//	public static void main(String args[]) {
//		final Reentrant re = new Reentrant();
//		Thread t1 = new Thread() {
//			public void run() {
//				re.m();
//			}
//		};
//		t1.start();
//	}
//}



public class Test 
{
	public static void main(String[] args) {
		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Naresh I Technologies");
			}
		}).start();
		System.out.println(new Thread().isAlive());
    }
}












