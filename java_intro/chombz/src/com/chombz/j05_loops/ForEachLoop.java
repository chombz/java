package com.chombz.j05_loops;

/**
 * Java program to demonstrate the use of the for...each loop
 *
 * @author chomb
 */
public class ForEachLoop
{

    /**
     * main method begins program execution
     */
    public static void main(String[] args)
    {
        // An array of integers
        int num[] =
        {
            6, 7, 8, 4, 1, 11, 10, 15, 22, 28, 34
        };

        // Display contents of the num array using a normal for loop 
        for (int e = 0; e < num.length; e++)
        {
            System.out.printf("The current number is: %d\n", num[e]);
        }

        System.out.println("Display the contents of the num array using a for...each loop");
        // Display the contents of the num array using a for...each loop
        for (int c : num)
        {
            System.out.printf("The current number is: %d\n", c);
        }
    }
}
