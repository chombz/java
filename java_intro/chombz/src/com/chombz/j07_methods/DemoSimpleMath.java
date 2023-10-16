package com.chombz.j07_methods;


/**
 * JAva program to test methods in the simple class
 * @author chomb
 */
public class DemoSimpleMath
{

    /**
     * Main method begins program execution
     */
    public static void main(String[] args)
    {
        //Variables 
        int num1 = 8, num2 = 5;
        long sum, product;
        int difference, quotient, remainder;
        
        //Declare and instanciante a SimpleMath
        SimpleMath sm = new SimpleMath();
        sum = sm.addNums(num1, num2);
        product = sm.multiplyNums(num1, num2);
        difference = sm.subtractions(num1, num2);
        quotient = sm.divideNums(num1, num2);
        remainder = sm.getReminder(num1, num2);
        
        //display the results
        System.out.printf("Results of different arthmetic operators"
                         + "\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"
                         + "\nAddition: %d + %d = %d"
                         + "\nMultiplication: %d * %d = %d"
                         + "\nSubtraction: %d - %d = %d"
                         + "\nDivision: %d %c %d = %d"
                         + "\nModulus/Reminder: %d %% %d = %d"
                         + "\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n",
                         num1, num2, sum,
                         num1, num2, product,
                         num1, num2, difference,
                         num1, '\u00f7', num2, quotient,
                         num1, num2, remainder);
        
        
    }
    
}
