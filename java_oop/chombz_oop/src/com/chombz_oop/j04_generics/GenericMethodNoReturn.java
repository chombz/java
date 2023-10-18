package com.chombz_oop.j04_generics;

/**
 * Java program that demonstrates a generic method that doesn't return a value
 *
 * @author chomb
 */
public class GenericMethodNoReturn
{

    public static <E> void displayArray(E[] arrayElements)
    {
        //use for...each loop to display array elements
        for (E arrayElement : arrayElements)
        {
            System.out.print(arrayElement + ", ");
        }
        System.out.println();
    }

    //main method begins program execution
    public static void main(String[] args)
    {
        Integer intArray[] =
        {
            100, 200, 300, 400, 500, 700
        };

        Double doubleArray[] =
        {
            51.1, 52.2, 53.3, 54.4, 55.5
        };

        Character charArray[] =
        {
            '3', 'A', 'V', 'A', 'B'
        };

        String strArray[] =
        {
            "Mango", "Avocado", "\nBlueberries", "\nKiwi", "Apple"
        };

        //Display the contents of the above array
        System.out.println("The contents of the interger array are: ");
        displayArray(intArray);
        System.out.println("\nThe contents of the Double array are: ");
        displayArray(doubleArray);
        System.out.println("\nThe contents of the Character array are: ");
        displayArray(charArray);
        System.out.println("\nThe contents of the String array are: ");
        displayArray(strArray);

    }
}
