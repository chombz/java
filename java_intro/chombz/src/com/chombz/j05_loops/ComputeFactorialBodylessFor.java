package com.chombz.j05_loops;

import java.util.Scanner;

/**
 * Java program to demonstrate calculating the factorial
 * of the number entered the user using a body-less for loop.
 * @author chomb
 */
public class ComputeFactorialBodylessFor 
{
    static Scanner userInput = new Scanner(System.in);
    
    /**
     * main method begins with program execution
     */
    public static void main(String[] args) 
    {
        //Variables
        int n = 1;//looping variable
        long factorial = 1L;
        int userNum = -1;
        
        //Use the first loop to ensure that the user enteres a +ve number
        while(userNum < 0)
        {
            System.out.println("Please enter a postive whole number and I'll"
                              + " tell you it's factorial -> ");
            userNum = userInput.nextInt();
        }
        userInput.close();//close input
        
        //Compute the factorial using a body-less for loop
        for(; n <= userNum; factorial *= n++);

        //Display the factorial
        System.out.printf("\nThe factorial of %d is %d\n" ,userNum, factorial);         
    }
}
