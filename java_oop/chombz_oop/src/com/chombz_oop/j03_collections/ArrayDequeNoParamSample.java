package com.chombz_oop.j03_collections;

import java.util.ArrayDeque;
import java.util.Iterator;


/**
 * Java program that demonstrate how the ArrayDeque class. This sample uses an
 * ArrayDeque without parameters.
 *
 * @author chomb
 */

public class ArrayDequeNoParamSample
{

    public static void main(String[] args)
    {
        // Create and instantiate an ArrayDeque object with a specified type (String)
        ArrayDeque<String> progLanguages = new ArrayDeque<>();

        // Add various programming languages into the ArrayDeque using its methods
        progLanguages.add("Java");
        progLanguages.offer("Visual Basic");
        progLanguages.offerLast("C++");
        progLanguages.offerFirst("C");
        progLanguages.addFirst("C#");

        // Display the programming languages as they were added
        System.out.println("Display programming languages as added to the ArrayDeque:");
        for (String progLanguage : progLanguages)
        {
            System.out.println(progLanguage);
        }

        // Display the programming languages in reverse order using a descending iterator
        System.out.println("Display programming languages in reverse order:");
        Iterator<String> itrProLang = progLanguages.descendingIterator();
        while (itrProLang.hasNext())
        {
            System.out.println(itrProLang.next());
        }

        // Display the first and last elements in the ArrayDeque without removing them
        System.out.println("The first element in the ArrayDeque is: " + progLanguages.getFirst());
        System.out.println("The last element in the ArrayDeque is: " + progLanguages.getLast());
    }
}
