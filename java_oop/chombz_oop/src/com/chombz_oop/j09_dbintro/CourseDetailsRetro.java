package com.chombz_oop.j09_dbintro;

import com.chombz_oop.classes.Course;
import com.chombz_oop.db_connection.SQLServer_OpenConnection;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * Java program that retrieves the course details from the course table using
 * the old try...catch...finally approach to connect & query a database
 * @author e.chomba
 */
public class CourseDetailsRetro
{
    private static final String COURSE_QUERY = "Select * from course";/*Don't do
    this in production code but write a query to get the exact records
    required or use a parameterised query. */
    
    //main method begins program exection
    public static void main(String[] args)
    {
        //Varibles
        List<Course> courses = new ArrayList<>();
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        
        //Establish a connection to the database and fetch course records
        try
        {
            conn = new SQLServer_OpenConnection().createConncetion();
            stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                                      ResultSet.CONCUR_READ_ONLY);
            rs = stmt.executeQuery(COURSE_QUERY);
            
            //process the request if a successful connection is made 
            int e = 0; //foe display purposes
            while (rs.next())
            {
                //Add a course form the resultset to the list of courses
                courses.add(new Course(rs.getString(1), rs.getString(2),
                           rs.getFloat(3), rs.getInt(4)));
                
                //Display the detials of the added course
                System.out.printf(courses.get(e).toString());
                e++;
            }//As part of your assaignment display using a stream         
        }catch(Exception e)
        {
        }
    }
}
