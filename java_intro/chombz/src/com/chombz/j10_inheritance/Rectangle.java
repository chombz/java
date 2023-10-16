package com.chombz.j10_inheritance;

/**
 * Java class that will be used to create Rectangle objects.
 */
public class Rectangle extends Shape
{

    // Instance fields
    private int length;
    private int width;

    // Default constructor
    public Rectangle()
    {
    }

    /**
     * Creates a rectangle with dimensions passed in as parameters.
     *
     * @param length the Rectangle's dimension length as an integer.
     * @param width the Rectangle's dimension width as an integer.
     */
    public Rectangle(int length, int width)
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

    @Override
    public void displayDimensions(String shapeName)
    {
        System.out.printf("\n%s's Dimensions:\n", shapeName);
        System.out.printf("Length: %d cm\n", length);
        System.out.printf("Width: %d cm\n", width);
        System.out.printf("Area: %d square cm\n", calculateArea());
        System.out.println("------------------------");
    }

    // Additional method to calculate the area of the rectangle
    public int calculateArea()
    {
        return length * width;
    }
}
