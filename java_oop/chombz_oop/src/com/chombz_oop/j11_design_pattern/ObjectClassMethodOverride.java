package com.chombz_oop.j11_design_pattern;

import java.util.HashSet;
import java.util.Set;

/**
 * Java program to demonstrate how to override the methods of the object class.
 * @author chomb
 */
public class ObjectClassMethodOverride
{
    //variables
    static Set<String> productIDs = new HashSet<>();
    
    //Override the equals method
    @Override
    public boolean equals(Object O)
    {
        return productIDs.add((String) O);
    }
    
    //Override the toString()
    @Override
    public String toString()
    {
        StringBuilder productDetail = new StringBuilder();
        int e = 0;//for display purpose
        for (String productID : productIDs)
        {
            productDetail.append(++e).append(".\t").append(productID)
                         .append("\n");
        }
        return productDetail.toString();
    }
        
    //main methid begins program exectuion
    public static void main(String[] args)
    {
         //Add productIDs tp the productIDs set
         productIDs.add("58-8121464");
         productIDs.add("03-0750974");
         productIDs.add("00-3016562");
         productIDs.add("58-4872733");
         productIDs.add("23-6087407");
         productIDs.add("67-9602049");
         productIDs.add("34-5169030");
            
        //create and instantiate an intstance of the objectClassMethodOverride class
        ObjectClassMethodOverride ocmo = new ObjectClassMethodOverride();
        
        //try to add an existing id to the productID set
        boolean addResult = ocmo.equals(("23-6087407"));
        
        //inform the user wheather the addition was successful or not
        if(addResult)
            System.out.printf("The product ID %s was successfully added to "
                              + "the set.\n",("23-6087407"));
        else
            System.err.printf("Sorry the product ID %s already exists in the "
                             + "set.\nPlease try using different product ID.\n",
                             ("23-6087407"));
        
        //use the override toString() to display the existing product ID's
        System.out.printf("NO. \tProduct ID\n%s", ocmo.toString());
    }
}
