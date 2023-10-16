package com.chombz.j17_more_functional;

import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * Java program that demonstrates currying and function composition.
 *
 * @author e.chomba
 */
public class JavaCarryDemo
{

    // Definition of carryFunction()
    public void carryFunction()
    {
        // Create a BiFunction that accepts 2 integers and returns an integer
        BiFunction<Integer, Integer, Integer> adder = (x, y) -> x + y;
        Function<Integer, Function<Integer, Integer>> currier = x -> y
                -> adder.apply(x, y);
        Function<Integer, Integer> curried = currier.apply(5);

        // Display the results
        System.out.printf("Curry: %d\n", curried.apply(2));
    }

    // Function to display the result + 4
    public void compose()
    {
        Function<Integer, Integer> addFour = (x) -> x + 4;

        // Function to add the result with * 5
        Function<Integer, Integer> timesFive = x -> x * 5;

        // Function to multiply a number passed in by 5 then add four to it
        Function<Integer, Integer> compose1 = addFour.compose(timesFive);

        // Function to add a number then multiply it by five
        Function<Integer, Integer> compose2 = timesFive.compose(addFour);

        // Display the end results
        System.out.printf("Times then add: %d\n", compose1.apply(7)); // (7 x 5) + 4
        System.out.printf("Add then times: %d\n", compose2.apply(7));  // (7 + 4) x 5
    }

    // Main program begins with program execution
    public static void main(String[] args)
    {
        // Create instances of JavaCurryingClass and invoke the 
        // curry and compose methods
        new JavaCarryDemo().carryFunction();
        new JavaCarryDemo().compose();
    }
}
