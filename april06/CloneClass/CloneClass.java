package com.april06.CloneClass;

 class Customer implements Cloneable
{
	
	int customerId;
	String customerName;
	
	@Override
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}

	public Customer(int customerId, String customerName) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
	}

	@Override
	public String toString() {
		return "CloneClass [customerId=" + customerId + ", customerName=" + customerName + "]";
	}
}
 
 public class CloneClass
 {
	 public static void main(String[] args) throws CloneNotSupportedException 
	 {
		 Customer c1 = new Customer(111,"smith");
		 System.out.println("Before cloning....");
		 System.out.println(c1);
		 
		Customer c2 = (Customer)c1.clone();
		c2.customerId = 222;
		c2.customerName = "scott";
		System.out.println("After cloning.....");
		System.out.println(c2);
		
		System.out.println("c1 hashcode: "+c1.hashCode());
		System.out.println("c2 hashcode: "+c2.hashCode());
		
	}
 }

 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 

