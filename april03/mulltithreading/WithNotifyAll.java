package com.april03.mulltithreading;



class BankBalance
{
	int balance = 10000;
	public synchronized void withDraw(int amount )
	{
		
		if(balance < amount)
		{
			System.out.println("balance is less,waiting for deposite money..");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		
		System.out.println("Amount after deposited: "+balance);
		System.out.println("With draw amount is : "+amount);
		balance -= amount;
		System.out.println("After the withdraw amount :"+balance);
	}

    public  void desposite(int amount)
    {
    	synchronized(this)
    	{
    	   this.balance += amount;
    	   System.out.println("notifed and deposited");
    	   notify();
    	}
    }
	
	
	
}
public class WithNotifyAll
{
	public static void main(String[] args)
	{
		
		BankBalance bb = new BankBalance();
		
		Thread son = new Thread(() -> bb.withDraw(11000));
		son.start();
		
		Thread father = new Thread(() -> bb.desposite(9000));
		father.start();
		
		
		
	}
	

}




























































