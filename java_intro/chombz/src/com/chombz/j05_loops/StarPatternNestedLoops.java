package com.chombz.j05_loops;

/**
 * Java program to demonstrate nested loops to display a star pattern 
 * @author chomb
 */
public class StarPatternNestedLoops 
{

    /**
     * Main method begins with program execution
     */
    public static void main(String[] args) 
    {
        //
        for (int e = 0; e < 5; e++) 
        {
            for (int c = 0; c < e; c++)
            {
               System.out.format("* "); 
            }
            System.out.println("");
        }
    }
    
}
