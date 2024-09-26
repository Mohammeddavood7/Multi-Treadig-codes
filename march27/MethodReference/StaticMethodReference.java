package com.march27.MethodReference;


interface Callable 
{
   void call(String name);
}

class StaticMethod 
{
  public static void getName(String name)
  {
	  System.out.println(name+" is calling..");
  }
}

public class StaticMethodReference {

	public static void main(String[] args) 
	{
		//By using Lambda
		Callable c1 =  str -> StaticMethod.getName(str);
		c1.call("Ravi");
		
		//By using Method reference
		Callable c2 = StaticMethod::getName;
		c2.call("Scott");
		
		
	}

}
