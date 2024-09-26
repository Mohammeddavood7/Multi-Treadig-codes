package com.march27.MethodReference;

import java.util.function.BiFunction;

interface DemoOnString
{
	void salaryDetails();
}



public class MethodString
{
	public static void main(String[] args)
	{
		String name = "RaviShankar";
	    String place = " hyderabad";
	    
	    String concat = name.concat(place);
	    System.out.println(concat);
	    
	    BiFunction<String,String,String> add = String::concat;
	    System.out.println(add.apply(name, place).toLowerCase());
	    
		
	}

}
