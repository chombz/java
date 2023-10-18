package com.chombz_oop.j01_exceptions_and_assertions;

import java.util.Scanner;

/**
 * Java program to demonstrate the use of programming assertions
 *
 * @author chomb
 */
public class AssertionDemo
{

    //main program begins with program execution
    public static void main(String[] args)
    {
        try (Scanner userInput = new Scanner(System.in))
        {
            //Variable to hold the user's score in an exam
            byte score;
            //prompt the user for a score betwen 0-100
            System.out.println("Please enter the student\'s score -> ");
            score = userInput.nextByte();

            //Assert that score should be >= 0 and <= 100
            assert (score >= 0 && score <= 100) : "Invalid Score : " + score
                    + " entered.";

            //Display the score
            System.out.println("The Student SCored " + score
                    + "% in the exam.");
        } catch (NumberFormatException nfe)
        {
            System.err.println("Sorry, you entered an invalid score.\n"
                    + "Please enter values from 0 - 100.");
        } catch (ArithmeticException e)
        {
            System.err.println("Sorry, the error " + e.getLocalizedMessage()
                    + " occured");

        }
    }
}
