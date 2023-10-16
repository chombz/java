package com.chombz.j08_strings_and_arrays;

import com.chombz.j06_classes.Rect;
import java.util.Scanner;

/**
 * 
 * @author chomb
 */
public class OneDimArrayRects 
{
    static Scanner userInput = new Scanner(System.in);
    /**
     * Main method begins program execution
     * @param args
     */
    public static void main(String[] args) 
    {
        //Prompt user for number of rectangles the want to create
        System.out.println("How many rectangles do want to create? ");
        int numOfRects = Integer.parseInt(userInput.next());
        
        //Declare and instantiate an array of rectangle
        Rect userRect[] = new Rect[numOfRects];
        int e = 0;//looping variable
        int len, wid;//temporal variable that will hold the rectangle's dimension
        
        //Prompt user for the dimensions of each rectangle
        for (; e < userRect.length; e++) 
        {
            System.out.printf("Please enter the length and width of rectangle"
                              + "%d\n", e + 1);
            len = userInput.nextInt();
            wid = userInput.nextInt();
            //Instantiate rectangle[e]
            userRect[e] = new Rect(len, wid);
        }
        
        //close the input stream
        userInput.close();
        
        //use a for...each loop to display each rectangle's dimensions
        for(Rect rect : userRect)
        {
            rect.displayDimension();
        }
    }
    
}
