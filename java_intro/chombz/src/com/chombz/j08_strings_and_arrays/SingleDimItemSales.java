package com.chombz.j08_strings_and_arrays;

import java.util.Arrays;
import java.util.Collections;

/**
 * Java class to illustrate the concept of single dimension array using a list
 * @author chomb
 */
public class SingleDimItemSales 
{
    //Create class object and primitive member arrays
    static Float[] itemPrices = {34.5f, 22.6f, 103.25f, 12.09f, 55.45f};
    static int[] itemSold = {22, 45, 67, 77};
    
    //Class method to display the item and it's price
    static void displayItemSales()
    {
        for (int e = 0; e < itemPrices.length; e++) 
        {
            System.out.printf("Item %d\t\t %.2f\t\t%d\n", e + 1, itemPrices[e],
                              itemSold[e]);
        }
    }
    
    //Class method to sort and display the prices
    static void sortAndDisplayPrices()
    {
        //sort the prices in acending order
        Arrays.sort(itemPrices);
        System.out.println("\nItem prices in acending order");
        System.out.println("ITEM\tPRICE\t\tQUANTITY SOLD");
        
        for (int e = 0; e < itemPrices.length; e++) 
        {
            System.out.printf("Item %d\t\t %.2f\n", e + 1, itemPrices[e]);
        }
        
        //Sort the prices in decending order
        Collections.reverse(Arrays.asList(itemPrices));
        //If the itemprices has not been sorted the easiest way to sort them
        //in reverse order is
        //Arrays.sort(itemPrices,Collections.reverseOrder());
        System.out.println("\nItem prices in decending order");
        System.out.println("ITEM\t\t PRICE");
        int c = 5;
        
        for(float itemPrice : itemPrices)
        {
            System.out.printf("Item %d\t\t %.2f\n", c, itemPrices);
            c--;
        }
    }
}
