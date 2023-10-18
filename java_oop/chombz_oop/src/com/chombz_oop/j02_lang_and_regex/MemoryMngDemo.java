package com.chombz_oop.j02_lang_and_regex;

/**
 * Java program to demonstrate memory management via Java's garbage collector
 * @author chomb
 */
public class MemoryMngDemo
{

    //main program begins with program execution
    public static void main(String[] args)
    {
        Runtime rt = Runtime.getRuntime();
        long mem1, mem2;
        Integer someInts[] = new Integer[1000];
        
        //Display the total memory sllocsted to the JVM
        System.out.println("The total momory allocated to the JVM is "
                          + rt.totalMemory());
        
        //Get the free memory and display it
        mem1 = rt.freeMemory();
        System.out.println("The initial free memory is " + mem1);
        rt.gc();//garbage collector
        mem1 = rt.freeMemory();
        
        //Allocate the interger array values using a loop
        for (int e = 0; e < someInts.length; e++)
        {
            someInts[e] = e;
            
        }
        mem2 = rt.freeMemory();//get free memory after integer allocation
        System.out.println("Free memory after interger allocation is : " +
                          mem2);
        //Display the memory used by interger allocation
        System.out.println("Memory used by integer array allocation is: "
                          + (mem1 - mem2));
        
        //discard the integer array values using a loop
        for (int e = 0; e < someInts.length; e++)
        {
            someInts[e] = null;
            
        }
        
        //Request Garbage collection
        rt.gc();
        
        //display the free memory after garbage collection
        System.out.println("Free memory aftter garbage collection is: " +
                          rt.freeMemory());
        
        
    }
    
}
