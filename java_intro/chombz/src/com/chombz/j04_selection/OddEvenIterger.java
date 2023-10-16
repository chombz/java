package com.chombz.j04_selection;

import java.util.Scanner;

/**
 * Java program for Odd and Even Integer 
 * @author e.chomba
 */
public class OddEvenIterger
{

    /**
     * main method begins with a program execution
     * @param args
     */
    public static void main(String[] args)
    {
        //variables to be used in the program
        int userNum;
        Scanner userInput = new Scanner (System.in);
        //prompt the user for a whole number/interger
        System.out.println("Please enter a number and I'll tell you if"
                           + " it's odd or even -> ");
        userNum = userInput.nextInt();
        userInput.close();//close the input stream
        //Check if the number entered by user is odd or even
        if(userNum %2 == 0)
            System.out.println(userNum + " is an even number.");
        else
            System.out.println(userNum + " is an odd number.");
    }
    
}
