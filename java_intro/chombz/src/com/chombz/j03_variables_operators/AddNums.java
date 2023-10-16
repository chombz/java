package com.chombz.j03_variables_operators;

import java.util.Scanner;

/**
 * Java program that accepts two numbers from the user, sums then and displays
 * their sum
 *
 * @author e.chomba
 */
public class AddNums
{
    /**
     * main method begins program execution
     */
    public static void main(String[] args)
    {
        // variables and objects to be used in program
        Scanner userInput = new Scanner(System.in);
        byte num1, num2;
        short sum;

        //prompt user for the numbers ro be added
        System.out.println("Please enter the first number to be added ->");
        num1 = userInput.nextByte();
        System.out.println("Please enter the second number to be added ->");
        num2 = Byte.parseByte(userInput.next());
        userInput.close(); //close the input stream

        //Add the two numbers
        sum = (short) (num1 + num2);

        //Display the results
        System.out.format("The sum of %d + %d is %d%n", num1, num2, sum);
        
    }

}
