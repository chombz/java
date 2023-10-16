package com.chombz.j04_selection;

import java.util.Scanner;

/**
 * Java program to demonstrate nested decisions constructs
 *
 * @author e.chomba
 */
public class SupplyApproval
{

    //class variable
    static Scanner userinput = new Scanner(System.in);

    /**
     * main program begins with program execution
     */
    public static void main(String[] args)
    {

        //variables
        String department = "Marketing";

        //check the condition of goods and reject or accept them
        System.out.println("Are the goods in good condition? "
                + "\nYes or No ->");
        String reply = userinput.next().toLowerCase();

        if (reply.equals("no"))
        {
            System.out.println("Goods should be returned to the manufacter "
                              + "or dispatcher.");
            userinput.close();
            System.exit(0);//terminate the application
        }else if (reply.equals("yes"))
        {
            System.out.println("Please enter the department the goods are to "
                              + "be dispatched to -> ");
            department = userinput.next().toLowerCase();
            userinput.close();
            
            switch (department)
            {
                case "sales":
                    System.out.println("Goods are OK and dispatched to the "
                                      + "Sales Department.");
                    break;
                
                case "marketing":
                    System.out.println("Goods are OK and dispatches to the "
                                      + "Marketing Depratment.");
                    break;
                
                case "accounts":
                    System.out.println("Goods are OK and dispatched to the "
                                      + "Accounts Department.");
                    break;
                    
                case "it":
                    System.out.println("Goods are OK and dispatched to the "
                                      + "IT Department.");
                    break;
                    
                case "adminstration":
                    System.out.println("Goods are OK and dispatched to the "
                                      + "Adminstration Department.");
                    break;
                    
                default:
                    System.out.println("Please enter a valid "
                                      + "Department.");
                    break;
            }
                
        }
        else
        {
            System.out.println("Sorry you entered " + reply +
                       "\nPlease enter \"Yes\"No\"on the condition of "
                            + "Life goods.");
            userinput.close();
        }
        
    }
}
