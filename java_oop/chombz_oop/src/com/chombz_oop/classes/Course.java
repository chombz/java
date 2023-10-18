package com.chombz_oop.classes;

/**
 * Java Class that will be used to create course Objects
 * @author chomb
 */
public class Course
{
    private String courseCode;
    private String courseName;
    private float fee;
    private int Duration;
    
    public Course()
    {
    }

    public Course(String courseCode, String courseName, float fee, int Duration)
    {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.fee = fee;
        this.Duration = Duration;
    }
    
    

    public String getCourseCode()
    {
        return courseCode;
    }

    public void setCourseCode(String coureseCode)
    {
        this.courseCode = courseCode;
    }

    public String getCourseName()
    {
        return courseName;
    }

    public void setCourseName(String courseName)
    {
        this.courseName = courseName;
    }

    public float getFee()
    {
        return fee;
    }

    public void setFee(float fee)
    {
        this.fee = fee;
    }
    
    public int getDuration()
    {
        return Duration;
    }

    public void setDuration(int Duration)
    {
        this.Duration = Duration;
    }
    
    
    @Override
    public String toString()
    {
        return String.format("\n~~~~~~~~~~~~~~~~~~~~~~~"
                            + "\nCourse Code: %s"
                            + "\nCourse Name: %s"
                            + "\nCourse Fee: %s"
                            + "\nCourse Duration in Months: %d"
                            + "\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n",
                            this.getCourseCode(), this.getCourseName(), 
                            this.getFee(), this.getDuration());
    }
}
