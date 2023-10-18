package com.chombz_oop.j13_adanvaced_concurrency;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CountedCompleter;

/**
 * Java program to demonstrates the CountedCompleter class and its methods.
 *(takes long to run)
 * @author e.chomba
 */
public class CountedCompleterDemo
{

    static class NumberComputator extends CountedCompleter<Void>
    {

        final ConcurrentLinkedQueue<String> CONCURRENTLINKEDQUEUE;
        final int START;
        final int END;

        public NumberComputator(ConcurrentLinkedQueue<String> CONCURRENTLINKEDQUEUE, int START, int END)
        {
            super(null);
            this.CONCURRENTLINKEDQUEUE = CONCURRENTLINKEDQUEUE;
            this.START = START;
            this.END = END;
        }

        @Override
        public void compute()
        {
            for (int i = START; i <= END; i++)
            {
                CONCURRENTLINKEDQUEUE.add(String.valueOf(i));
            }
        }
    }

    public static void main(String[] args)
    {
        try
        {
            ConcurrentLinkedQueue<String> linkedQueue = new ConcurrentLinkedQueue<>();
            NumberComputator numberComputator = new NumberComputator(linkedQueue, 1, 100);
            numberComputator.fork(); // Start the computation
            numberComputator.join(); // Wait for completion

            linkedQueue.forEach(item ->
            {
                System.out.println(" " + item);
            });
        } catch (Exception ex)
        {
            System.err.println("The error " + ex.getLocalizedMessage() + " occurred");
        }
    }
}
