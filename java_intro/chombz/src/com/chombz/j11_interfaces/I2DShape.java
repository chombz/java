package com.chombz.j11_interfaces;

/**
 * Java Interface that defines methods for calculating properties of 2-D shapes.
 * All 2-D shapes implementing this interface must provide these methods.
 *
 * @author chomb
 */
public interface I2DShape
{

    /**
     * Calculate the area of the 2-D shape.
     *
     * @return The area of the shape as a float.
     */
    float calcArea();

    /**
     * Calculate the perimeter of the 2-D shape.
     *
     * @return The perimeter of the shape as a float.
     */
    float calcPerimeter();

    /**
     * Calculate the circumference of the 2-D shape.
     *
     * @return The circumference of the shape as a float.
     */
    float calcCircumference();
}
