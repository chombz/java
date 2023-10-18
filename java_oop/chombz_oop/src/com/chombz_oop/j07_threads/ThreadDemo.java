package com.chombz_oop.j07_threads;

/**
 * Java program that demonstrates how to work with threads instantiated from a
 * class that extends the Thread class and one that implements the Runnable
 * interface
 *
 * @author chomb
 */
public class ThreadDemo
{

    //main method begins with program excution
    public static void main(String[] args)
    {
        ExtendsThread thread1 = new ExtendsThread(1);
        thread1.setPriority(2);

        Thread thread2 = new Thread(new ImplementRunnable(2));
        Thread thread7 = new Thread(new ImplementRunnable(7));
        Thread thread8 = new Thread(new ImplementRunnable(8));
        thread8.setName("Thread 8");
        ExtendsThread thread5 = new ExtendsThread(5);

        // Change the priority of threads
        thread1.setPriority(Thread.MAX_PRIORITY);

        try
        {
            // Join the threads to the main thread
            thread2.start();  // Start thread2
            thread2.join();   // Wait for thread2 to finish

            thread7.start();
            thread7.join();

            thread8.start();
            thread8.join();

            thread5.start();
            thread5.join();

            // Display the priority of thread5
            System.out.printf("The priority of %s is %d\n", thread5.getName(),
                    thread5.getPriority());

            // Start thread1 after other threads have finished
            thread1.start();

            // Display the priority of thread1
            System.out.printf("The priority of %s is %d\n", thread1.getName(),
                    thread1.getPriority());
        } catch (InterruptedException e)
        {
            System.out.println("An error occurred: " + e.getLocalizedMessage());
        }
        System.out.println("Main thread is exiting");
    }
}
