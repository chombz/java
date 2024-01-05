package test;

import javax.ejb.Remote;

/**
 * This extension interface of the addition of the calculator
 * @author e.chomba
 */
@Remote
public interface Calculator
{
    public String sayHello(String name);
    public int addition(int num1, int num2);
}
