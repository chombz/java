package com.chombz_oop.j03_collections;

import com.chombz_oop.classes.Student;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Java program to demonstrate the list interfaces, its implementation and some
 * of it's methods
 * @author e.chomba
 */
public class ListDemo
{
    //main program begins program excution
    public static void main(String[] args)
    {
       //Primitives & objects to be used in the program
        int e = 0;
        List<Student> sem2ADSE = new ArrayList<>();
        
        //Enroll students into the sem2ADE batch
        sem2ADSE.add(new Student("EICN-1001", "ADSE", "Jane Doe", "Kenyan",
                                LocalDate.of(1992, Month.APRIL, 27), 'F'));
        
        sem2ADSE.add(new Student("EICN-1002", "ADSE", "Aaron Kamau", "Kenyan",
                                LocalDate.of(2000, Month.DECEMBER, 31), 'M'));
        sem2ADSE.add(new Student("EICN-1003", "ADSE", "Eunice Wanjiku", "Kenyan",
                                LocalDate.of(2002, Month.SEPTEMBER, 2), 'F'));
        
        sem2ADSE.add(new Student("EICN-1004", "ADSE", "Mariam Dahir", "Kenyan",
                                LocalDate.of(1998, Month.MARCH, 14), 'F'));
        sem2ADSE.add(new Student("EICN-1005", "ADSE", "Fatuma Abdi", "Kenyan",
                                LocalDate.of(2002, Month.JANUARY, 1), 'F'));
        
        sem2ADSE.add(new Student("EICN-1006", "ADSE", "Victor Ahmed", "Kenyan",
                                LocalDate.of(2002, Month.FEBRUARY, 9), 'M'));
        sem2ADSE.add(new Student("EICN-1007", "ADSE", "Francis Nyagoma", "Kenyan",
                                LocalDate.of(2000, Month.JUNE, 14), 'M'));
        
        sem2ADSE.add(new Student("EICN-1008", "ADSE", "Fred Mwaura", "Kenyan",
                                LocalDate.of(1998, Month.OCTOBER, 5), 'M'));
        sem2ADSE.add(new Student("EICN-1009", "ADSE", "Chealsea Peters", "British",
                                LocalDate.of(1995, Month.AUGUST, 8), 'F'));
        
        sem2ADSE.add(new Student("EICN-1010", "ADSE", "Vincent Kigei", "Kenyan",
                                LocalDate.of(1990, Month.JUNE, 30), 'M'));
        sem2ADSE.add(new Student("EICN-1011", "ADSE", "Sharon Kipkemie", "British",
                                LocalDate.of(1995, Month.APRIL, 15), 'F'));
        
        sem2ADSE.add(new Student("EICN-1012", "ADSE", "Jonathan Johnson", "USA",
                                LocalDate.of(1987, Month.MAY, 5), 'M'));
        sem2ADSE.add(new Student("EICN-1013", "ADSE", "William Swift", "USA",
                                LocalDate.of(1994, Month.OCTOBER, 10), 'M'));
        
        
        
        //Display the number of students enrolled in the class
        System.out.println("The number of students enrolled for the ADSe course"
                          + " is " + sem2ADSE.size());
        
        //Display a list of the students in the class using a for iterator
        for(Iterator<Student> itrStudent = sem2ADSE.iterator(); 
                              itrStudent.hasNext();)
        {
            Student stud = itrStudent.next();
            System.out.println("Displaying the details for student " + (++e)
                              + "\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            stud.displayDetails();
        }
        
        ///2 students drop the course....remove the students from the list
        sem2ADSE.remove(6);
        sem2ADSE.remove(12);
        
        //Display the number of students remaining in the class
        System.out.println("The number of students left in the ADSE course"
                          + " is " + sem2ADSE.size());
    }
    
}
