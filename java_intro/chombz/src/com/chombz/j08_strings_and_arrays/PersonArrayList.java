package com.chombz.j08_strings_and_arrays;

import java.util.ArrayList;

/**
 * Java program that demonstrates the ArrayList class and some of its methods
 * and the use of the Person class.
 *
 * @author chomb
 */
public class PersonArrayList
{

    public static void main(String[] args)
    {
        // Create an ArrayList of Persons
        ArrayList<Person> psn = new ArrayList<>();

        // Initialize the list by adding Person objects to it
        psn.add(new Person("John", 'M', (byte) 22));
        psn.add(new Person("Percy", 'M', (byte) 30));
        psn.add(new Person("Belinda", 'F', (byte) 24));
        psn.add(new Person("Mark", 'M', (byte) 28));
        psn.add(new Person("Alvin", 'M', (byte) 22));
        psn.add(new Person("Victor", 'M', (byte) 21));
        psn.add(new Person("Maryam", 'F', (byte) 25));
        psn.add(new Person("Rajal", 'M', (byte) 22));
        psn.add(new Person("Sally", 'F', (byte) 24));

        // Display the list of persons in a table format
        displayPersonList(psn);

        // Add two more Person objects to the list
        System.out.println("\nAdding two more persons to the list...");
        psn.add(new Person("Veronica", 'F', (byte) 27)); // Adding to the end of the list
        psn.add(2, new Person("Wanger", 'F', (byte) 34)); // Inserting at a specific position in the list

        // Display the updated list of persons after adding two persons
        System.out.println("\nThe new list of persons after adding is: ");
        displayPersonList(psn);

        // Remove a Person from the list
        psn.remove(5); // Removes the Person at index 5
        System.out.println("\nAfter removing a person, the updated list is: ");
        displayPersonList(psn);
    }

    // Method to display the list of persons in a table format
    public static void displayPersonList(ArrayList<Person> psn)
    {
        System.out.println("\nList of Persons:\n");
        System.out.format("%-20s %-10s %s%n", "Name", "Age", "Gender");
        System.out.println("-------------------------------");
        for (Person person : psn)
        {
            System.out.format("%-20s %-10d %s%n", person.getName(), person.getAge(), (person.getGender() == 'M' ? "Male" : "Female"));
        }

        // Display the number of persons in the list
        System.out.println("-------------------------------");
        System.out.println("\nThe number of persons in the ArrayList is: " + psn.size());
    }
}
