package com.chombz.j16_streamapi;

import com.chombz.j08_strings_and_arrays.Person;
import java.util.ArrayList;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.IntSummaryStatistics;




/**
 * Java program to perform various operations on a list of persons depending on 
 * the required criteria using the declarative way(Java 7 and below)
 * @author chomb
 */

public class PersonDeclarative
{

    //main program
    public static void main(String[] args)
    {
        //Create an Array-List of Persons
        ArrayList<Person> psn = new ArrayList<>();
        
        //Initiate a list manually by adding Person to it
        psn.add(new Person("John", 'M',(byte) 22));
        psn.add(new Person("Percy", 'M',(byte) 30));
        psn.add(new Person("Belinda", 'M',(byte) 24));
        psn.add(new Person("Mark", 'M',(byte) 28));
        psn.add(new Person("Alvin", 'M',(byte) 22));
        psn.add(new Person("Victor", 'M',(byte) 21));
        psn.add(new Person("Maryam", 'M',(byte) 25));
        psn.add(new Person("Rajal", 'M',(byte) 22));
        psn.add(new Person("Sally", 'M',(byte) 24));
        psn.add(new Person("Veronica", 'F',(byte) 27));
        psn.add(2, new Person("Wanger", 'F',(byte) 34));
        
        
        //1. Create a list of Males only from the psn ArrayList
        List<Person> onlyMales = psn.stream()
                    .filter(male -> male.getGender() == 'M')
                    .collect(Collectors.toList());
        
        //Display list of names
        onlyMales.forEach(System.out::println);
        
        //Display the number of males in the list
        System.out.println("Number of males in the person list: " 
                          + onlyMales.size());
        
        
        //2. Create a list of peson's whose names contains letter 'a'
        List<Person> namesWith_A = psn.stream()
                    .filter(name -> name.getName().contains("a"))
                    .sorted(Comparator.comparing(Person::getName).reversed())
                    .collect(Collectors.toList());
        
        //Display the list of the person whose names contains an 'a'
        System.out.println("\n\nList of persons whose name contains an \'a\'");
        namesWith_A.forEach(System.out::println);
        
        
        //3. Create a list of females from youngest to oldest
        List<Person> femalesInAscendingOrder = psn.stream()
                .filter(female -> female.getGender() == 'F')
                .sorted(Comparator.comparing(Person::getAge))
                .collect(Collectors.toList());

        //Display the list of females from youngest to oldest
        System.out.println("\n\nList of of females from youngest to oldest.");
        femalesInAscendingOrder.forEach(System.out::println);
        
        
        //4. Create a list of Intergers to hold the person's ages
        List<Integer> personAge = new ArrayList<>();
        psn.forEach(person -> 
        {
            personAge.add((int )person.getAge());
        });
        
        //Create a IntSummaryStatistics objest
        IntSummaryStatistics ageSummary = personAge.stream()
                    .mapToInt(Integer::intValue)
                    .summaryStatistics();
        
        //Display the age summary statistics
        System.out.printf("The oldest person is %d years old.\n",
                ageSummary.getMax());
        System.out.printf("The youngest person is %d year old.\n",
                ageSummary.getMin());
        System.out.printf("The total/sum of all ages is %d years.\n",
                ageSummary.getSum());
        System.out.format("The average age of the group is %.1f years.\n",
                ageSummary.getAverage());
        System.out.format("There\'re %d persons in the group/list of"
                + " persons.\n",ageSummary.getCount());
    }
    
}
