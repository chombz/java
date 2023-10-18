package com.chombz_oop.j02_lang_and_regex;

import java.util.regex.Pattern;

/**
 * Java program that demonstrates how to split a string a specified
 * delimiter
 * @author chomb
 */
public class SystemSplitDemo
{
    //Class constant fields
    public static final String DElIMITER = ",";
    public static final String INPUT = "Mango, Apple, Kiwi, Orange, Peach, "
                                    + "Banana, Avocado, Guava, Blueberries, "
                                    + "WaterMelon"; 

    //main program begins program excution
    public static void main(String[] args)
    {
        //Variables
        Pattern p = Pattern.compile(DElIMITER);
        String[] fruits = p.split(INPUT);
        
        //Display the fruits: one on eahc line
        for (String fruit : fruits)
        {
            System.out.println(fruit);
        }
    }
    
}
