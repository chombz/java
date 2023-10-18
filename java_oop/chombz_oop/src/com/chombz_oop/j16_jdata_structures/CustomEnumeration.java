package com.adse2105.sess16_java_data_structures;

import java.lang.reflect.Array;
import java.util.Enumeration;

/**
 * Java program that demonstrates the implementation of the
 * java.util.Enumeration interface
 *
 * @author e.chomba
 */
public class CustomEnumeration implements Enumeration<Object>
{

    //instance fields
    private final int arraySize;
    private int arrayCursor;
    private final Object array;

    public CustomEnumeration(Object array)
    {
        this.array = array;
        this.arraySize = Array.getLength(array);
    }

    @Override
    public boolean hasMoreElements()
    {
        return (arrayCursor < arraySize);
    }

    @Override
    public Object nextElement()
    {
        return Array.get(array, arrayCursor++);
    }

    //main method begins program execution
    public static void main(String[] args)
    {
        //Declare an array of strings
        String[] strArray = new String[]
        {
            "One", "Two", "Three", "Four", "Five"
        };
        Enumeration<Object> customEnum = new CustomEnumeration(strArray);

        //Display the items in the custom enumeration
        while (customEnum.hasMoreElements())
        {
            System.out.println(customEnum.nextElement());
        }
    }
}
