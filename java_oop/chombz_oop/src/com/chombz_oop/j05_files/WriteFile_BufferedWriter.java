package com.chombz_oop.j05_files;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.net.URL;
import java.util.Scanner;

/**
 * Java program that demonstrates how to write string contents using to a file
 * using the methods of the BufferedWriter class
 *
 * @author chomb
 */
public class WriteFile_BufferedWriter
{

    //Create a URL object to hold the relative path to the file to be read
    protected URL url2File = this.getClass()
            .getResource("../files/read_only_file.txt");

    //Main method begins with program excution
    public static void main(String[] args)
    {
        ///use a try...with resources to auto close resourses
        try (Scanner userInput = new Scanner(System.in); BufferedWriter bfWriter = new BufferedWriter(
                new FileWriter(new File(
                        new WriteFile_BufferedWriter().url2File.getPath()), true)))
        {
            //Prompt user for a string to be written to the file
            System.out.println("Please Enter a string to be written to "
                    + "the files");
            String text2BWritten = userInput.nextLine();

            //Append the user's input to the file
            bfWriter.append(text2BWritten);
        } catch (FileNotFoundException fne)
        {
            System.out.println("Sorry the file was not found. "
                    + "\nPlease try again");
        } catch (Exception e)
        {
            System.err.println(e.getLocalizedMessage());
        }
    }
}
