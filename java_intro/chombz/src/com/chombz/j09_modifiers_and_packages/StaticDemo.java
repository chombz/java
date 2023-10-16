package com.chombz.j09_modifiers_and_packages;

/**
 * Java program to demonstrate working with static class members i.e methods,
 * variables and static blocks.
 *
 * @author chomb
 */
public class StaticDemo
{

    //static/class variable
    public static int classCounter = 0;

    //instance variable
    private int objectCounter = 0;

    //main method begins program function
    public static void main(String[] args)
    {
        //Invoke a class/static method
        staticMethod();//Called without an instance since its static

        //Declare and instantiate the first StaticDemo object
        StaticDemo sd1 = new StaticDemo();
        sd1.incrementCounters();

        //Declare and instantiate the second StaticDemo object
        StaticDemo sd2 = new StaticDemo();
        sd2.incrementCounters();

        //Declare and instantiate the third StaticDemo object
        StaticDemo sd3 = new StaticDemo();
        sd3.incrementCounters();

    }//end of main method

    //static/class block
    static
    {
        System.out.println("Inside a static/class block.");
    }

    //static/class method
    private static void staticMethod()
    {
        System.out.println("Executed from a static/class method");
    }
    //instance method

    private void incrementCounters()
    {
        //increment the value of the class and instance counters
        classCounter++;
        this.objectCounter++;

        //Display the values of the static and instance counters
        System.out.printf("\n------------------------------------------"
                + "\nvalue of the class/static counter is : %d"
                + "\nValue of instance/object counter is : %d"
                + "\nValue of instance/object counter is : %d"
                + "\n--------------------------------------\n",
                classCounter, this.objectCounter);

    }
}
