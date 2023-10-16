package com.chombz.j17_more_functional;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Java program to demonstrate the use of Function<T,R>
 *
 * @author e.chomba
 */
public class FunctionalPackageDemo
{

    // main method begins program execution
    public static void main(String[] args)
    {
        Function<LocalDate, LocalDateTime> plusTwoMonths = date ->
        {
            LocalDate resultDate = date.plusMonths(2);
            return resultDate.atTime(2, 2);
        };

        // Display a given time for 10 consecutive days, 2 months from now
        System.out.println(
                Stream.iterate(LocalDate.now(), d -> d.plusDays(1))
                        .limit(10)
                        .map(plusTwoMonths)
                        .map(Object::toString)
                        .collect(Collectors.joining("\n")) // each day and time on a new line
        );
    }
}
