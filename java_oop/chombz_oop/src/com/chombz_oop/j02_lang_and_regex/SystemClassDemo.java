package com.chombz_oop.j02_lang_and_regex;

import java.util.Arrays;
import java.util.Locale;

/**
 * Java program that demonstrate same of the properties and method of 
 * the java.lang.System class
 * @author chomb
 */
public class SystemClassDemo
{
    //Main progam begins with program execution
    public static void main(String[] args)
    {
        //Create two float arrays
        float newPrices[] = {5f, 7f, 8f};
        float oldPrices[] = {22.5f, 32.0f, 54.8f, 34.9f};
        
        //Display the contents of the newPrices array
        System.out.printf("The contents of the newPrices array are: ");
        
        for (int e = 0; e < newPrices.length; e++)
        {
            if(e < newPrices.length -1)
                System.out.printf("%.2f, ", newPrices[e]);
            else
                System.out.printf("and %.2f\n", newPrices[e]);
        }
        
        //Display the contents of the oldPrices array
        System.out.printf("The contents of the newPrices array are: ");
        
        for (int e = 0; e < oldPrices.length; e++)
        {
            if(e < newPrices.length -1)
                System.out.printf(e < oldPrices.length - 1? "%.2f, " :
                                   "and %.2f\n", oldPrices[e]);
        }
        
        /*Copy and replace some of the values in the oldPrices array
        with values form the new{rices array*/
        System.arraycopy(newPrices, 0, oldPrices, 1, 2);
        
        //Display the new contents of the oldPrices array
        System.out.println("Contents of the oldPrices array after modifications"
                          + " are: \n" + Arrays.toString(oldPrices));
        
        //Get some System(OS) values via the System class
        String operatingSystem = System.getProperty("os.name");
        String currentUser = System.getProperty("user.name");
        String currentDirectory = System.getProperty("user.dir");
        String userCountry = Locale.getDefault().getCountry();
        
        //Display the above details
        System.out.printf("\nUser and System details"
                         + "\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"
                         + "\nUser\'s Name: %s"
                         + "\nOperating System: %s"
                         + "\nUser\'s current directory: %s"
                         + "\nUser\'s country: %s"
                         + "\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n",
                         currentUser, operatingSystem, currentDirectory, 
                         userCountry);
        
    }
    
}
