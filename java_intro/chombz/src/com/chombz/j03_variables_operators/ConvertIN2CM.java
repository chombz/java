package com.chombz.j03_variables_operators;

import java.util.Scanner;

/**
 * Java program that convert Inches to CM.
 * @author chomb
 */
public class ConvertIN2CM 
{
    static Scanner userInput = new Scanner (System.in);
     // Main method begins with program execution
    public static void main(String[] args) 
    {
        //variables
        int userInch;
        Scanner userInput = new Scanner(System.in);
        
        //Tell user to enter number
        System.out.println("Enter a number it can convert from Inches to CM");
        int centimeters = userInput.nextInt();

        //convert number user entered into CM.
        int inches = (int) (centimeters * 2.54);
        System.out.println(inches + " Inches");
        userInput.close();//close
    }

}
