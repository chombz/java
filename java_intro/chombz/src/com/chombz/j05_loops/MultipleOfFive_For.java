package com.chombz.j05_loops;

/**
 * Java program to display the first ten multiple of 5 using
 * the for loop.
 * @author chomb
 */
public class MultipleOfFive_For 
{

    /**
     * Main method begins program execution
     */
    public static void main(String[] args) 
    {
        // Loop Variables
        int e =1;
        for( ; e <=10; e++)
        {
            System.out.printf("%2d x 5 = %2d\n",e,(e * 5));
        }
    }
}
