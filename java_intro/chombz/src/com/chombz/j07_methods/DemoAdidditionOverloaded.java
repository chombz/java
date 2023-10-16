package com.chombz.j07_methods;

/**
 * Java program to test overloaded add methods in AdditionOverloaded class
 * @author chomb
 */
public class DemoAdidditionOverloaded 
{

    /**
     * Main method begins program execution
     * @param args
     */
    public static void main(String[] args) 
    {
        //Variables
        AdditionOverloaded addition1 = new AdditionOverloaded(); 
        int num1 = 5, num2 = 4, otherNum = 11;
        float num3 = 8;
        long num4 = 7;
        
        //Get and display the sum of two ints using the addnums(int, int) method
        float total = addition1.addNums(num1, num2);
        System.out.format("The sum of %d and %d is %.0f.%n", num1, num2, total);
        
        //Get and display the sum of three int using the addnums(int, int, int) method
        total = addition1.addNums(num1, num2, otherNum);
        System.out.format("The sum of %d, %d and %d is %.0f.%n", num1, num2,
                         otherNum, total);
        
        //Get and display the sum of a float & a long using the addNums(float, long) method
        total = addition1.addNums(num3, num4);
        System.out.format("The sum of %.0f and %d is %.0f.%n", num3, num4, 
                          total);
        
        //Get and Display the sum of the first 10 integers using
        //addNums(float...nums)
        total = addition1.addNums(1,2,3,4,5,6,7,8,9,10);
        System.out.format("The sum of the first ten intergers is %.0f.%n", 
                         total);
    }
    
}
