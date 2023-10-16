package com.chombz.j16_streamapi;

import com.chombz.j08_strings_and_arrays.Person;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Java program to perform various operations on a list of persons depending on
 * the required criteria using the imperative way(Java 7 and below)
 *
 * @author chomb
 */
public class PersonListImperative
{

    //main method begins program execution
    public static void main(String[] args)
    {
        //Create an Array-List of Persons
        ArrayList<Person> psn = new ArrayList<>();

        //Initiate a list manually by adding Person to it
        psn.add(new Person("John", 'M', (byte) 22));
        psn.add(new Person("Percy", 'M', (byte) 30));
        psn.add(new Person("Belinda", 'M', (byte) 24));
        psn.add(new Person("Mark", 'M', (byte) 28));
        psn.add(new Person("Alvin", 'M', (byte) 22));
        psn.add(new Person("Victor", 'M', (byte) 21));
        psn.add(new Person("Maryam", 'M', (byte) 25));
        psn.add(new Person("Rajal", 'M', (byte) 22));
        psn.add(new Person("Sally", 'M', (byte) 24));
        psn.add(new Person("Veronica", 'F', (byte) 27));
        psn.add(2, new Person("Wanger", 'F', (byte) 34));

        //1. Create a list of Males only from the psn ArrayList
        List<Person> males = new ArrayList<>();
        for (Person male : psn)
        {
            if (male.getGender() == 'M')
            {
                males.add(male);
            }
        }

        //Display the list of males
        System.out.println("List of males in the Person List");
        for (int e = 0; e < males.size(); e++)
        {
            males.get(e).personDetails();
        }

        //Display the number of males in the list
        System.out.println("\n\nNumber of males in the person list is: "
                + males.size());

        //2. Create a list of peson's whose names contains letter 'a'
        List<Person> namesWith_A = new ArrayList<>();
        for (Person person : psn)
        {
            if (person.getName().contains("a"))
            {
                namesWith_A.add(person);
            }

            //Sort the list of persons whose names contains an 'a'
            Collections.sort(namesWith_A, new SortByName());
        }

        //Display the list of persons whose names contains an 'a'
        System.out.println("\n\nList of persons whose name conatins an \'a\'");
        for (int e = 0; e < namesWith_A.size(); e++)
        {
            namesWith_A.get(e).personDetails();
        }

        // Display the number of persons whose names contain 'a' in the list
        System.out.println("\nNumber of persons whose names contain 'a' is: " + namesWith_A.size());
    }
}

class SortByName implements Comparator<Person>
{

    @Override
    public int compare(Person p1, Person p2)
    {
        return p1.getName().compareTo(p2.getName());
    }
}
