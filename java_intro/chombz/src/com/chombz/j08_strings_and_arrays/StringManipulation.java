package com.chombz.j08_strings_and_arrays;

import java.util.Scanner;

/**
 * Java program to demonstrate the various methods of the java.lang
 * @author chomb
 */
public class StringManipulation
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        //Variables to be used in the program
        String firstName = "", lastName = "";
        String beverage = "Coffee";
        Scanner userInput = new Scanner(System.in);

        //Prompt the user for their first and last names
        System.out.println("Please enter your first name ->");
        firstName = userInput.next();
        System.out.println("Please enter your last name ->");
        lastName = userInput.next();

        //Close the input stream
        userInput.close();

    
        //Display the length of the user's name
        System.out.println("There are " + firstName.length()
                          + " letters in your first name.");
        
        //Combine the user's first and last name and display them
        String fullname = firstName.concat(" ").concat(lastName);
        System.out.println("Your full name is: " + fullname);

        //Display the user's names in upper and lower case
        System.out.println("Your first name in upper case is: "
                          + firstName.toUpperCase());
        System.out.println("Your last name in lower case is: "
                          + lastName.toLowerCase());

        //Display the first 3 and last 2 letter of the user's first and
        //last names respectively
        System.out.println("The first 3 letters of your first name are: "
                          + firstName.substring(0, 3));
        System.out.println("The last 2 letters of your last name are: "
                          + lastName.substring(lastName.length() - 2, 
                            lastName.length()));

        boolean containsOff = beverage.contains("off");
        boolean endsWithFee = beverage.endsWith("fee") ;
        boolean startsWithBev = beverage.startsWith("Bev") ;

        System.out.printf("The word %s contains the word \"off\": %b.\n",
                          beverage, containsOff);
        System.out.printf("The word %s ends the letters"
                         + " \"f e e\": %b.\n", beverage, endsWithFee);
        System.out.printf("The word %s starts with the letters \"B e v\" "
                         + "%b.\n",beverage,startsWithBev);
    }
    
}
