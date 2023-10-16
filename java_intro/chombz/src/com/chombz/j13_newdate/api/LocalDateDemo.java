package com.chombz.j13_newdate.api;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/**
 * Java program to demonstrate some of the methods of the Java.time classes
 *
 * @author chomb
 */
public class LocalDateDemo
{

    //main method begins program execution
    public static void main(String[] args)
    {
        //Declare and get an instance of the LocalDate class
        LocalDate randomDate = LocalDate.of(1963, Month.DECEMBER, 12);

        //Get instaces of LocalDate 8 years before and after the randomDate
        LocalDate eightYrsB4 = randomDate.minusYears(8);
        LocalDate eightYrsAfter = randomDate.plusYears(8);

        //Display the above dates in various formats
        System.out.println("The random date is: "
                          + randomDate.format(DateTimeFormatter.
                            ofLocalizedDate(FormatStyle.FULL)));

        System.out.println("Eight years before the random date is: "
                          + eightYrsB4.format(DateTimeFormatter.
                            ofLocalizedDate(FormatStyle.LONG)));

        System.out.println("Eight years after the random date is: "
                          + eightYrsAfter.format(DateTimeFormatter.
                            ofLocalizedDate(FormatStyle.MEDIUM)));

        //Display today's date in local date format
        System.out.println("Today\'s date is: "
                          + LocalDate.now().format(DateTimeFormatter.
                            ofLocalizedDate(FormatStyle.SHORT)));

        //Extract the weekday, month, year from the randomDate
        DayOfWeek randomDay = randomDate.getDayOfWeek();
        Month randomMonth = randomDate.getMonth();
        int randomMonthDate = randomDate.getDayOfMonth();
        int randomYear = randomDate.getYear();

        //Display the details of the randomDate
        System.out.printf("The day of the week from random date was: %s\n"
                + "The date of the month from the random date was: %d\n"
                + "The month of the year from the random date was: %s\n"
                + "The year from the random date was: %d.\n",
                randomDay, randomMonthDate, randomMonth, randomYear);
    }

}
