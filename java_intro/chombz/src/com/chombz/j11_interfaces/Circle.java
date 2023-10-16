package com.chombz.j11_interfaces;

import com.chombz.j10_inheritance.Shape;

/**
 * Java class that will be used to create Circle objects
 *
 * @author chomb
 */
public class Circle extends Shape implements I2DShape
{

    protected int radius;

    /**
     * Create a circle with a radius of 0
     */
    public Circle()
    {
        this.radius = 0;
    }

    /**
     * Create a circle with a given radius
     *
     * @param radius the radius of the circle
     */
    public Circle(int radius)
    {
        this.radius = radius;
    }

    /**
     * Get the radius of the circle
     *
     * @return the radius
     */
    public int getRadius()
    {
        return radius;
    }

    /**
     * Set the radius of the circle
     *
     * @param radius the radius to set
     */
    public void setRadius(int radius)
    {
        this.radius = radius;
    }

    @Override
    public float calcArea()
    {
        return (float) (Math.PI * Math.pow(radius, 2));
    }

    @Override
    public float calcPerimeter()
    {
        return (float) (2 * Math.PI * radius);
    }

    public float calcCircumference()
    {
        return calcPerimeter();
    }

    public void displayDimensions(String shapeName)
    {
        System.out.printf("%s's Dimensions\n", shapeName);
        System.out.println("---------------------");
        System.out.printf("Radius of the Circle: %d cm\n", this.getRadius());
        System.out.printf("Area of the Circle: %.2f cm2\n", this.calcArea());
        System.out.printf("Circumference of the Circle: %.2f cm\n", this.calcCircumference());
        System.out.println("---------------------");
    }
}