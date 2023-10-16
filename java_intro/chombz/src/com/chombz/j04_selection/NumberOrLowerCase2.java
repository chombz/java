package com.chombz.j04_selection;

import java.util.Scanner;

/**
 * Java program that tells user that the character or number the enter is a
 * Number or a Lowercase if not any it tells user "invalid input"
 *
 * @author chomb
 */

public class NumberOrLowerCase2
{
    //Main method begins with program execution
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);

        // Tell the user to enter a character
        System.out.println("Please enter a character: ");
        char input = userInput.next().charAt(0);
        userInput.close();
        
        //Check if the character entered by the user is a Number 
        //or a Lowercase if not prompt user "invalid input"
        if (Character.isLowerCase(input)) {
            System.out.println(input + " is a lowercase letter.");
        } else if (Character.isDigit(input)) {
            System.out.println(input + " is a number.");
        } else {
            System.out.println(input + " is neither a lowercase letter nor a number.");
        }
    }
}
