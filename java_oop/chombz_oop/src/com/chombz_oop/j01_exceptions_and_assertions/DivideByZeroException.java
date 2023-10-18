package com.chombz_oop.j01_exceptions_and_assertions;

/**
 * Java class that demonstrate how to extend existing exceptions to create
 * user defined exceptions(s)
 * @author chomb
 */
public class DivideByZeroException extends ArithmeticException
{
    public DivideByZeroException()
    {
        super();
    }
    
    public DivideByZeroException(String str)
    {
        super(str);
    }
    
    
    public String getLocaclizedMessage()
    {
        return "Sorry, you\'ve entered 0 \'Zero\' as the denominator "
                + "which will lead to division errors.\nPlease use another "
                + "value like 5 or 2.";
    }
}
