package com.chombz_oop.j07_threads;

import java.security.SecureRandom;

/**
 * Java class that illustrates how to create 
 * @author chomb
 */
public class ExtendsThread extends Thread
{

    /**
     * Constants to generate a random amount of time that determines how long a 
     * given thread sleeps
     */
    private static final SecureRandom SLEEP_TIME_GENERATOR = new SecureRandom();
    private final int SLEEP_DURATION;

    public ExtendsThread(int threadNum)
    {
        // Set the name of the thread
        this.setName("Thread" + threadNum);

        // Set a random thread sleep time between 0 to 1.5 seconds
        this.SLEEP_DURATION = SLEEP_TIME_GENERATOR.nextInt(1500);
    }

    @Override
    public void run()
    {
        try
        {
            for (int e = 5; e >= 1; e--)
            {
                System.out.println("\nOutput from " + this.getName());
                System.out.println("Current value of e is " + e);

                // Put the thread to sleep
                Thread.sleep(SLEEP_DURATION);

                // Display how long the current thread has slept
                System.out.println(this.getName() + " has slept for "
                        + SLEEP_DURATION + " milliseconds");
            }
        } catch (InterruptedException e)
        {
            System.out.println("The thread was interrupted. \n"
                    + e.getLocalizedMessage());
        }
        System.out.println(this.getName() + " has finished executing");
    }
}
