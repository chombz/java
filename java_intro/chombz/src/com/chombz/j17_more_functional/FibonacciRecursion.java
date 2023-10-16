package com.chombz.j17_more_functional;

import java.util.function.IntUnaryOperator;
import java.util.stream.IntStream;

/**
 * Java program to demonstrate recursion using streams. The program displays the
 * first 15 Fibonacci numbers using a recursive function.
 *
 * @author e.chomba
 */
public class FibonacciRecursion
{

    static IntUnaryOperator fibonacci;

    public static void main(String[] args)
    {
        System.out.println("The first 15 Fibonacci numbers: ");
        IntStream.range(0, 15) // Specify how many Fibonacci numbers you want
                .map(fibonacci = f ->
                {
                    if (f <= 1)
                    {
                        return f;
                    } else
                    {
                        return fibonacci.applyAsInt(f - 2) + fibonacci.applyAsInt(f - 1);
                    }
                })
                .forEachOrdered(g -> System.out.printf("%s ", g));

        System.out.println(); // new blank line
    }
}
