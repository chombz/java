package com.chombz.j02_datatypes;

import java.util.Scanner;

/**
 * Java program to demonstrate the use of constants and variables
 *
 * @author e.chomba
 */
public class constant_and_variables
{

    /**
     * declare a class variable that will be used to get input from the user
     */
    static Scanner userInput = new Scanner(System.in);

    //main method begins program execution
    public static void main(String[] args)
    {
        //declare PI as a constant
        final float MY_PI = 3.14159265f;

        //promt the user tor the radius of the circle
        System.out.println("Please enter the radious of the circle in cm. -> ");
        int radius = userInput.nextInt();//read in the radius of the circle
        userInput.close();//close the input

        //calculate the area and circumference of the cirle
        float area = MY_PI * radius * radius;
        float circumference = MY_PI * (radius * 2);

        //Display the results
        System.out.printf("The value of the byte is : %09.8f\n", MY_PI);
        System.out.printf("The value of the byte is : %08dcm.\n", radius);
        System.out.format("The value of the byte is : %-9.2f cm2.%n", area);
        System.out.format("The value of the byte is : %-9.2f cm.%n"
                            , circumference); 
            
    }
}
