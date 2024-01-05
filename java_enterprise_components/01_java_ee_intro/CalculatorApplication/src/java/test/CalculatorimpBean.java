package test;

import javax.ejb.Stateless;
import javax.ejb.LocalBean;

/**
 * Stateless session bean that implements the Calculator interface.
 * @author e.chomba
 */
@Stateless
@LocalBean
public class CalculatorimpBean implements Calculator
{

    @Override
    public String sayHello(String name)
    {
        return("Welcome to EJB" + name);
    }    

    /**
     * Calculates and returns the sum of the two integers passed in as
     * parameters
     * @param num1
     * @param num2
     * @return 
     */
    
    
    
    @Override
    public int addition(int num1, int num2)
    {
        return (num1 + num2);
    }
 }
