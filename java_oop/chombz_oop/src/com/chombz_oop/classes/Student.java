package com.chombz_oop.classes;

import java.time.LocalDate;

/**
 * Create Students
 *
 * @author e.chomba
 */
public class Student extends Person
{

    //Variables
    String studentNumber;
    String course;

    //add all 6 constructors
    public Student(String studentNumber, String course, String name,
            String nationality, LocalDate birthDate, char gender)
    {
        super(name, nationality, birthDate, gender);
        this.studentNumber = studentNumber;
        this.course = course;
    }

    /**
     * Add getters and setters
     *
     * @return
     */
    public String getStudentNumber()
    {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber)
    {
        this.studentNumber = studentNumber;
    }

    public String getCourse()
    {
        return course;
    }

    public void setCourse(String course)
    {
        this.course = course;
    }

    @Override
    //Display Student's details
    public void displayDetails()
    {
        System.out.printf("Students details"
                + "\nName: %s"
                + "\nNationality: %s"
                + "\nBirth-Date: %s"
                + "\nGender: %s"
                + "\nStudent-Number: %s"
                + "\nCourse: %s",
                this.getName(), this.getNationality(), this.getBirthDate(),
                this.getGender(), this.getStudentNumber(), this.getCourse());
    }
}
