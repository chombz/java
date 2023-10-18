package com.chombz_oop.j03_collections;

import java.util.ArrayDeque;
import java.util.Iterator;

/**
 * Java program that demonstrate how the ArrayDeque class works. This sample
 * uses an ArrayDeque with type parameters.
 * @author chomb
 */
public class ArrayDequeParamSample
{
       public static void main(String[] args)
    {
        //Create and instantiate an ArrayDeque object
        ArrayDeque progLanguages = new ArrayDeque();
        /*Add various programming languates into a non-parameterised
            ArrayDeque object using its various methods
        */
        progLanguages.add("Java");
        progLanguages.offer("Visual Basic");//Added after JAVA
        progLanguages.offerLast("C++");//Added at the end
        progLanguages.offerFirst("C");//Inserted before JAVA
        progLanguages.addFirst("C#");//Inserted before C
        
        //Display the object ;aunguages in the ArrayDeque as added
        //inserted shove
        System.out.println("Display programing language as added to the "
                          + "ArrayDeque\n");
        
        
        int e = 0;
        for (Object progLanguage : progLanguages)
        {
            System.out.printf("Object at index %d -> %s \n", e, progLanguage);
            e++;
        }
        
        //Display the programming Languages in reverse order using a 
        //decending iterator
        Iterator itrProLang = progLanguages.descendingIterator();
        e = 0;//Reset looping variable to 0
        while(itrProLang.hasNext())
        {
            System.out.printf("Object at index %d -> %s\n", e, 
                              itrProLang.next());
        }
        
        //Display the first and last elements in the ArrayDeque without
        //removing them from
        System.out.printf("\nThe first element in the ArrayDeque is: %s."
                         + "\nThe last element in the ArrayDeque is : %s\n\n",
                         progLanguages.peekFirst(), progLanguages.peekLast());
        
        //Add more elements to the ArrayDeque
        progLanguages.push("Python");//Inserted at the first position
        progLanguages.add("Flutter & Dart");
        progLanguages.add("JavaScript");
        
        
        //Display all the elements after Addition to the Array
        e = 0;
        for (Object progLanguage : progLanguages)
        {
            System.out.printf("Object at index %d -> %s \n", e, progLanguage);
            e++;
        }
        
        
        //Remove and display the first and last elements in the ArrayDeque
        System.out.printf("\nRemoving the first element: %s"
                         + "\nRemoving the last elements: %s\n",
                         progLanguages.pollFirst(), progLanguages.peekLast());
    } 
}
