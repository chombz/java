package com.chombz_oop.classes;

/**
 * Java class that will be used to create circle objects.
 * @author chomb
 */
public class Circle
{
    protected int radius;

    /**
     * Create a circle with a radius of 0
     */
    public Circle()
    {
    }

    /**
     * Create a circle with a radius of the parameter passed in
     *
     * @param radius value holding the circles radius as an integer.
     */
    public Circle(int radius)
    {
        this.radius = radius;
    }

    /**
     * @return the radius
     */
    public int getRadius()
    {
        return radius;
    }

    /**
     * @param radius the radius to set
     */
    public void setRadius(int radius)
    {
        this.radius = radius;
    }
    
    public float calcArea()
    {
        return (float)(Math.PI * Math.pow(radius, 2));
    }

    public float calcPerimeter()
    {
        return 0.0f;
    }
    
    public float calcCircumference()
    {
        return (float)(Math.PI * (radius * 2));
    }
        
    public void displayDimensions(String shapeName)
    {
        System.out.printf("\n%s\'s Dimensions"
                + "\n-------------------------------"
                + "\nRadius: %d cm."
                + "\nArea of the circle %.3f cm2."
                + "\nCircumference of the circle %.2f cm."
                + "\n-------------------------------\n",shapeName,
                this.getRadius(), this.calcArea(),
                this.calcCircumference());
    }
}
