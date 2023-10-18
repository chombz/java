package com.chombz_oop.db_connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Java class that will be used to establish a connection to an 
 * instance of MS-SQL Server
 * @author chomb
 */
public class SQLServer_OpenConnection
{
  //Class constants that will be used to create the connection String
  private static final String DBURL = "jdbcsqlserver://SQLSERVER\\SQLSVR2;"
                                    + "databaseaName=Edwin_College_2105";
  private static final String USERNAME = "Java_OOP";
  private static final String PASSWORD = "Password@123#";
  
  public SQLServer_OpenConnection()
  {
  }
  
  public Connection createConncetion()
  {
      Connection conn = null;
      try
      {
          conn = DriverManager.getConnection(DBURL, USERNAME, USERNAME);
      }
      catch(SQLException sqle)
      {
          System.err.println("Sorry the connection to the database failed "
                            + "due to " + sqle.getLocalizedMessage());
          System.err.println("Please verify that the database server is "
                            + "running, the connection parameters are "
                            + "correct and then try again.");
      }
      return conn;
  }
}
