package com.chombz_oop.j07_threads;

import java.security.SecureRandom;

/**Java class that demonstrates how to create new threads by implementing the
 * Runnable interface
*/

public class ImplementRunnable implements Runnable
{
    
    private static final SecureRandom SLEEP_TIME_GENERATOR = new SecureRandom();
    private final int SLEEP_DURATION;
    private String threadName;
    
    public ImplementRunnable()
    {
        this.SLEEP_DURATION = 0;
    }
    
    public ImplementRunnable(int threadNum)
    {
        //Set the name of the thread
        this.setThreadName("Thread" + threadNum);
        
        //Set a random thread sleep time between 0 to 1.5 seconds
        this.SLEEP_DURATION = SLEEP_TIME_GENERATOR.nextInt(1500);
    }
    
    
    
    
    
    @Override
    public void run()
    {
       try
        {
            for (int e = 5; e >= 1; e--)
            {
                System.out.println("\nOutput from " + this.getThreadName());
                System.out.println("Current value of e is " + e);
                
                //Put the thread to sleep
                Thread.sleep(SLEEP_DURATION);
                
                //Display how long the current thread has slept
                System.out.println(this.getThreadName() + " has slept for "
                                  + SLEEP_DURATION + " milliseconds");
            }
        }catch(InterruptedException e)
        {
            System.out.println("The thread was interrupted. \n" 
                              + e.getLocalizedMessage());
        }
        System.out.println(this.getThreadName() + " has finished executing");
    }
    
    
    /**
     * @return the threadName 
     */
    public String getThreadName()
    {
        return threadName;
    }
    
    /**
     * @param threadName the threadName to set 
     */
    public void setThreadName(String threadName)
    {
        this.threadName = threadName;
    }
    
    
}
