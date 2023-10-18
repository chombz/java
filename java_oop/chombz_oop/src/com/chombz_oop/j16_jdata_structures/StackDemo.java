package com.chombz_oop.j16_jdata_structures;

import java.util.Stack;

/**
 * Java program to illustrates the java.util.Stack class and some of 
 * its methods
 * @author e.chomba
 */
public class StackDemo
{
    //Class method to create and initialise a stack object
    public static Stack getInitialisedStack()
    {
        Stack<String> stack = new Stack<>();
        //Push(add) items into the srack
        stack.push("Item 1");
        stack.push("Item 2");
        stack.push("Item 3");
        stack.push("Item 4");
        stack.push("Item 5");
        stack.push("Item 6");
        stack.push("Item 7");
        
        return stack;
    }
    
    
    
    public static void main(String[] args)
    {
        //Declare and initialised a Stack
        Stack stack = getInitialisedStack();
        
        //Display the item at the top of the stack without removing it
        System.out.println("Item at the top of the stack is " + stack.peek());
        
        //Display the position if Item 2 from the top of the stack
        System.out.println("The position of \'Item 2\' from the top is: " 
                          + stack.search("Item 2"));
        
        //Remove and display the element at the top of the stack
        System.out.println("");
    }
    
}
