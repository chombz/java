package com.chombz.j03_variables_operators;

/**
 * Java program to demonstrate logical operators
 *   in java 
 * @author e.chomba
 */
public class LogicalOperators
{

    /**
     * main method begins program execution
     */
    public static void main(String[] args)
    {
        // variables to be used in the program
        boolean firstCondition = false, secondCondition =true;
        boolean item_A = true;
        
        //dispaly the various logical operators
        System.out.println("Illustrate the various Java logical operators");
        System.out.println("_____________________________________________");
        System.out.printf("!%b results in %b\n" ,firstCondition,(!firstCondition));
        System.out.printf("!%b results in %b\n" ,secondCondition, (!secondCondition));
        System.out.printf("%b & %b results in %b\n" ,firstCondition, secondCondition,
                         (firstCondition & secondCondition));
        System.out.printf("%b & %b results in %b\n" ,secondCondition, item_A,
                           (secondCondition & item_A));
    }
    
}
