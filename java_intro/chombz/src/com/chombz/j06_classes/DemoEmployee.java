package com.chombz.j06_classes;

/**
 * Java program that will be used to demonstrate the Employee class
 *
 * @author chomb
 */
public class DemoEmployee
{

    /**
     * main method begins with program execution
     */
    public static void main(String[] args)
    {
        // Employee variables
        Employee emp1, emp2;

        // Instantiate emp1 with default values
        emp1 = new Employee();
        emp1.employeeName = "Greg Donny";
        emp1.employeeAge = 37;
        emp1.employeeSalary = 880000;
        emp1.isMarried = false;

        // Instantiate emp2 with specific values
        emp2 = new Employee();
        emp2.employeeName = "Dalton Gomez";
        emp2.employeeAge = 26;
        emp2.employeeSalary = 46000000;
        emp2.isMarried = true;

        // Display employee details
        System.out.println("Employee 1 Details:");
        emp1.displayEmployeeDetails();

        System.out.println("Employee 2 Details:");
        emp2.displayEmployeeDetails();
    }
}
