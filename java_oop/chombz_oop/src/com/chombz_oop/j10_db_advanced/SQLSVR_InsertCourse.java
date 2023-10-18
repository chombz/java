package com.chombz_oop.j10_db_advanced;

import com.chombz_oop.db_connection.SQLServer_OpenConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/**
 * Using mysql db(wont display in your system)
 *
 * @author pc
 */
public class SQLSVR_InsertCourse
{

    private static final String COURSE_QUERY = "Select * from course";

    /**
     * Method to fetch the details of a new course from the user and return them
     * as a String array
     *
     * @return
     */
    private static String[] getNewCourseDetails()
    {
        String newCourse[] = new String[4];

        //use a try with resourses to get the new course details from the user
        try (Scanner userInput = new Scanner(System.in).useDelimiter("\n"))
        {
            // Read in the course code
            System.out.println("Please enter the course code for the new course -> ");
            newCourse[0] = userInput.next();

            // Read in the course name
            System.out.println("Please enter the course name for the new course -> ");
            newCourse[1] = userInput.next();

            // Read in the course fee
            System.out.println("Please enter the course fee for the new course -> ");
            newCourse[2] = userInput.next();

            // Read in the course duration
            System.out.println("Please enter the course duration for the new course -> ");
            newCourse[3] = userInput.next();
        }
        return newCourse;
    }

    public static void main(String[] args)
    {
        // Get the details for the new course to be added to the list of courses
        String[] courseDetails = getNewCourseDetails();

        try (
                Connection conn = new SQLServer_OpenConnection().createConncetion(); 
                Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, 
            ResultSet.CONCUR_UPDATABLE
            ); 
        
        ResultSet rs = stmt.executeQuery(COURSE_QUERY))
        {
            // Move to the insert row to add the new record using the course details supplied by the user.
            rs.moveToInsertRow();

            // Add the new course details to the result set
            rs.updateString(1, courseDetails[0]);
            rs.updateString(2, courseDetails[1]);
            rs.updateFloat(3, Float.parseFloat(courseDetails[2]));
            rs.updateInt(4, Integer.valueOf(courseDetails[3]));
            rs.insertRow();

            // Inform the user that the new Course has been successfully added to the list of courses.
            System.out.printf("The course %s has been successfully added to the list of courses.\n",
                    courseDetails[1]);
        } catch (NumberFormatException nfe)
        {
            System.err.println("Sorry, the number(s) given for fee or duration are invalid.\nPlease enter valid values for the fee or duration of the course.");
        } catch (SQLException sqle)
        {
            System.err.println("Sorry, the course details were not added because " + sqle.getLocalizedMessage());
        }
    }
}
