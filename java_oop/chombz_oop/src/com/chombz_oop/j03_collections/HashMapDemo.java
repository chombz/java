package com.chombz_oop.j03_collections;

import java.util.HashMap;
import java.util.Map;

/**
 * Java program that demonstrates the HashMap with fruits. Author: e.chomba
 */
public class HashMapDemo
{

    // Main method begins program execution
    public static void main(String[] args)
    {
        // Create a Map to store numbers and their corresponding fruits
        Map<Integer, String> fruitMap = new HashMap<>();

        // Populate the fruitMap with elements (fruits)
        fruitMap.put(5, "Avocado");
        fruitMap.put(10, "Apple");
        fruitMap.put(4, "Mango");
        fruitMap.put(7, "Pineapple");
        fruitMap.put(9, "Orange");
        fruitMap.put(6, "Banana");
        fruitMap.put(12, "Guava");
        fruitMap.put(8, "Kiwi");
        fruitMap.put(17, "Tangerine");
        fruitMap.put(3, "Watermelon");
        fruitMap.put(32, "Pear");
        fruitMap.put(2, "Blueberries");

        // Display the contents of the fruitMap
        displayFruits(fruitMap);

        // Display the fruit at a given position
        System.out.println("The fruit at number 8 is: " + fruitMap.get(8));

        // Remove and display the fruit at a given location
        String removedFruit = fruitMap.remove(6);
        System.out.println("The removed fruit is: " + removedFruit);

        // Replace a fruit at a given position (e.g., replace Avocado with Dragon Fruit)
        fruitMap.replace(5, "Dragon Fruit");

        // Display the updated fruit map
        displayFruits(fruitMap);
    }

    // Helper method to display the contents of the fruitMap
    public static void displayFruits(Map<Integer, String> fruitMap)
    {
        for (Map.Entry<Integer, String> entry : fruitMap.entrySet())
        {
            System.out.println("Number: " + entry.getKey() + ", Fruit: " + entry.getValue());
        }
    }
}
