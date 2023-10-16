package com.chombz.j13_newdate.api;

import java.time.LocalTime;

/**
 * Java Program to demonstrate some of the methods of the java.time classes that
 * deal with time
 * @author chomb
 */
public class LocalTimeDemo
{

    //main method begins program execution
    public static void main(String[] args)
    {
        //Declare and get an instance of the LocalTime class
        LocalTime currentTime = LocalTime.now();

        //Extract the hour, minute, seconds from the current time
        int currHour = currentTime.getHour();
        int currMinute = currentTime.getMinute();
        int currSecond = currentTime.getSecond();

        //Display the details of the current time
        System.out.printf("The current hour is : %d\n"
                         + "The current minute is: %d\n"
                         + "The current second is : %d \n",
                         currHour, currMinute, currSecond);

        //Get and display the time 5 hours ago
        LocalTime fiveHrsAgo = currentTime.minusHours(5);
        System.out.printf("The time five hours ago was %s .\n", fiveHrsAgo);

        //Get and display the time 20 minutes ago
        LocalTime twentyMinsAgo = currentTime.minusMinutes(20);
        System.out.printf("The time twenty minutes ago was %s .\n",
                           twentyMinsAgo);

        //Get and display the time 8 hours from now
        LocalTime EightHrsAfter = currentTime.plusHours(8);
        System.out.printf("The time 8 hours from now will be %s .\n",
                           EightHrsAfter);

        //Get and display the time 30 seconds from now
        LocalTime thirtySecsAfter = currentTime.plusSeconds(30);
        System.out.printf("The time thirty seconds from now will be %s .\n",
                           thirtySecsAfter);
    }

}
