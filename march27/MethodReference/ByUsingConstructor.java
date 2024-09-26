package com.march27.MethodReference;


interface Myclass
{
	Test createObject();
	
}

class Test
{
	public Test()
	{
		int i = 1;
		System.out.println("Test class constructor is invoked"+i++);
	}
}



public class ByUsingConstructor 
{
	public static void main(String[] args)
	{
		Myclass mc = () -> new Test();
		mc.createObject();
		
		Myclass mcc = Test::new;
		mcc.createObject();
		
	}

}
