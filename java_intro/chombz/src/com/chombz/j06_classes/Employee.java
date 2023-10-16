package com.chombz.j06_classes;

/**
 * Class that will be used to create Employee objects
 * @author chomb
 */
public class Employee 
{
    //objects variables 
    String employeeName;
    int employeeAge;
    double employeeSalary;
    boolean isMarried;
    
    //Objects method to display the employee details
    public void displayEmployeeDetails()
    {
        System.out.printf("Employee Details"
                         + "\n---------------------"
                         + "\nEmployee Name: %s"
                         + "\nEmployee Age: %d"
                         + "\nEmployee Salary: %f"
                         + "\nEmployee Married: %b"
                         + "\n---------------------\n",
                         this.employeeName, this.employeeAge, 
                         this.employeeSalary, this.isMarried);
    }
}
