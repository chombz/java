package com.chombz_oop.j08_multithreading;

/**
 * Java class that demonstrates the various methods of the Thread class
 *
 * @author chomb
 */
public class ThreadClassMethods implements Runnable
{

    String threadName;
    Thread th;

    /**
     * @param threadName
     */
    public ThreadClassMethods(String threadName)
    {
        this.threadName = threadName;
        // System.out.println("Thread is alive for th returns: " + this.th.isAlive());
        this.th = new Thread(this, threadName);
        System.out.println("New thread " + this.threadName + " is starting.");
        this.th.start();
    }

    @Override
    public void run()
    {
        // Code to be executed when the thread starts
        try
        {
            for (int e = 0; e < 2; e++)
            {
                System.out.println(this.threadName + " : " + e);
                Thread.sleep(1000);
            }
        } catch (InterruptedException ie)
        {
            System.out.println(this.threadName + " interrupted");
        }
        System.out.println(this.threadName + " exiting");
    }

    /**
     * @param args
     */
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        ThreadClassMethods objNew1 = new ThreadClassMethods("one");
        ThreadClassMethods objNew2 = new ThreadClassMethods("two");
        ThreadClassMethods objNew3 = new ThreadClassMethods("three");
        System.out.println("First thread is alive :" + objNew1.th.isAlive());
        System.out.println("Second thread is alive :" + objNew2.th.isAlive());
        System.out.println("Third thread is alive :" + objNew3.th.isAlive());

        try
        {
            System.out.println("In the main method, waiting for the threads "
                              + "to finish");
            objNew1.th.join();
            objNew2.th.join();
            objNew3.th.join();
        } catch (InterruptedException e)
        {
            System.out.println("Main thread is interrupted");
        }
        System.out.println("First thread is alive :" + objNew1.th.isAlive());
        System.out.println("Second thread is alive :" + objNew2.th.isAlive());
        System.out.println("Third thread is alive :" + objNew3.th.isAlive());
        System.out.println("Main thread is over and exiting");

    }
}
