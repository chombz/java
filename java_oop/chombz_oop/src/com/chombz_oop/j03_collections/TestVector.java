package com.chombz_oop.j03_collections;

import java.util.Collections;
import java.util.Comparator;
import java.util.Vector;

 

/**
 * Java class to demonstrate the vector class and some of its methods.
 * 
 * @author Nyanjui
 */
public class TestVector
{
    //main method begins program execution
    public static void main(String[] args)
    {
        //Create and instantiate a vector
        Vector<String> vecItems = new Vector<>();
        //Add items to the Vector object
        vecItems.addElement("Susan");
        vecItems.add("Mary");
        vecItems.add("Rose");
        vecItems.add("22");
        vecItems.add("Jambres");
        vecItems.add("Darell");
        
        //Display the elements of the Vector object
        System.out.println("The elements/items in the vecItems vector are: ");
        for(String vecItem : vecItems)
        {
            System.out.println(vecItem);
        }
        
        //Sort the elements in the Vector in descending order using a 
        //comparator
        Comparator itemComparator = Collections.reverseOrder();
        Collections.sort(vecItems,itemComparator);
        //Display the elements in the Vector in descending/reverse order
        System.out.println("\nThe elements in the vecItem in descending order "
                + "are: ");
        vecItems.forEach((vi -> 
        {
            System.out.println(vi);
        }));
        
        //Sort & display the Items in the vector in ascending order
        Collections.sort(vecItems);
        //Display the elements in the Vector in ascending order
        System.out.println("\nThe elements in the vecItem in descending order "
                + "are: ");
        vecItems.forEach((vi -> 
        {
            System.out.println(vi);
        }));
        
        //Sort the varItems in ascending order
        
       //Collections.sort(vecItems,Collections.reverseOrder().reversed());
    }
    
}