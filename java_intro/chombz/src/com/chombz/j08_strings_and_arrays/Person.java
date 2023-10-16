package com.chombz.j08_strings_and_arrays;

/**
 * Represents a person with name, gender, and age attributes.
 */
public class Person
{

    private String name;
    private char gender;
    private byte age;

    public Person(String name, char gender, byte age)
    {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public char getGender()
    {
        return gender;
    }

    public void setGender(char gender)
    {
        this.gender = gender;
    }

    public byte getAge()
    {
        return age;
    }

    public void setAge(byte age)
    {
        this.age = age;
    }

    public void personDetails()
    {
        System.out.printf("Person's Details\n"
                + "~~~~~~~~~~~~~~~~~~~~~~~\n"
                + "Name: %s\n"
                + "Age: %d\n"
                + "Gender: %s\n"
                + "~~~~~~~~~~~~~~~~~~~~~~~\n",
                this.getName(), this.getAge(),
                this.getGender() == 'M' ? "Male" : "Female");
    }

    @Override
    public String toString()
    {
        return String.format("Person's Details\n"
                + "~~~~~~~~~~~~~~~~~~~\n"
                + "Name: %s\n"
                + "Age: %d\n"
                + "Gender: %s\n"
                + "~~~~~~~~~~~~~~~~~~~\n",
                this.getName(), this.getAge(),
                this.getGender() == 'M' ? "Male" : "Female");
    }
}
