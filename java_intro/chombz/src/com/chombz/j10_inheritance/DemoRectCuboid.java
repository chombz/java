package com.chombz.j10_inheritance;

import java.util.Scanner;

/**
 * Display rectangle and cuboid in the demo
 * @author chomb
 */
public class DemoRectCuboid
{

    static Scanner userInput = new Scanner(System.in);
    
    /**
     * Main method begins with program execution
     * @param args
     */
    public static void main(String[] args)
    {
        // Variables
        Rectangle rect1;
        Cuboid cuboid;
        int length, width, breadth;

        // Prompt the user for the dimensions of rect1
        System.out.println("Please enter the length of rect1 in cm -> ");
        length = userInput.nextInt();
        System.out.println("Please enter the width of rect1 in cm -> ");
        width = userInput.nextInt();
        userInput.nextLine();  // Consume the newline character

        // Create the Rectangle object and set its dimensions
        rect1 = new Rectangle(length, width);

        // Prompt the user for the breadth of the cuboid
        System.out.println("Please enter the breadth of the cuboid in cm -> ");
        breadth = userInput.nextInt();

        // Create the Cuboid object with the user's dimensions
        cuboid = new Cuboid(length, width, breadth);

        // Display the dimensions of the shapes
        rect1.displayDimensions("Rectangle");
        cuboid.displayDimensions("Cuboid");

        // Close the scanner
        userInput.close();
    }
}
