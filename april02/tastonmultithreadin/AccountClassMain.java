package com.april02.tastonmultithreadin;

 class AccountClass
{
	int balance ;
	
	public synchronized void withdraw(int amount)
	{
		this.balance -= amount;
		System.out.println("withdraw amount: "+amount);
		System.out.println("-----------------------------");
	}
	
	public synchronized  void deposite(int amount)
	{
		this.balance += amount;
		 System.out.println(Thread.currentThread().getName()+" balance  : "+balance);

	}
	

}
 
 public class AccountClassMain
 {
	 public static void main(String[] args) 
	 {
		 
		 AccountClass ac = new AccountClass();
		
		 Runnable r1 = () ->
		 {
			 ac.deposite(20000);
			 ac.withdraw(10000);			 
		 };
		 
		 Thread t1 = new Thread(r1,"child-01");
		 t1.start();
		 
		 
		 Thread t2 = new Thread(r1,"child-02");
		 t2.start();
		 
		 
		 
		
  	 }
 }
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 


