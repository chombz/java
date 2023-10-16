package com.chombz.j10_inheritance;

/**
 * Java Abstract class that will be used at the super/parent class
 * for all shapes.
 * 
 * @author chomb
 */
public abstract class Shape 
{
    /**
     *  This method is to be implemented by the various subclasses
     * to display their dimensions
     * 
     * @param shapeName String value holding the name whose dimensions are to
     * be displayed. 
     */
    public abstract void displayDimensions(String shapeName);
}
