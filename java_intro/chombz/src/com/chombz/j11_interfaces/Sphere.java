package com.chombz.j11_interfaces;

/**
 * Java class that will be used to create Sphere objects
 *
 * @author chomb
 */
public class Sphere extends Circle implements I3DShape
{

    public Sphere()
    {
        super();
    }

    public Sphere(int radius)
    {
        super(radius);
    }
    /**
     * @return
     */

    @Override
    public float calcVolume()
    {
        return (4.0f / 3) * (float) Math.PI * (float) Math.pow(this.radius, 3);
    }

    @Override
    public float calcArea()
    {
        return 4.0f * super.calcArea();
    }

    public void displayDimensions(String shapeName)
    {
        System.out.printf("%s's Dimensions\n", shapeName);
        System.out.println("---------------------");
        System.out.printf("Radius of the Sphere: %d cm\n", this.getRadius());
        System.out.printf("Volume of the Sphere: %.2f cm3\n", this.calcVolume());
        System.out.printf("Surface Area of the Sphere: %.2f cm2\n", this.calcArea());
        System.out.println("---------------------");
    }
}
