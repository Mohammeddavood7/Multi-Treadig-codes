package com.march27.multithreadingg;

import java.util.function.Supplier;

public class Test
{
    public static void printString(Supplier<String> supplier)
    {
        String result = supplier.get();
        System.out.println(result);
    }
    

    public static void main(String[] args)
    {
        String myString = "Hello World!";
        
        // Using lambda expression
        printString(() -> myString);
        
        //Using method reference
        printString(myString::toString);
    }
}
