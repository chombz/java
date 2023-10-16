package com.chombz.j06_classes;

/**
 * Java program that will be used to create Rectangle objects.
 *
 * @author chomb
 */
public class Rect
{

    //variables
    private int length;
    //variables
    private int width;

    //constructors
    public Rect()
    {
    }

    public Rect(int length, int width)
    {
        this.length = length;
        this.width = width;
    }

    /**
     * @return the length
     */
    public int getLength()
    {
        return length;
    }

    /**
     * @param length the length to set
     */
    public void setLength(int length)
    {
        this.length = length;
    }

    /**
     * @return the width
     */
    public int getWidth()
    {
        return width;
    }

    /**
     * @param width the width to set
     */
    public void setWidth(int width)
    {
        this.width = width;
    }

    public int calcArea()
    {
        return this.width * this.length;
    }

    public int calcPerimeter()
    {
        return 2 * (this.width + this.length);
    }

    public void displayDimension()
    {
        System.out.printf("\nRectangles Dimensions"
                + "\n--------------------------"
                + "\nLength: %d cm."
                + "\nWidth: %d cm."
                + "\nArea: %d cm."
                + "\nPerimeter: %d cm."
                + "\n--------------------\n",
                this.length, this.width,
                this.calcArea(), this.calcPerimeter());
    }

}
