package com.chombz.j18_additionalfeatures;

/**
 * Java program that demonstrate some of the methods of the
 * java.lang.Math class.
 * @author e.chomba
 */
public class JavaMathClassDemo
{

    //main method begins program execution
    public static void main(String[] args)
    {
        //variables used in the program
        float positiveNum = 5.4f, negativeNum = -5.4f;
        
        //Rounding methods
        System.out.printf("A positive number, %.1f rounded up is %d.\n",
                positiveNum, (int) Math.ceil(positiveNum));
        System.out.printf("A negative number, %.1f rounded up is %d.\n",
                negativeNum, (int) Math.ceil(negativeNum));
        System.out.printf("A positive number, %.1f rounded down is %d.\n",
                positiveNum, (int) Math.floor(positiveNum));
        System.out.printf("A negative number, %.1f rounded down is %d.\n",
                negativeNum, (int) Math.floor(negativeNum));
        
        //Trigrometric methods
        System.out.printf("The value of Math.PI in degrees is %.1f%c.\n",
                Math.toDegrees(Math.PI), '\u00b0');
        System.out.printf("The sine of 45%c degrees is %.1f.\n",
                '\u00b0', Math.sin(45.0));
        System.out.printf("The cosine of 45%c degrees is %.1f.\n",
                '\u00b0', Math.cos(45.0));
        System.out.printf("The tangent of 45%c degrees is %.1f.\n",
                '\u00b0', Math.tan(45.0));
        
        //Random number generation
        System.out.println("Some 10 random numbers between 0 - 100 ");
        for (int e = 0; e < 10; e++)
        {
            System.out.printf("%d\n", (int)(Math.random() * 100));
        }
        
    }
    
}
