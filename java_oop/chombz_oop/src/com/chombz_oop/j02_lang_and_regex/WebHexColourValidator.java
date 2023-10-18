package com.chombz_oop.j02_lang_and_regex;

import java.util.Scanner;

/**
 * Java program that accepts hexadecimal color value from the user and informs
 * them whether it's valid or not using regex
 * @author chomb
 */
public class WebHexColourValidator
{

    //Main progam begins with program execution
    public static void main(String[] args)
    {
        //]Use try...with resources
        try(Scanner userInput = new Scanner(System.in))
        {
            //Prompt the user for a colour in hexadecimal format
            System.out.println("Please enter a web colour value in"
                              + " hexadecimal format e.g. #f80 or #bada55 ->");
            String hexColour = userInput.next();
            
            //Validate the hex. colour using a regex
            if(hexColour.matches("#(([afAF\\d]{3})){1,2}"))
                System.out.printf("\n%s is a valid hexidecimal colour value.\n",
                                 hexColour);
            else
                throw(new IllegalArgumentException(hexColour));
        }
        catch(IllegalArgumentException iae)
        {
            System.err.println(iae.getLocalizedMessage() + (" is not a valid "
                                                           + "hexdecimals "
                                                           + "colour."));
        }
        catch(Exception e)
        {
            System.err.println("Sorry, the error " + e.getLocalizedMessage()
                              + " occured.");
        }
    }
    
}
