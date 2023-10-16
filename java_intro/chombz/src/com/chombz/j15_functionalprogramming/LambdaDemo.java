package com.chombz.j15_functionalprogramming;

import java.util.Scanner;

/**
 * Java program to demonstrate imperative(Java 7 and below) and functional
 * programming(Java) 
 * @author chomb
 */
public class LambdaDemo implements IStaticDefault
{
    
    //main method begins program execution
    public static void main(String[] args)
    {
        //Using imperative programming
        System.out.println("Using the imperative apporach.");
        try
            {
                LambdaDemo demo = new LambdaDemo();
                        demo.calcResults(8, 5);
                        demo.greetUser("Edwin");
            }
            catch (ArithmeticException ae) 
            {
               System.err.println("Sorry you entered zero \'0\' as a "
                                 + "denominator which will cause "
                                 + "integer division error(s)." 
                                + "\nPlease enter a non-zero value "
                                 + "as "
                                 + "a denominator.");
            }
            catch (Exception ex) 
            { 
               System.err.println("The exception/error : " 
                                 + ex.getLocalizedMessage() 
                                 + " occured."); 
            }
        
        //Using functional programming
        System.out.println("Use the functional apporach");
        
        //Use a try...with resources to autocode resources
        try(Scanner userInput = new Scanner(System.in))
        {
            //prompt the user of two numbers to be used in division
            System.out.println("Please enter first number to be used in the "
                              +"calculation -> ");
            final int num1 = userInput.nextInt();
            System.out.println("Please enter second number to be used in the "
                              +"calculation -> ");
            final int num2 = userInput.nextInt();
            
            //Prompt the user for their name
            System.out.println("Please enter your name");
            final String username = userInput.next();
            
        //using functional programming to invoke the calcResults() 
        //and greetUSer() methods
        IStaticDefault isd = (String name) ->
        {
            System.out.println("Hello " + username + " from Java Functional "
                              + "programming");
        };
        isd.calcResults(num1, num2);
        isd.greetUser(username); 
        }
        catch(ArithmeticException ae)
        {
            System.err.println("Sorry you entered zero\'0\' as a denominator"
                              + "which will cause integer division error(s)."
                              + "\nPlease enter a non-zero value as a "
                              + "denominator");
        }
        catch(Exception e)
        {
             System.err.println("Sorry, the error " + e.getLocalizedMessage()
                                  + " occrured.");
        }
    }
    
    
    
    
    @Override
    public void greetUser(String username)
    {
        System.out.println("Hello " + username + " from Java Imperative "
                          + "programming!");
    }
}
