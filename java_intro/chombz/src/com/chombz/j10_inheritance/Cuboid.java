package com.chombz.j10_inheritance;

/**
 *
 * @author chomb
 */
public class Cuboid extends Rectangle
{

    //Instance field
    private int breadth;

    public Cuboid()
    {
    }

    /**
     * Initialize a cuboid with the values passed in as a parameter
     *
     * @param length integer value holding the length of the rectangle
     * @param width integer value holding the width of the rectangle
     * @param breadth integer value holding the breadth of the rectangle
     */
    public Cuboid(int length, int width, int breadth)
    {
        super(length, width);
        this.breadth = breadth;
    }

    public int getBreadth()
    {
        return breadth;
    }

    public void setBreadth(int breadth)
    {
        this.breadth = breadth;
    }

    // Correct the calculation of surface area
    private int calcSurfaceArea()
    {
        return 2 * (super.getLength() * super.getWidth() + super.getWidth() * breadth + super.getLength() * breadth);
    }

    private int calcVolume()
    {
        return super.getLength() * super.getWidth() * breadth;
    }

    @Override
    public void displayDimensions(String shapeName)
    {
        System.out.printf("\n%s's Dimensions"
                + "\n------------------------"
                + "\nLength: %d cm."
                + "\nWidth: %d cm."
                + "\nBreadth: %d cm."
                + "\nSurface area of the cuboid: %d cm2."
                + "\nVolume of the cuboid: %d cm3."
                + "\n------------------------\n",
                shapeName, super.getLength(), super.getWidth(), breadth, calcSurfaceArea(), calcVolume());
    }
}
