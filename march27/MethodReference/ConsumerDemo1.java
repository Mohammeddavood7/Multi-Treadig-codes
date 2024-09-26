package com.march27.MethodReference;

import java.util.function.Consumer;

record Product(int pid , String pname)
{
	
}


public class ConsumerDemo1 
{
	public static void main(String[] args) 
	{
	  Consumer<Integer> c1 =  x -> System.out.println("Integer :"+x);
	  c1.accept(12);
	  
	  Consumer<String> c2 = x -> System.out.println("String :"+x);
	  c2.accept("NIT");
	  
	  Consumer<Double> c3 = x -> System.out.println("Double :"+x);
	  c3.accept(12.90);
	  
	 Consumer<Product> c4 = x -> System.out.println(x.toString());
	 c4.accept(new Product(111, "Laptop")); 
	  
	}
}
