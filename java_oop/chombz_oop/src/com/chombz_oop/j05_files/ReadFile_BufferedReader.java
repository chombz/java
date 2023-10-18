package com.chombz_oop.j05_files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.net.URL;

/**
 * Java program that demonstrates how to read file contents using the methods of 
 * the Buffered reader class
 * @author chomb
 */
public class ReadFile_BufferedReader
{
    //Create a URL object to hold the relative path to the file to be read
    protected URL url2File = this.getClass().
              getResource("../files/read_only_file.txt");
    
    //Main method begins with program excution
    public static void main(String[] args)
    {
      //use a try.....with resources to auto close resoureces
        try(BufferedReader bReader = new BufferedReader(new FileReader(
                                     new File(new ReadFile_BufferedReader().
                                     url2File.getPath()))))
        {
            //Display the contents of the file
            System.out.println("The contents of the file are: ");
            String str;//Stores the contents of an entire linw of text
            int e = 1;//line counter
            while((str = bReader.readLine()) != null)
            {
                System.out.printf("Line %d %s\n", e, str);
                e++;//Incriment the line counter
            }
        }
        catch (FileNotFoundException fne)
        {
            System.out.println("Sorry the file was not found. "
                                  + "\nPlease try again");
        }
        catch (Exception e)
        {
                    System.err.println(e.getLocalizedMessage());
        }
         
    }
        
}  

