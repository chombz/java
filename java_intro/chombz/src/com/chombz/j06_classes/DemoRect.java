package com.chombz.j06_classes;

import java.util.Scanner;

/**
 * Java class that will be used to demonstrate the Rect class.
 *
 * @author chomb
 */
public class DemoRect
{

    // Main method begins program execution
    public static void main(String[] args)
    {
        // Variables to be used in the program
        Scanner userInput = new Scanner(System.in);
        Rect rect1, rect2;

        // Get the dimensions of the first rectangle from the user
        System.out.println("Please enter the length of rectangle 1 in cm -> ");
        int length1 = userInput.nextInt();
        System.out.println("Please enter the width of rectangle 1 in cm -> "); // Fixed the typo here
        int width1 = userInput.nextInt();

        // Instantiate the first rectangle with the no-argument constructor
        rect1 = new Rect();

        // Set the dimensions using the setters (mutators)
        rect1.setLength(length1);
        rect1.setWidth(width1);

        // Get the dimensions of the second rectangle from the user
        System.out.println("Please enter the length of rectangle 2 in cm -> ");
        int length2 = userInput.nextInt();
        System.out.println("Please enter the width of rectangle 2 in cm -> "); // Fixed the typo here
        int width2 = userInput.nextInt();

        // Instantiate the second rectangle with the parameterized constructor
        rect2 = new Rect(length2, width2);

        // Close the Scanner to free up resources
        userInput.close();

        // Now you can perform operations and display information about rect1 and rect2
        rect1.displayDimension();
        rect2.displayDimension();
    }
}
