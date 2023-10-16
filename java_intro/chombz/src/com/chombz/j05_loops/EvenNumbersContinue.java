package com.chombz.j05_loops;

/**
 * Java program to demonstrate the continue keyword in a loop display even
 * number between 20...50
 * @author chomb
 */
public class EvenNumbersContinue 
{

    /**
     * main method begins program execution
     */
    public static void main(String[] args) 
    {
        // Variables
        int e = 0;
        System.out.println("Even numbers between 0 to 10");
        do
        {
           if(e % 2 == 1)
           {
               e++;
               continue;
           }
           if(e < 10)
               System.out.printf("%d, ",e);
           else
               System.out.printf("and %d, ",e);
           e++;
        }while(e <= 10);
        System.out.println("");
    }   
}
