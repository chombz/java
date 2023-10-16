package com.chombz.j03_variables_operators;

import java.util.Scanner;

/**
 * Java program that converts Degrees Fahrenheit to Degrees Celsius.
 * 
 * @author chombz
 */
public class Fahrenheit2Celsius 
{
    /**
     * Main method begins with program execution
     * @param args
     */
    public static void main(String[] args) 
    {
        // Variables
        double fahrenheit; // Changed the data type to double to allow decimal values
        double celsius;
        
        // Create a Scanner object to get user input
        try (Scanner userInput = new Scanner(System.in))
        {
            // Tell the user to enter a number
            System.out.println("Enter a temperature in Fahrenheit to convert to Celsius: ");
            fahrenheit = userInput.nextDouble(); // Read a double input from the user
            
            // Convert Fahrenheit to Celsius
            celsius = (fahrenheit - 32) * 5/9;
            
            // Display the result
            System.out.println(fahrenheit + " Fahrenheit is equivalent to " + celsius + " Celsius.");
        }
    }
}
