package com.chombz_oop.j15_effective_lamda_program;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Java program that demonstrates how to use a Comparator in conjuction
 *
 * @author e.chomba
 */
public class ComparatorLambdaDemo
{

    //main method begins program execution
    public static void main(String[] args)
    {
        /**
         * Set up the Employee comparator to sort employees by their last names
         * in ascending order
         */
        Comparator<Employee> sortedEmployee = (Employee emp1, Employee emp2)
                -> emp1.getLastname().compareTo(emp2.getLastname());

        //Create a list of Employees
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Patrick", "Samuel"));
        employeeList.add(new Employee("John", "Doe"));
        employeeList.add(new Employee("Jane", "Smith"));
        employeeList.add(new Employee("Andy", "Davidson"));

        //Sort the employees using the sortedEmployee comparator
        Collections.sort(employeeList, sortedEmployee);

        //Display the sorted list of employees
        System.out.println("Employees displayed by lastname in ascending "
                + "order.");
        employeeList.forEach(emp ->
        {
            System.out.println(emp.getFirstname()
                    + emp.getLastname());
        });
    }
}

class Employee
{

    private String firstname;
    private String lastname;

    public Employee(String firstname, String lastname)
    {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public String getLastname()
    {
        return lastname;
    }

    public void setLastname(String lastname)
    {
        this.lastname = lastname;
    }

    public String getFirstname()
    {
        return firstname;
    }

    public void setFirstname(String firstname)
    {
        this.firstname = firstname;
    }
}
