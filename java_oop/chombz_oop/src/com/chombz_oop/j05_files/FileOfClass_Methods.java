package com.chombz_oop.j05_files;

import java.io.File;
import java.net.URL;

/**
 * Java program to demonstrate the various methods in the java.io file class
 * @author chomb
 */
public class FileOfClass_Methods
{
    //Create a URL object to hold the relative path to the file to be read
    protected URL url2File = this.getClass()
            .getResource("../files/read_only_file.txt");
    
    //Main method begins with program excution
    public static void main(String[] args)
    {
        //Use try...with resources to auto close resources
        File readFile = null; 
        try
        {
            readFile = new File(new FileOfClass_Methods().url2File.getPath());
            
            //Display some propertties of the "read-only-file.txt" file
            System.out.println("Properties of the " + readFile.getName() + 
                               " file."
                               + "\n~~~~~~~~~~~~~~~~~~~~~~~~~~"
                                       
                               + "\nIf the File\'s been found -> " 
                               + readFile.exists()
                    
                               + "\nPath to the File -> " 
                               + readFile.getAbsolutePath()
                               
                               + "\nName of the File in Bytes -> " 
                               + readFile.length()
                    
                               + "\nWheather it\'s file -> " + readFile.isFile()
                    
                               + "\nWheather it\'s a folder -> " 
                               + readFile.isDirectory()
                    
                               + "\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        }
        catch(Exception e)
        {
                    System.out.println("Sorry the file was not found. "
                                  + "\nPlease try again");
        }
    }
}
