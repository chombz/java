package com.chombz.j11_interfaces;

import java.util.Scanner;

/**
 * Java program to demonstrate how to create and work with anonymous classes
 * @author chomb
 */
public class AnonymousClassDemo
{

    static Scanner userInput = new Scanner(System.in);

    /**
     * Main method begins with program execution
     * @param args
     */
    public static void main(String[] args)
    {
        // Variables
        I3DShape cone = new I3DShape()
        {
            int radius, height;
            float slantHeight;

            @Override
            public float calcVolume()
            {
                //Prompt the user for the height and radius of the cone 
                System.out.println("Please enter the radius of the cone in "
                        + "cm -> ");
                radius = userInput.nextInt();
                System.out.println("Please enter the height of the cone in "
                        + "cm -> ");
                height = userInput.nextInt();
                        
                userInput.close();

                float volume = (float) (Math.PI * Math.pow(radius, 2) * height)
                        / 3.0f;
                float surfaceArea = (float) (Math.PI * Math.pow(radius, 2)
                        + (Math.PI * radius * slantHeight));
                
                
            //Display the cone's dimensions
            System.out.printf("\nCone\'s Dimensions"
                             + "\n--------------------------"
                             + "\nRadius of the cone: %d cm."
                             + "\nHeight of the cone: %d cm."
                             + "\nSlant height of the cone: %.1f cm"
                             + "\nSurface Area of the sphere: %.2f cm2"
                             + "\nVolume of the sphere %.2f cm3"
                             + "\n----------------------------\n",
                             this.radius, this.height, this.slantHeight, 
                             surfaceArea, volume);
            return volume;
            }
        };

        //Display the result to the calculations
        cone.calcVolume();
    }

}
