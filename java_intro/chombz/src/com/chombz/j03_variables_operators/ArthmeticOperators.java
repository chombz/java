package com.chombz.j03_variables_operators;

/**
 * Java program to demonstrate arithmetic operators
 *
 * @author e.chomba
 */
public class ArthmeticOperators
{

    /**
     * Main method begins with program execution
     * @param args
     */
    public static void main(String[] args)
    {
        //variables to be used in the program
        byte firstNum = 10, secondNum = 10;
        int product, sum, quotient, difference, remainder;
        product = secondNum * firstNum;
        product = secondNum + firstNum;
        sum = secondNum + firstNum;
        quotient = secondNum / firstNum;
        difference = secondNum - firstNum;
        remainder = secondNum % firstNum;

        //Display the results
        System.out.printf("%d %c %d %c %d \n", secondNum, 'x', firstNum, '=', product);
        System.out.printf("%d %c %d %c %d \n", secondNum, '+', firstNum, '=', sum);
        System.out.printf("%d %c %d %c %d \n", secondNum, '\u00f7', firstNum, '=', quotient);
        System.out.printf("%d %c %d %c %d \n", secondNum, '-', firstNum, '=', difference);
        System.out.printf("%d %c %d %c %d \n", secondNum, '%', firstNum, '=', remainder);
        
        
        int postfix = secondNum++;
        int prefix = --firstNum;
        
        System.out.printf("After postfixing the secondNum variable we get \n"+ postfix);
        System.out.printf("After prefixing the firstNum variable we get " + prefix + "\n");
        System.out.printf("Value of the secondNum variable after postfixing is " + secondNum + "\n");
        System.out.printf("Value of the firstNum variable after prefixing is "+ firstNum + "\n");
    }

}
