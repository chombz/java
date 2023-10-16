package com.chombz.j07_methods;

/**
 * Java class to demonstrate method overloading using an overloaded addition
 * @author chomb
 */
public class AdditionOverloaded 
{
    
    /**
     * Method to ad  two integers and return their sum
     * @param num1 first value t
     * @param num2
     * @return 
     */
    public float addNums(int num1, int num2)
    {
        return num1 + num2;
    }
    
    /**
     * 
     * @param num1
     * @param num2
     * @param num3
     * @return 
     */
    public float addNums(int num1, int num2, int num3)
    {
        return num1 + num2 + num3;
    }
    
    /**
     * 
     * @param num1
     * @param num2
     * @return 
     */
    public float addNums(float num1, long num2)
    {
        return num1 + num2;
    }
    
    /**
     * 
     * @param nums a float array of the numbers to be added
     * @return the sum of the numbers passed 
     */
    public float addNums(float...nums)
    {
        float sum = 0;
        //Add the numbers in the nums array using a for...each loop
        for(float num : nums)
        {
            sum += num;
        }
        return sum;
    }
        
}
