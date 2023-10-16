package com.chombz.j02_datatypes;

import java.util.Scanner;

/**
 * Java program that demonstrates ho to format your output and some
 * in-built Java API methods.
 * 
 * @author e.chomba
 */
public class OutputFormatting 
{
    static Scanner userInput = new Scanner (System.in);
   //main method begins program execution
    public static void main(String[] args)
    {      
        //use the in-built value of PI and cast it to a float since it
        //is a double by default
        final float MY_PI =(float) Math.PI;
        
    
        //prompt the user for the radius of the circle
        System.out.println("Please enter the radious of the circle in cm. -> ");
        int radius = userInput.nextInt();//read in the radius of the circle
        userInput.close();//close the input
        
        //calculate the area and circumference of the cirle
        float area = MY_PI * radius * radius;
        float circumference = MY_PI * (radius *2);
        
        //Display the results
        System.out.println("The value of MY_PI is: " + MY_PI);
        System.out.println("The radius of the circle is: " + radius + " cm.");
        System.out.println("The area of the circle is: " + area + " cm2.");
        System.out.println("The circumference of the circle is : " +
                            circumference + " cm.");
    }

}
