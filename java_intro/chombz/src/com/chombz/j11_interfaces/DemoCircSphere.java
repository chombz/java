package com.chombz.j11_interfaces;

import java.util.Scanner;

/**
 * Java Program that will be used to demonstrate inheritance using abstract
 * classes and interfaces using the circle and sphere classes
 *
 * @author chomb
 */
public class DemoCircSphere
{

    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args)
    {
        // Variables
        int radius;
        Circle circ1;
        Sphere sphere1;

        // Prompt the user for the radius of the circle
        System.out.print("Please enter the radius of the circle in cm -> ");
        radius = Integer.parseInt(userInput.next());

        // Instantiate the circle with the radius given by the user
        circ1 = new Circle(radius);

        // Display the circle's dimensions using the displayDimensions method
        circ1.displayDimensions("Circle");
        
        // Prompt the user for the radius of the sphere
        System.out.print("Please enter the radius of the sphere in cm -> ");
        radius = Integer.parseInt(userInput.next());

        // Instantiate the sphere with the radius given by the user
        sphere1 = new Sphere(radius);
        
        // Display the sphere's dimensions using the displayDimensions method
        sphere1.displayDimensions("Sphere");
    }
}
