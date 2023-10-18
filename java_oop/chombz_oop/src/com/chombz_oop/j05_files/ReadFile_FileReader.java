package com.chombz_oop.j05_files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.net.URL;

/**
 * Java program that demonstrates how to read file contents using the methods of 
 * the FileReader class
 * @author chomb
 */
public class ReadFile_FileReader
{
    //Create a URL object to hold the relative path to the file to be read
    protected URL url2File = this.getClass()
            .getResource("../files/read_only_file.txt");
    
    //Main method begins with program excution
    public static void main(String[] args)
    {
        //Use a try with resources to automatically close resources
        try( FileReader fReader = new FileReader(new File(
                                 new ReadFile_FileReader().url2File
                                 .getPath())))
        {
            int e;//holds the int value(s) of the characters read from the file
            while((e = fReader.read()) != -1)
            {
                //Display the contents of the file
                System.out.print((char)e);
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
