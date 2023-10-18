package com.chombz_oop.j01_exceptions_and_assertions;

import java.util.Scanner;

/**
 * Java program to demonstrate working with custom exceptions
 * @author chomb
 */
public class DemoDiviByZeroException
{
    //main program begins with program execution
    public static void main(String[] args)
    {
        try(Scanner userInput = new Scanner(System.in))
        {
            //prompt the user for the variables to be used for division
            System.out.println("Please enter the numerator -> ");
            int numerator = userInput.nextInt();
            System.out.println("Please enter lne denominator -> ");
            int denominator = userInput.nextInt();
            
            //when the denominator is 0 "Zero" throw the custom exception
            if(denominator == 0)
                throw new DivideByZeroException();
            
            //Display the results when the user give us valid numerator and denominator
            System.out.printf("\nQuotient of %d %c %d = %d \n", numerator, 
                    '÷', denominator, numerator);
        }
        //Handle the custom
         catch(DivideByZeroException dbze)
        {
            System.err.println(dbze.getLocalizedMessage());
        }
        catch(Exception e)
        {
            System.err.println(e.getLocalizedMessage() != null?
                               e.getLocalizedMessage(): "Sorry, you gave us 0 "
                                       + "for denominator and this will lead to"
                                       + " division errors. \nPlease give us a "
                                       + "non-zero value e.g. 5");
        }
    }
    
}
