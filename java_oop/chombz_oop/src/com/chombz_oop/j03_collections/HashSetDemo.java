package com.chombz_oop.j03_collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Java program to demonstrate the Set interfaces, its HashSet implementation
 * and some of its methods
 * @author e.chomba
 */
public class HashSetDemo
{

    public static void main(String[] args)
    {
        // Create a set of student names for the Design class
        Set<String> designClass = new HashSet<>();

        // Populate the design class with students
        designClass.add("James");
        designClass.add("Paul");
        designClass.add("Oliver");
        designClass.add("Katherine");
        designClass.add("Thomas");
        designClass.add("Ben");
        designClass.add("Steve");
        designClass.add("Matthew");
        designClass.add("Sean");
        designClass.add("Erick");
        designClass.add("George");
        designClass.add("Ema");
        designClass.add("Salim");
        designClass.add("Nadia");
        designClass.add("Rachael");
        designClass.add("Roocy");

        // Create a string array of programming students
        String[] programmingStudents = {
            "Roocy", "Julius", "Paul", "Amanda", "Kamau",
            "Leviathan", "Sean", "Erick", "Joe", "Alejandro"
        };

        // Create a set from the programming Students string array
        Set<String> programmingClass = new HashSet<>(Arrays.asList(programmingStudents));

        // Combine all the students in the institution into a single set
        Set<String> allStudents = new HashSet<>(designClass);

        // Also add students from the programming class
        allStudents.addAll(programmingClass);

        // Display all the students in the design class
        displayDesignStudents(designClass);
        // Display all the students in the programming class
        displayProgrammingStudents(programmingClass);
        // Display all the students in the institution
        displayAllStudents(allStudents);
    }

    private static void displayDesignStudents(Set<String> designClass)
    {
        // Display the student details using a for...each loop
        System.out.printf("\nThe design class has %d students and their names are:\n", designClass.size());

        for (String student : designClass)
        {
            System.out.println(student);
        }
    }

    private static void displayProgrammingStudents(Set<String> programmingClass)
    {
        // Display the names of the students in the programming class using functional programming
        System.out.printf("\nThe programming class has %d students and their names are:\n", programmingClass.size());
        programmingClass.forEach((studentName) ->
        {
            System.out.println(studentName);
        });
    }

    private static void displayAllStudents(Set<String> allStudents)
    {
        // Display the names of all the students in the campus/institution using an iterator
        Iterator<String> itrAllStudents = allStudents.iterator();
        System.out.printf("\n\nThere are %d students in the entire campus and their names are:\n", allStudents.size());
        while (itrAllStudents.hasNext())
        {
            System.out.println(itrAllStudents.next());
        }
    }
}
