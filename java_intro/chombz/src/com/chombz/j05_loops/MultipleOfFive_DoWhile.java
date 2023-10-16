package com.chombz.j05_loops;

/**
 * Java program to display the first ten multiple of 5 using
 * the do...while loop.
 * @author chomb
 */
public class MultipleOfFive_DoWhile 
{

    /**
     * Main method begins program execution
     */
    public static void main(String[] args) 
    {
        // Loop Variables
        int e =1;
        do
        {
            System.out.printf("%2d x 5 = %2d\n",e,(e * 5));
            e++;
        }while(e <= 10);
    }
}
