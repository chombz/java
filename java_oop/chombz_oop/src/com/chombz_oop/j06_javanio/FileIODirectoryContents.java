package com.chombz_oop.j06_javanio;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 * Java program that accepts a directory from the user, and displays the file(s)
 * and folder(s) in that directory/folder if it exists
 *
 * @author chomb
 */

//Class variable to hold the path to the directory/folder
public class FileIODirectoryContents
{

    //main prgram begins with program execution
    public static void main(String[] args)
    {
        //use try with resources to auto close resources after use
        try (Scanner userInput = new Scanner(System.in))
        {
            
            //Prompt the user for the desired folder
            System.out.println("Please enter the path to the directory/folder whose contents you wish to display or list -> ");
            String folderPath = userInput.next();
            Path path2Folder = Paths.get(folderPath);

            // Check if the provided path is a directory
            if (Files.isDirectory(path2Folder))
            {
                System.out.println("The contents of " + path2Folder + "\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

                try (DirectoryStream<Path> directoryStream = Files.newDirectoryStream(path2Folder))
                {
                    for (Path entry : directoryStream)
                    {
                        //Display the contents of the directory if the path is valid
                        if (Files.isDirectory(entry))
                        {
                            System.out.println("DIR: " + entry.getFileName()); // Print directory
                        } else
                        {
                            System.out.println("FILE: " + entry.getFileName()); // Print file
                        }
                    }
                } catch (IOException e)
                {
                    System.err.println("An error occurred while listing directory contents: " + e.getMessage());
                }
            } else
            {
                System.out.println("The provided path is not a directory.");
            }
        } catch (Exception e)
        {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
