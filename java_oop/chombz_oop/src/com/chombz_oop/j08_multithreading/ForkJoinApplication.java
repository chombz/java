package com.chombz_oop.j08_multithreading;

import java.util.Random;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

/**
 * Java program that creates multiple threads to work on a complex task
 * @author chomb
 */
public class ForkJoinApplication extends RecursiveTask<Integer>
{
    private static final int SEQUNTIAL_THRESHOLD = 5;
    private final int[] data;
    private final int startData;
    private final int endData;
    
    //Constructor(s)
    
    public ForkJoinApplication(int[] data, int startData, int endData)
    {
        this.data = data;
        this.startData = startData;
        this.endData = endData;
    }
    
    public ForkJoinApplication(int[] data)
    {
        this(data, 0, data.length);
    }
    
    //recursive method which forks all small work units and then joins them 
    @Override
    protected Integer compute()
    {
        final int length = endData - startData;
        if(length < SEQUNTIAL_THRESHOLD)
        {
            return computeDirectly();
        }
        final int midValue = length / 2;
        final ForkJoinApplication leftValues = new ForkJoinApplication(data,
              startData, startData + midValue);
        leftValues.fork();
        final ForkJoinApplication rightValues = new ForkJoinApplication(data,
              startData, startData + midValue);
        return null;
    }
    
    private Integer computeDirectly()
    {
        System.out.println(Thread.currentThread() + " computing: " + startData
                          + " to " + endData);
        int max = Integer.MIN_VALUE;
       for(int e = startData; e < endData; e++)
       {
           if (data[e] > max)
               max = data[e];
       }
       return max;
    }
    
    //main method begins program excution
    public static void main(String[] args)
    {
        //create an integer array of random values
        final int[] value = new int[20];
        final Random randomObj = new Random();
        for(int e = 0; e < value.length; e++)
        {
            value[e] = randomObj.nextInt(100);
        }
        
        //submit thr task to the taskpool
        final ForkJoinPool pool = new ForkJoinPool(4);
        final ForkJoinApplication maxFindObj = new ForkJoinApplication(value);
        
        //call the compute methods
        System.out.println("The highest vaulue in the array is: " + 
                pool.invoke(maxFindObj));
    }
}
