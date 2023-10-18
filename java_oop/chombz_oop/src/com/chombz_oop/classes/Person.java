package com.chombz_oop.classes;

import java.time.LocalDate;

/**
 * Create an abstract Person Class
 *
 * @author chomb
 */
public abstract class Person
{
    //variables
    protected String name;
    protected String nationality;
    protected LocalDate birthDate;
    protected char gender;

    
    //add constructor
    public Person(String name, String nationality, LocalDate birthDate,
            char gender)
            
    {
        this.name = name;
        this.nationality = nationality;
        this.birthDate = birthDate;
        this.gender = gender;
    }

    
    /**
     * Add getters and setters
     */
    
    /**
     * @return the name
     */
    public String getName()
    {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name)
    {
        this.name = name;
    }

    /**
     * @return the nationality
     */
    public String getNationality()
    {
        return nationality;
    }

    /**
     * @param nationality the nationality to set
     */
    public void setNationality(String nationality)
    {
        this.nationality = nationality;
    }
    
    /**
     * @return the birthDate
     */
    public LocalDate getBirthDate()
    {
        return birthDate;
    }

    /**
     * @param birthDate the birthDate to set
     */
    public void setBirthDate(LocalDate birthDate)
    {
        this.birthDate = birthDate;
    }

    /**
     * @return the gender
     */
    public char getGender()
    {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(char gender)
    {
        this.gender = gender;
    }

    
    
    
    //create abstract class
    abstract void displayDetails();
}
