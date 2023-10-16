package com.chombz.j12_exeptions;

import java.util.Scanner;

/**
 * Java program that demonstrate how to throw & catch Arithmetic
 *
 * @author chomb
 */
public class DemoArithmeticAndNumberFormatExceptions
{

    // main method begins program execution
    public static void main(String[] args)
    {
        // Variables
        String num1, num2;
        try (Scanner userInput = new Scanner(System.in))
        {
            // Prompt the user for two numbers to be used in division
            System.out.print("Please enter the first number to be used in the calculation -> ");
            num1 = userInput.next();
            System.out.print("Please enter the second number to be used in the calculation -> ");
            num2 = userInput.next();

            long sum = Calculator.addNums(num1, num2);
            int multiplication = Calculator.multiNums(Integer.parseInt(num1), Integer.parseInt(num2));
            int division = Calculator.divideNums(num1, num2);

            // Display the results
            System.out.printf("Calculation Results\n----------------------------\n%s + %s = %d\n%s * %s = %d\n%s \\ %s = %d\n----------------------------\n",
                    num1, num2, sum, num1, num2, multiplication, num1, num2, division);
        } catch (NumberFormatException nfe)
        {
            System.err.println("NumberFormatException: " + nfe.getMessage());
        } catch (ArithmeticException ae)
        {
            System.err.println("ArithmeticException: " + (ae.getMessage() != null ? ae.getMessage() : "Sorry, you gave us 0 for the denominator, which will lead to division errors. Please provide a non-zero value, e.g., 5"));
        }
    }
} // End of class DemoArithmeticAndNumberFormatExceptions

class Calculator
{

    public static long addNums(String num1, String num2) throws NumberFormatException
    {
        // Check that both num1 & num2 strings can be converted to numbers
        if (!num1.matches("\\d+"))
        {
            throw new NumberFormatException("The first value given is not a valid number. Please enter a numeric value.");
        }

        if (!num2.matches("\\d+"))
        {
            throw new NumberFormatException("The second value given is not a valid number. Please enter a valid numeric value.");
        }

        return Integer.parseInt(num1) + Integer.parseInt(num2);
    }

    public static int multiNums(int num1, int num2) throws ArithmeticException
    {
        if (num2 == 0)
        {
            throw new ArithmeticException();
        } else
        {
            return num1 * num2;
        }
    }

    public static int divideNums(String num1, String num2) throws NumberFormatException, ArithmeticException
    {
        if (!num1.matches("\\d+") || !num2.matches("\\d+"))
        {
            throw new NumberFormatException("One of the values given is not a valid number. Please enter a valid number.");
        }

        if (Integer.parseInt(num2) == 0)
        {
            throw new ArithmeticException("Sorry, you gave us 0 for the denominator, which will lead to division errors. Please provide a non-zero value.");
        }

        return Integer.parseInt(num1) / Integer.parseInt(num2);
    }
}
