package com.chombz.j03_variables_operators;

/**
 * Java program to demonstrate comparison operators in Java
 * 
 * @author e.chomba
 */
public class ComparisionOperators
{
    /**
     * Main method begins program execution
     * @param args
     */
    public static void main(String[] args)
    {
        //Variables to be used in the program
        int firstNum = 5, 
            secondNum = 8, 
            thirdNum = firstNum;
        
        //compare the above 3 numbers and display them 
        System.out.println("Number comparision between 5, 8 and 5");
        System.out.printf("%d > %d is %b\n",firstNum, secondNum,(firstNum > secondNum));
        System.out.printf("%d < %d is %b\n",firstNum, secondNum,(firstNum < secondNum));
        System.out.printf("%d >= %d is %b\n",firstNum, secondNum,(firstNum >= secondNum));
        System.out.printf("%d <= %d is %b\n",firstNum, secondNum,(firstNum <= secondNum));
        System.out.printf("%d == %d is %b\n",firstNum, secondNum,(firstNum == secondNum));
        System.out.printf("%d != %d is %b\n",firstNum, secondNum,(firstNum != secondNum));       
    }  
}
