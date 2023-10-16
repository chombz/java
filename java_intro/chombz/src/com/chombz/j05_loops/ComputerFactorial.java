package com.chombz.j05_loops;

import java.util.Scanner;

/**
 * Java program to demonstrate calculating the factorial
 * of the number entered the user using loops.
 * @author chomb
 */
public class ComputerFactorial 
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
        
        //Use a switch with a nested loop to compute the factorial
        switch(userNum)
        {
            case 0:
            case 1:
                factorial = 1L;
                break;
            case 2:
                factorial = 2L;
                break;
            default:
                for(; n <= userNum; n++)
                    factorial *= n;
                break;
        }
        
        //Display the factorial
        System.out.printf("\nThe factorial of %d is %d\n" ,userNum, factorial);
                
    }
    
}
