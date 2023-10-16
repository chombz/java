package com.chombz.j07_methods;

/**
 * Java program with methods to perform 
 * @author chomb
 */
public class SimpleMath 
{
    public long addNums(int num1, int num2)
    {
        long ans = num1 + num2;
        return ans;
    }
    
    public long multiplyNums(int num1, int num2)
    {
        long ans = num1 * num2;
        return ans;
    }
    
    public int subtractions(int num1, int num2)
    {
        return num1 - num2;
    }
    
    public int divideNums(int num1, int num2)
    {
      //check if the denominator is to prevent division by a error
        if (num2 == 0)
        {
            System.out.println("Sorry, you entered a 0 \"zero\" as a "
                              + "denominator whcich will lead to division"
                              + " errors. \nPlease enter a non-zero "
                              + "denominator");
            System.exit(1);
        }
        return num1 / num2;
    }
    
    public int getReminder(int num1, int num2)
    {
        return num1 % num2;
    }
}
