package com.chombz_oop.j11_design_pattern;

/**
 * Java program to demonstrate the singleton design pattern using the
 * Customer-Assistant class
 *
 * @author chomb
 */
public class DemoCustomerAssistant
{

    public static void main(String[] args)
    {
        // Declare 2 objects of the Customer assistance class
        CustomerAssistant cal1, cal2;

        // Get instances of the customer assistance class
        cal1 = CustomerAssistant.getInstance();
        cal2 = CustomerAssistant.getInstance();

        // Check if cal1 and cal2 are the same instance
        if (cal1 == cal2)
        {
            System.out.println("cal1 and cal2 are the same instance, which is a Singleton.");
        } else
        {
            System.out.println("cal1 and cal2 are different instances, which is an error.");
        }
    }
}
