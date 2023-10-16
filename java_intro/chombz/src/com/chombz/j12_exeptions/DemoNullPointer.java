package com.chombz.j12_exeptions;

/**
 * Java code to output nullpointer
 * @author chomb
 */
public class DemoNullPointer
{

    /**
     * main program begins program execution
     * @param args
     */
    public static void main(String[] args)
    {
        String userName = null;
        //Code that may throw execptions
        try
        {
            if(userName == null)
              throw new NullPointerException("Please provide us with your"
                        + " username.\n");
        } catch (NullPointerException npe)
        {
            System.err.println(npe.getLocalizedMessage());
        }
        catch(Exception e)
        {
            System.err.println("Sorry, the error " + e.getLocalizedMessage()
            + " occrured.");
        }
        
        System.err.println("Program caught NullPointerException and exited"
                + " succesfully!");
    }
    
}
