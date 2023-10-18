package com.chombz_oop.j11_design_pattern;

/**
 * Java class that demonstrates how to work with the Singleton design pattern
 * to ensure only one instance of a class exists.
 * @author chomb
 */
public class CustomerAssistant
{
    //Declare a private class instance
    private static CustomerAssistant ca = null;
    
    //private constructor
    private CustomerAssistant(){}
    
    //Class method to return the only instance of the CustomerAsssistant ckass
    public static CustomerAssistant getInstance()
    {
        if(ca == null)
        {
            System.out.println("The customer assistant is initialised and ready"
                              + " to serve!");
            ca = new CustomerAssistant();
        }
        else
        {
            System.err.println("Sorry the customer assistant is currently"
                              + " assisting another client. \nPlease wait and "
                              + "you'll be assised shortly");
        }
        return ca;
    }
}
