package test;

import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 *  Display the calculator 
 * @author e.chomba
 */
public class Main
{
    public static void main(String[] args)
    {
        //Objects to be used in the application
        try
        {
            InitialContext ic = new InitialContext();
            Object obj = ic.lookup("caljndi");
            Calculator calc = (Calculator) obj;
            
            String greeting =  calc.sayHello("chombz");
            System.out.println(greeting);
            
            int sum = calc.addition(7, 3);
            System.out.println("Sum:" + sum);
        }
        catch (NamingException ne)
        {
            System.err.println(ne.getLocalizedMessage());
        }
        catch(Exception e)
        {
            System.err.println(e.getLocalizedMessage());
        }
    }
    
}
