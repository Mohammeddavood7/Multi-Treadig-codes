package com.march27.MethodReference;

import java.util.function.Supplier;

record Employee(int eid, String ename)
{
	public String getStudentInfo()
	{
	  return eid+" : " +ename;
	}
}

public class SupplierDemo1 
{
	public static void main(String[] args)
	{
		Supplier<Employee> s1 =() -> new Employee(111, "Scott");
		Employee emp = s1.get();
		//System.out.println(emp);
		System.out.println(emp.getStudentInfo());

	}

}
