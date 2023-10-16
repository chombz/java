package com.chombz.j15_functionalprogramming;

/**
 * Functional Java interface with an abstract and default method implementation
 * @author chomb
 */
public interface IStaticDefault
{
    public void greetUser(String username);
    
    public default void calcResults(int num1, int num2) throws ArithmeticException
    {
        System.out.printf("Results of different arthmetic operators"
                         + "\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"
                         + "\nAddition: %d + %d = %d"
                         + "\nMultiplication: %d * %d = %d"
                         + "\nSubtraction: %d - %d = %d"
                         + "\nDivision: %d %c %d = %d"
                         + "\nModulus/Reminder: %d %% %d = %d"
                         + "\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n",
                         num1, num2, num1 + num2,
                         num1, num2, num1 * num2,
                         num1, num2, num1 - num2,
                         num1, '\u00f7', num2, num1 / num2,
                         num1, num2, num1 % num2);
    }
}
