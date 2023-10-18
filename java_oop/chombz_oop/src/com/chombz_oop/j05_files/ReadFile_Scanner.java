package com.chombz_oop.j05_files;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.Scanner;

public class ReadFile_Scanner
{

    protected URL url2File = this.getClass()
                            .getResource("../files/read_only_file.txt");

    public static void main(String[] args)
    {
        try (Scanner rScan = new Scanner(new File(new ReadFile_Scanner().url2File.getPath())))
        {
            while (rScan.hasNextLine())
            {
                String e = rScan.nextLine();
                System.out.println(e);
            }
        } catch (FileNotFoundException fne)
        {
            System.err.println("Sorry the file was not found. " + fne.getMessage());
            fne.printStackTrace();
        } catch (Exception e)
        {
            System.err.println(e.getLocalizedMessage());
        }
    }
}
