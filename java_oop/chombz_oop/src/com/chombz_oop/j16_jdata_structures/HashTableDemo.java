package com.chombz_oop.j16_jdata_structures;

import java.util.Enumeration;
import java.util.Hashtable;

/**
 * Java program that demonstrates the java.util.HashTable class and some of its
 * methods.
 *
 * @author e.chomba
 */
public class HashTableDemo
{
    //Class method to create and initialise a HashTable object

    private static Hashtable initialiseHashtable()
    {
        Hashtable hTable = new Hashtable();
        //Add the 7 days of the week
        hTable.put("1", "Sunday");
        hTable.put("2", "Monday");
        hTable.put("3", "Tuesday");
        hTable.put("4", "Wednesday");
        hTable.put("5", "Thursday");
        hTable.put("6", "Friday");
        hTable.put("7", "Saturday");
        return hTable;
    }

    //main method begins program execution
    public static void main(String[] args)
    {
        //Declare and initialise a Hashtable of weekdays
        Hashtable days = HashTableDemo.initialiseHashtable();
        Enumeration e = days.keys();

        //Display the weekday keys and their corresponding values
        System.out.println("The weekday key-value pairs are: ");
        while (e.hasMoreElements())
        {
            String key = (String) e.nextElement();
            System.out.println(key + " : " + days.get(key));
        }

        //set the enumerator to the key values
        e = days.keys();
        //Display the weekday keys only
        System.out.println("\nThe weekday keys are: ");
        while (e.hasMoreElements())
        {
            System.out.println(e.nextElement());
        }

        //set the enumerator to the weekday values
        e = days.elements();
        //Display the weekday values only
        System.out.println("\nThe weekday values are: ");
        while (e.hasMoreElements())
        {
            System.out.println(e.nextElement());
        }
    }
}
