package com.chombz_oop.j04_generics;

/**
 * Java program demonstrates how to work with bound generic types and
 * generic method(s) that return values.
 * @author chomb
 */
public class BoundGenericDemo
{
    //math method begins program execution
    public static void main(String[] args)
    {
        try
        {
            Integer intArray[] =
            {
                100, 200, 300, 400, 500, 700
            };
            
            Double doubleArray[] =
            {
                51.1, 52.2, 53.3, 54.4, 55.5
            };
            
            //Declare and instanciate objects of the BoundGeneric Class
            BoundGeneric<Integer> ints = new BoundGeneric<>(intArray);
            BoundGeneric<Double> doubles = new BoundGeneric<>(doubleArray);
            
            //get the total and average of the above arrays
            long intSum = ints.getSum().longValue();
            int intMean = ints.getAverage().intValue();
            
            double doubleSum = doubles.getSum();
            double doubleMean = doubles.getAverage();
            
            //Display the values of the integer array, it's total & average
            System.out.println("The elements in the array are: ");
            GenericMethodNoReturn.displayArray(intArray);
            System.out.printf("\nThe sum of the integer array is %d and its "
                              + "average is %d. \n", intSum, intMean);
            
            //write code to display the values in the double array, its 
            //total & average
            System.out.println("\nThe elements in the array are: ");
            GenericMethodNoReturn.displayArray(doubleArray);
            
            
        }
        catch(ArithmeticException | ClassCastException aecc)
        {
            System.err.println(aecc.getLocalizedMessage());
        }
        catch(Exception e)
        {
            System.err.println(e.getLocalizedMessage());
        }
    }    
}

/**
 * Java class that illustrate bound generics. The class accepts a generic type
 * parameter form the java.lang .number class or one of its subclass
 * 
 * @author chomb
 * 
 * @param <T> an object type java.lang number or its sub classes
 */
class BoundGeneric<T extends Number>
{
    //Declare a tye T array
    T[] nums;
    public BoundGeneric()
    {
    }
    
    public BoundGeneric(T[] nums)
    {
        this.nums = nums;
    }
    
    /**
     * @return the nums
     */
    public T[] getNums()
    {
        return nums;
    }
    
    /**
     * @param nums the nums to set
     */
    public void setNums(T[] nums)
    {
        this.nums = nums;
    }
    
    public Double getSum() throws ArithmeticException
    {
        double sum = 0.00;
        for (T num : nums)
        {
            sum += num.doubleValue();
        }
        return sum;
    }
    
    public Double getAverage() throws ArithmeticException
    {
        return this.getSum() / this.nums.length;
    }
}
