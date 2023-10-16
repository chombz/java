package com.chombz.j08_strings_and_arrays;

import java.util.Scanner;

/**
 * Java program that accepts the highest and lowest Temperature for each day in
 * a given week, then displays them, plus the hottest and coldest day of the
 * week.
 *
 * @author chomb
 */
public class DailyTemperature
{

    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);

        // 2D array to hold the highest and lowest temperature for each day
        float[][] dailyTemp = new float[7][2];

        // String array to hold the names of weekdays
        String[] weekdays =
        {
            "Sunday", "Monday", "Tuesday",
            "Wednesday", "Thursday", "Friday", "Saturday"
        };

        // Declare variables for the hottest and coldest temperatures and days
        float highestTemp = -1000.0f; // Initialize with a low value
        float lowestTemp = 1000.0f;  // Initialize with a high value
        int hottestDay = 0;
        int coldestDay = 0;
        float[] averageTemp = new float[7];

        // Read in the highest and lowest temperatures for each day from the user
        for (int day = 0; day < dailyTemp.length; day++)
        {
            System.out.printf("Please enter the highest temperature for %s: ", weekdays[day]);
            dailyTemp[day][0] = userInput.nextFloat();
            System.out.printf("Please enter the lowest temperature for %s: ", weekdays[day]);
            dailyTemp[day][1] = userInput.nextFloat();

            // Calculate the average temperature
            averageTemp[day] = (dailyTemp[day][0] + dailyTemp[day][1]) / 2.0f;
        }

        // Close the scanner
        userInput.close();

        // Find the hottest and coldest days
        for (int day = 0; day < dailyTemp.length; day++)
        {
            if (dailyTemp[day][0] > highestTemp)
            {
                highestTemp = dailyTemp[day][0];
                hottestDay = day;
            }
            if (dailyTemp[day][1] < lowestTemp)
            {
                lowestTemp = dailyTemp[day][1];
                coldestDay = day;
            }
        }

        // Display the results in a table format
        System.out.println("Weekly Temperature Results");
        System.out.println("--------------------------------------------------");
        System.out.printf("%-10s%-15s%-15s%-15s\n", "Day", "Highest Temp.", "Lowest Temp.", "Average Temp");

        for (int day = 0; day < dailyTemp.length; day++)
        {
            System.out.printf("%-10s%-15.2f%-15.2f%-15.2f\n", weekdays[day], dailyTemp[day][0], dailyTemp[day][1], averageTemp[day]);
        }

        // Display the hottest and coldest days
        System.out.println("--------------------------------------------------");
        System.out.printf("The hottest day was %s at %.2f degrees Celsius.\n", weekdays[hottestDay], highestTemp);
        System.out.printf("The coldest day was %s at %.2f degrees Celsius.\n", weekdays[coldestDay], lowestTemp);

    }
}
